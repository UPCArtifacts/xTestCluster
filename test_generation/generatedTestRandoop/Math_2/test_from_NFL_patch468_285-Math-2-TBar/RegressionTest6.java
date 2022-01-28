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
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '4', (int) ' ', 23);
        int int4 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '#', (int) (byte) 0, 23);
        double double6 = hypergeometricDistribution4.probability(35);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        int int14 = hypergeometricDistribution3.getSupportUpperBound();
        int int15 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 0);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10, (int) (short) 10);
        double double16 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        hypergeometricDistribution3.reseedRandomGenerator(10L);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        double double14 = hypergeometricDistribution3.upperCumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (byte) 1, (int) (short) 10);
        double double6 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        boolean boolean8 = hypergeometricDistribution4.isSupportConnected();
        int int9 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSampleSize();
        double double10 = hypergeometricDistribution3.cumulativeProbability(35, (int) '#');
        int int11 = hypergeometricDistribution3.getSampleSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        int[] intArray6 = hypergeometricDistribution3.sample((int) '#');
        hypergeometricDistribution3.reseedRandomGenerator((long) 52);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = hypergeometricDistribution3.cumulativeProbability((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (97) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.upperCumulativeProbability(52);
        double double18 = hypergeometricDistribution3.upperCumulativeProbability(100);
        double double20 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        boolean boolean21 = hypergeometricDistribution3.isSupportConnected();
        int int22 = hypergeometricDistribution3.getSampleSize();
        double double24 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double26 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = hypergeometricDistribution3.inverseCumulativeProbability(1.5006002400960383d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 1.501 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.upperCumulativeProbability(52);
        boolean boolean17 = hypergeometricDistribution3.isSupportConnected();
        double double18 = hypergeometricDistribution3.getNumericalVariance();
        int int20 = hypergeometricDistribution3.inverseCumulativeProbability(0.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) 52);
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution3.sample();
        double double14 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double9 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, (int) ' ');
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) (byte) -1);
        hypergeometricDistribution3.reseedRandomGenerator(10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.cumulativeProbability(97);
        int[] intArray14 = hypergeometricDistribution3.sample((int) ' ');
        int int15 = hypergeometricDistribution3.getSampleSize();
        double double17 = hypergeometricDistribution3.cumulativeProbability(52);
        int int18 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 10, 0);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double6 = hypergeometricDistribution3.getNumericalMean();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.getNumericalMean();
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double10 = hypergeometricDistribution3.upperCumulativeProbability(32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int12 = hypergeometricDistribution3.getPopulationSize();
        int int13 = hypergeometricDistribution3.sample();
        double double14 = hypergeometricDistribution3.getNumericalVariance();
        double double15 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator((long) 10);
        double double14 = hypergeometricDistribution3.getNumericalMean();
        double double16 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double17 = hypergeometricDistribution3.getNumericalMean();
        int int18 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.getNumericalMean();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        int int12 = hypergeometricDistribution3.getPopulationSize();
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double9 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, (int) ' ');
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1, (int) '#');
        double double14 = hypergeometricDistribution3.getNumericalMean();
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        double double17 = hypergeometricDistribution3.probability((int) 'a');
        int int18 = hypergeometricDistribution3.getSupportUpperBound();
        double double19 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 10);
        double double10 = hypergeometricDistribution3.cumulativeProbability(100);
        double double12 = hypergeometricDistribution3.cumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(35, (int) (short) 1, (int) (short) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 0);
        double double7 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double9 = hypergeometricDistribution3.probability(1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        double double13 = hypergeometricDistribution3.probability((int) (short) -1);
        int int14 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        double double17 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double15 = hypergeometricDistribution3.probability((int) (byte) 1);
        double double17 = hypergeometricDistribution3.probability(30);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.sample();
        int int12 = hypergeometricDistribution3.inverseCumulativeProbability((double) (byte) 1);
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.getNumericalMean();
        int int8 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 100);
        int int12 = hypergeometricDistribution3.sample();
        int int13 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        double double5 = hypergeometricDistribution3.upperCumulativeProbability(23);
        double double7 = hypergeometricDistribution3.probability(30);
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        int int9 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSupportUpperBound();
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean16 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1.0f);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        int[] intArray14 = hypergeometricDistribution3.sample(100);
        double double16 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        hypergeometricDistribution3.reseedRandomGenerator((long) 10);
        double double20 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        int int21 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double23 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        double double12 = hypergeometricDistribution3.getNumericalMean();
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        int int14 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int15 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10, (int) (short) 100);
        double double13 = hypergeometricDistribution3.probability((int) '4');
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double17 = hypergeometricDistribution3.cumulativeProbability(10, (int) 'a');
        int int19 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        double double20 = hypergeometricDistribution3.getNumericalVariance();
        int int21 = hypergeometricDistribution3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = hypergeometricDistribution3.inverseCumulativeProbability(100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of successes (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double10 = hypergeometricDistribution3.probability((int) (byte) 1);
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 1);
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.cumulativeProbability(35);
        int int17 = hypergeometricDistribution3.getSupportUpperBound();
        int int18 = hypergeometricDistribution3.sample();
        int int19 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.cumulativeProbability(35);
        int int17 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int18 = hypergeometricDistribution3.getSupportUpperBound();
        int int19 = hypergeometricDistribution3.getSampleSize();
        int int20 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10, (int) (short) 100);
        double double13 = hypergeometricDistribution3.probability((int) '4');
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double17 = hypergeometricDistribution3.cumulativeProbability(10, (int) 'a');
        double double19 = hypergeometricDistribution3.probability(35);
        double double21 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 100);
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        int int15 = hypergeometricDistribution3.getSupportLowerBound();
        int int16 = hypergeometricDistribution3.sample();
        int int17 = hypergeometricDistribution3.getSupportUpperBound();
        double double20 = hypergeometricDistribution3.cumulativeProbability((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        boolean boolean15 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) -1);
        double double19 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        double double14 = hypergeometricDistribution3.cumulativeProbability(1);
        int int15 = hypergeometricDistribution3.getSampleSize();
        double double18 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1, 10);
        double double21 = hypergeometricDistribution3.cumulativeProbability((int) (short) 1, 97);
        double double23 = hypergeometricDistribution3.cumulativeProbability((int) (short) 0);
        int int24 = hypergeometricDistribution3.getSampleSize();
        int int25 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 0, (int) (short) 0);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (byte) 1, (int) (short) 10);
        int int5 = hypergeometricDistribution4.getSupportLowerBound();
        int int6 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        int int11 = hypergeometricDistribution4.getSampleSize();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1d + "'", double7 == 0.1d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.09d + "'", double10 == 0.09d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1.0f);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        int[] intArray14 = hypergeometricDistribution3.sample(100);
        double double16 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        int int17 = hypergeometricDistribution3.getSampleSize();
        boolean boolean18 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.sample();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        double double16 = hypergeometricDistribution3.probability(32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double10 = hypergeometricDistribution3.probability((int) (byte) 1);
        double double12 = hypergeometricDistribution3.probability((int) '#');
        double double14 = hypergeometricDistribution3.cumulativeProbability(100);
        double double16 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double17 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.sample();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.getNumericalMean();
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hypergeometricDistribution3.inverseCumulativeProbability((double) 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 97 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        java.lang.Class<?> wildcardClass15 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) '4', (int) 'a');
        int int5 = hypergeometricDistribution4.getPopulationSize();
        double double6 = hypergeometricDistribution4.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 0, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.sample();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hypergeometricDistribution3.inverseCumulativeProbability(35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 35 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(97, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.getSupportUpperBound();
        double double7 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 1);
        boolean boolean8 = hypergeometricDistribution3.isSupportConnected();
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.cumulativeProbability(97);
        double double14 = hypergeometricDistribution3.probability(30);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        double double13 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) '#', 32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (97) must be less than or equal to population size (35)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.sample();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) -1);
        int int14 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution3.getNumericalMean();
        double double16 = hypergeometricDistribution3.getNumericalMean();
        int int18 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hypergeometricDistribution3.inverseCumulativeProbability((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10, (int) (short) 100);
        double double13 = hypergeometricDistribution3.probability((int) '4');
        int int14 = hypergeometricDistribution3.getSampleSize();
        int int15 = hypergeometricDistribution3.getSampleSize();
        boolean boolean16 = hypergeometricDistribution3.isSupportConnected();
        int int17 = hypergeometricDistribution3.getSupportLowerBound();
        double double19 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        double double21 = hypergeometricDistribution3.cumulativeProbability(52);
        int[] intArray23 = hypergeometricDistribution3.sample(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        double double14 = hypergeometricDistribution3.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = hypergeometricDistribution3.sample((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) ' ', 23, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (52) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 0);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 0);
        int[] intArray11 = hypergeometricDistribution3.sample(23);
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1);
        int int14 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) 52);
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution3.sample();
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        double double16 = hypergeometricDistribution3.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.sample();
        int int12 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1);
        hypergeometricDistribution3.reseedRandomGenerator((long) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray13 = hypergeometricDistribution3.sample(10);
        int[] intArray15 = hypergeometricDistribution3.sample(1);
        int int16 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        int int19 = hypergeometricDistribution3.sample();
        double double21 = hypergeometricDistribution3.cumulativeProbability(23);
        double double22 = hypergeometricDistribution3.getNumericalVariance();
        int int23 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getSampleSize();
        int int12 = hypergeometricDistribution3.getSampleSize();
        int int13 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int[] intArray11 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        int int14 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) '4', (int) 'a');
        int int5 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        double double10 = hypergeometricDistribution4.cumulativeProbability((-1), (int) (short) 10);
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution4.probability(52);
        int int17 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) -1, (-1));
        int[] intArray15 = hypergeometricDistribution3.sample((int) ' ');
        int int16 = hypergeometricDistribution3.getSampleSize();
        int int17 = hypergeometricDistribution3.getSupportLowerBound();
        int int18 = hypergeometricDistribution3.getSupportLowerBound();
        double double20 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 0);
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double12 = hypergeometricDistribution3.probability((int) (short) 10);
        double double14 = hypergeometricDistribution3.probability(97);
        int int15 = hypergeometricDistribution3.sample();
        int int16 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0);
        int[] intArray13 = hypergeometricDistribution3.sample((int) (short) 100);
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        double double16 = hypergeometricDistribution3.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = hypergeometricDistribution3.cumulativeProbability((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (97) must be less than or equal to upper endpoint (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSampleSize();
        int int8 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) '4', (int) 'a');
        int int5 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        double double10 = hypergeometricDistribution4.cumulativeProbability((-1), (int) (short) 10);
        int int11 = hypergeometricDistribution4.getPopulationSize();
        int int13 = hypergeometricDistribution4.inverseCumulativeProbability((double) 0);
        int int14 = hypergeometricDistribution4.getNumberOfSuccesses();
        java.lang.Class<?> wildcardClass15 = hypergeometricDistribution4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.upperCumulativeProbability(52);
        boolean boolean17 = hypergeometricDistribution3.isSupportConnected();
        int int18 = hypergeometricDistribution3.getSampleSize();
        int int19 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean20 = hypergeometricDistribution3.isSupportConnected();
        int int21 = hypergeometricDistribution3.sample();
        int int22 = hypergeometricDistribution3.getSupportUpperBound();
        int[] intArray24 = hypergeometricDistribution3.sample((int) (byte) 1);
        boolean boolean25 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        int int9 = hypergeometricDistribution3.getSupportLowerBound();
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0);
        double double15 = hypergeometricDistribution3.upperCumulativeProbability(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.getNumericalMean();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        double double9 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray11 = hypergeometricDistribution3.sample((int) (short) 10);
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator((long) 10);
        int int14 = hypergeometricDistribution3.getPopulationSize();
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        int int16 = hypergeometricDistribution3.getSupportUpperBound();
        hypergeometricDistribution3.reseedRandomGenerator((long) 0);
        int int19 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) (short) 0, (int) (short) 0);
        double double5 = hypergeometricDistribution4.getNumericalMean();
        int int6 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) '4', (int) 'a');
        int int5 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.probability(52);
        int int8 = hypergeometricDistribution4.getSupportLowerBound();
        int int9 = hypergeometricDistribution4.getSupportUpperBound();
        double double11 = hypergeometricDistribution4.cumulativeProbability((int) (short) 1);
        int int12 = hypergeometricDistribution4.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        double double10 = hypergeometricDistribution3.getNumericalMean();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        int int13 = hypergeometricDistribution3.getSampleSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.probability((int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.sample();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) ' ');
        double double9 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray11 = hypergeometricDistribution3.sample(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.probability((int) (short) 100);
        double double13 = hypergeometricDistribution3.upperCumulativeProbability((-1));
        int int15 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        double double17 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0);
        int int18 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        int int11 = hypergeometricDistribution3.sample();
        hypergeometricDistribution3.reseedRandomGenerator((long) 97);
        int int14 = hypergeometricDistribution3.getSampleSize();
        int int16 = hypergeometricDistribution3.inverseCumulativeProbability(0.8999999999999996d);
        boolean boolean17 = hypergeometricDistribution3.isSupportConnected();
        int int18 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) '4', (int) 'a');
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int7 = hypergeometricDistribution4.inverseCumulativeProbability(0.1d);
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 1);
        double double10 = hypergeometricDistribution4.getNumericalVariance();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = hypergeometricDistribution4.sample((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        int int11 = hypergeometricDistribution3.sample();
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        int int11 = hypergeometricDistribution3.sample();
        hypergeometricDistribution3.reseedRandomGenerator((long) 97);
        double double14 = hypergeometricDistribution3.getNumericalVariance();
        double double16 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        double double18 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int19 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double22 = hypergeometricDistribution3.cumulativeProbability((int) ' ', 97);
        double double23 = hypergeometricDistribution3.getNumericalVariance();
        int int24 = hypergeometricDistribution3.getSupportUpperBound();
        int int25 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.probability((int) (short) 10);
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        double double15 = hypergeometricDistribution3.getNumericalMean();
        double double17 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double19 = hypergeometricDistribution3.upperCumulativeProbability(52);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        double double13 = hypergeometricDistribution3.getNumericalMean();
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.probability((int) (short) 100);
        double double13 = hypergeometricDistribution3.probability(23);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        double double14 = hypergeometricDistribution3.probability((int) ' ');
        int int15 = hypergeometricDistribution3.sample();
        int int16 = hypergeometricDistribution3.getSampleSize();
        boolean boolean17 = hypergeometricDistribution3.isSupportConnected();
        double double18 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.cumulativeProbability(35);
        int int17 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int18 = hypergeometricDistribution3.getSupportUpperBound();
        int int19 = hypergeometricDistribution3.sample();
        double double20 = hypergeometricDistribution3.getNumericalVariance();
        java.lang.Class<?> wildcardClass21 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) 32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((-1), (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        int int14 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int15 = hypergeometricDistribution3.getPopulationSize();
        double double17 = hypergeometricDistribution3.cumulativeProbability(1);
        boolean boolean18 = hypergeometricDistribution3.isSupportConnected();
        double double21 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, 0);
        double double24 = hypergeometricDistribution3.cumulativeProbability(1, (int) (short) 1);
        int[] intArray26 = hypergeometricDistribution3.sample((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        hypergeometricDistribution3.reseedRandomGenerator((long) 10);
        int[] intArray12 = hypergeometricDistribution3.sample((int) (short) 1);
        double double13 = hypergeometricDistribution3.getNumericalMean();
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100);
        int int16 = hypergeometricDistribution3.getSampleSize();
        int int17 = hypergeometricDistribution3.getSampleSize();
        int int18 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        hypergeometricDistribution3.reseedRandomGenerator(10L);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        int int15 = hypergeometricDistribution3.sample();
        double double16 = hypergeometricDistribution3.getNumericalMean();
        double double17 = hypergeometricDistribution3.getNumericalVariance();
        double double19 = hypergeometricDistribution3.probability((int) (byte) 1);
        int int20 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 10, (int) (byte) 100, 23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.probability(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.upperCumulativeProbability((-1));
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double11 = hypergeometricDistribution3.cumulativeProbability(35, (int) 'a');
        int int12 = hypergeometricDistribution3.sample();
        int int13 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double14 = hypergeometricDistribution3.getNumericalVariance();
        double double16 = hypergeometricDistribution3.upperCumulativeProbability(100);
        boolean boolean17 = hypergeometricDistribution3.isSupportConnected();
        double double19 = hypergeometricDistribution3.cumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) 52);
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 100);
        double double16 = hypergeometricDistribution3.cumulativeProbability(52);
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int[] intArray11 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        int int14 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        int int16 = hypergeometricDistribution3.inverseCumulativeProbability((double) (short) 0);
        double double18 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        double double19 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 1, (int) (short) 0, (int) (short) 1);
        double double5 = hypergeometricDistribution3.probability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) 0);
        double double10 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10, 100);
        int int11 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        int[] intArray13 = hypergeometricDistribution3.sample(32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = hypergeometricDistribution3.sample((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        int[] intArray12 = hypergeometricDistribution3.sample((int) (short) 100);
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean14 = hypergeometricDistribution3.isSupportConnected();
        int int15 = hypergeometricDistribution3.getPopulationSize();
        int int16 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.cumulativeProbability(35);
        int int17 = hypergeometricDistribution3.sample();
        double double19 = hypergeometricDistribution3.upperCumulativeProbability(23);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) 'a', (int) (byte) 10, (int) '#');
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 1, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int11 = hypergeometricDistribution3.inverseCumulativeProbability((double) (short) 0);
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1));
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        double double9 = hypergeometricDistribution3.probability((int) (byte) -1);
        int int10 = hypergeometricDistribution3.sample();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        int int13 = hypergeometricDistribution3.sample();
        double double15 = hypergeometricDistribution3.cumulativeProbability(1);
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 0);
        double double19 = hypergeometricDistribution3.cumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        int int11 = hypergeometricDistribution3.sample();
        hypergeometricDistribution3.reseedRandomGenerator((long) '4');
        double double15 = hypergeometricDistribution3.probability(35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 0);
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        double double11 = hypergeometricDistribution3.upperCumulativeProbability(100);
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        int int14 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double9 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, (int) ' ');
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1, (int) '#');
        double double14 = hypergeometricDistribution3.getNumericalMean();
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        double double17 = hypergeometricDistribution3.probability((int) 'a');
        int int18 = hypergeometricDistribution3.getSampleSize();
        double double20 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        int int21 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        int int12 = hypergeometricDistribution3.getPopulationSize();
        int int13 = hypergeometricDistribution3.getSampleSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (1) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(35, (int) (short) 1, (int) ' ');
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.upperCumulativeProbability(52);
        boolean boolean17 = hypergeometricDistribution3.isSupportConnected();
        int int18 = hypergeometricDistribution3.getSampleSize();
        int int19 = hypergeometricDistribution3.getSampleSize();
        double double21 = hypergeometricDistribution3.cumulativeProbability(30);
        double double24 = hypergeometricDistribution3.cumulativeProbability((int) 'a', 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 10);
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        int int15 = hypergeometricDistribution3.getSampleSize();
        double double17 = hypergeometricDistribution3.upperCumulativeProbability(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        int int12 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(23, 0, 0);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.sample();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        int int13 = hypergeometricDistribution3.getSampleSize();
        int[] intArray15 = hypergeometricDistribution3.sample(100);
        double double16 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        int int5 = hypergeometricDistribution3.sample();
        hypergeometricDistribution3.reseedRandomGenerator((long) '4');
        double double9 = hypergeometricDistribution3.upperCumulativeProbability(97);
        int int10 = hypergeometricDistribution3.getPopulationSize();
        int int11 = hypergeometricDistribution3.getSampleSize();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int14 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean15 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(97, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (97)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.upperCumulativeProbability(52);
        boolean boolean17 = hypergeometricDistribution3.isSupportConnected();
        int int18 = hypergeometricDistribution3.getSampleSize();
        int int19 = hypergeometricDistribution3.getPopulationSize();
        double double20 = hypergeometricDistribution3.getNumericalMean();
        double double22 = hypergeometricDistribution3.cumulativeProbability(100);
        hypergeometricDistribution3.reseedRandomGenerator((long) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) 'a');
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int5 = hypergeometricDistribution3.sample();
        boolean boolean6 = hypergeometricDistribution3.isSupportConnected();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getPopulationSize();
        double double10 = hypergeometricDistribution3.upperCumulativeProbability(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) '4', (int) 'a');
        int int5 = hypergeometricDistribution4.getSampleSize();
        int int6 = hypergeometricDistribution4.getSupportUpperBound();
        double double9 = hypergeometricDistribution4.cumulativeProbability((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.probability((int) (short) 10);
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        double double15 = hypergeometricDistribution3.getNumericalMean();
        int int16 = hypergeometricDistribution3.getSampleSize();
        double double18 = hypergeometricDistribution3.upperCumulativeProbability(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        hypergeometricDistribution3.reseedRandomGenerator(10L);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (100) must be less than or equal to upper endpoint (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        int int9 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.probability((int) (short) 1);
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getSampleSize();
        double double11 = hypergeometricDistribution3.upperCumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int12 = hypergeometricDistribution3.getPopulationSize();
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        double double15 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 100);
        double double17 = hypergeometricDistribution3.upperCumulativeProbability((int) 'a');
        double double18 = hypergeometricDistribution3.getNumericalMean();
        int int20 = hypergeometricDistribution3.inverseCumulativeProbability(1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.probability((int) (short) 100);
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        int int15 = hypergeometricDistribution3.getSampleSize();
        int int16 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int12 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        double double14 = hypergeometricDistribution3.probability((-1));
        int[] intArray16 = hypergeometricDistribution3.sample((int) (byte) 10);
        int int17 = hypergeometricDistribution3.getSupportLowerBound();
        double double20 = hypergeometricDistribution3.cumulativeProbability((int) (byte) -1, (int) 'a');
        int int22 = hypergeometricDistribution3.inverseCumulativeProbability(1.0d);
        int int23 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.getNumericalMean();
        int int8 = hypergeometricDistribution3.sample();
        int int10 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        hypergeometricDistribution3.reseedRandomGenerator(1L);
        double double14 = hypergeometricDistribution3.probability((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        int int14 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0);
        double double15 = hypergeometricDistribution3.getNumericalMean();
        int int16 = hypergeometricDistribution3.getSupportLowerBound();
        java.lang.Class<?> wildcardClass17 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double9 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, (int) ' ');
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1, (int) '#');
        double double15 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        int int16 = hypergeometricDistribution3.getPopulationSize();
        int int17 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, 1, 10);
        int int5 = hypergeometricDistribution4.getPopulationSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100);
        double double14 = hypergeometricDistribution3.probability(35);
        int int15 = hypergeometricDistribution3.getSupportUpperBound();
        double double17 = hypergeometricDistribution3.cumulativeProbability(10);
        double double20 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0, (int) (byte) 100);
        double double21 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 97, (int) (byte) 10);
        double double5 = hypergeometricDistribution4.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.26454545454545453d + "'", double5 == 0.26454545454545453d);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (byte) 1, (int) (short) 10);
        int int5 = hypergeometricDistribution4.getSupportLowerBound();
        int int6 = hypergeometricDistribution4.getSupportUpperBound();
        double double7 = hypergeometricDistribution4.getNumericalMean();
        double double9 = hypergeometricDistribution4.upperCumulativeProbability((int) '#');
        boolean boolean10 = hypergeometricDistribution4.isSupportConnected();
        int int11 = hypergeometricDistribution4.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1d + "'", double7 == 0.1d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.upperCumulativeProbability(52);
        boolean boolean17 = hypergeometricDistribution3.isSupportConnected();
        int int18 = hypergeometricDistribution3.getSampleSize();
        int int19 = hypergeometricDistribution3.getPopulationSize();
        double double21 = hypergeometricDistribution3.probability(10);
        int int22 = hypergeometricDistribution3.getSampleSize();
        double double24 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 100);
        double double26 = hypergeometricDistribution3.probability((int) (short) 1);
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        double double13 = hypergeometricDistribution3.probability((int) (short) 10);
        int int14 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 10, (int) (byte) 1, 0);
        int int5 = hypergeometricDistribution4.getSampleSize();
        double double7 = hypergeometricDistribution4.cumulativeProbability((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        double double12 = hypergeometricDistribution3.getNumericalMean();
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.sample();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 0);
        double double16 = hypergeometricDistribution3.probability((int) (byte) 0);
        double double18 = hypergeometricDistribution3.upperCumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        int int21 = hypergeometricDistribution3.getSupportUpperBound();
        int int23 = hypergeometricDistribution3.inverseCumulativeProbability((double) (short) 1);
        int int24 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double10 = hypergeometricDistribution3.probability((int) (byte) 1);
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        int int15 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0);
        int int16 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.probability((int) (byte) 100);
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        int int19 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int20 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int12 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        double double14 = hypergeometricDistribution3.probability((-1));
        int[] intArray16 = hypergeometricDistribution3.sample((int) (byte) 10);
        boolean boolean17 = hypergeometricDistribution3.isSupportConnected();
        int int18 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int12 = hypergeometricDistribution3.getPopulationSize();
        int int13 = hypergeometricDistribution3.sample();
        double double15 = hypergeometricDistribution3.upperCumulativeProbability(52);
        double double17 = hypergeometricDistribution3.probability((int) '4');
        int int18 = hypergeometricDistribution3.getNumberOfSuccesses();
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 10);
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        int int15 = hypergeometricDistribution3.getSampleSize();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = hypergeometricDistribution3.cumulativeProbability(10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (10) must be less than or equal to upper endpoint (-1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.probability(10);
        double double10 = hypergeometricDistribution3.probability((int) (short) 1);
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) 97);
        boolean boolean15 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.probability((int) (short) 10);
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        double double17 = hypergeometricDistribution3.cumulativeProbability(0, (int) (short) 1);
        double double19 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) -1);
        double double23 = hypergeometricDistribution3.probability((int) '4');
        int int24 = hypergeometricDistribution3.sample();
        int int25 = hypergeometricDistribution3.getSupportUpperBound();
        int[] intArray27 = hypergeometricDistribution3.sample(30);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        hypergeometricDistribution3.reseedRandomGenerator(10L);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        int int12 = hypergeometricDistribution3.getPopulationSize();
        java.lang.Class<?> wildcardClass13 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        int int12 = hypergeometricDistribution3.sample();
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 10, 0);
        int int4 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hypergeometricDistribution3.inverseCumulativeProbability((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: -1 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 100);
        double double16 = hypergeometricDistribution3.cumulativeProbability((int) ' ', 35);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        int int10 = hypergeometricDistribution3.sample();
        int[] intArray12 = hypergeometricDistribution3.sample((int) (byte) 10);
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, 100, (int) (short) 10);
        double double6 = hypergeometricDistribution4.cumulativeProbability((int) ' ');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        double double12 = hypergeometricDistribution3.getNumericalMean();
        double double13 = hypergeometricDistribution3.getNumericalMean();
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.getNumericalMean();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hypergeometricDistribution3.inverseCumulativeProbability((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 100 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        int int13 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.sample();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) -1);
        int int14 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution3.getNumericalMean();
        double double16 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 32, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        int int8 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        int int10 = hypergeometricDistribution3.sample();
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution3.upperCumulativeProbability((int) 'a');
        int int14 = hypergeometricDistribution3.getPopulationSize();
        int int16 = hypergeometricDistribution3.inverseCumulativeProbability(0.10000000000000002d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.getNumericalMean();
        int int8 = hypergeometricDistribution3.sample();
        double double9 = hypergeometricDistribution3.getNumericalMean();
        double double11 = hypergeometricDistribution3.probability(0);
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (short) 0, (int) (byte) 0);
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) 100, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.getNumericalVariance();
        double double10 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        int[] intArray12 = hypergeometricDistribution3.sample((int) (short) 10);
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        int int14 = hypergeometricDistribution3.getPopulationSize();
        double double15 = hypergeometricDistribution3.getNumericalMean();
        double double16 = hypergeometricDistribution3.getNumericalMean();
        double double17 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        int int14 = hypergeometricDistribution3.getPopulationSize();
        double double16 = hypergeometricDistribution3.probability((int) (byte) 10);
        int int17 = hypergeometricDistribution3.getSupportLowerBound();
        double double19 = hypergeometricDistribution3.probability(0);
        int int20 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 100, (int) '4', (int) ' ');
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) '4', (int) 'a');
        double double6 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1, (int) '#');
        int int7 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int12 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        int int15 = hypergeometricDistribution3.getSupportUpperBound();
        java.lang.Class<?> wildcardClass16 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10, (int) (short) 100);
        double double13 = hypergeometricDistribution3.probability((int) '4');
        int int14 = hypergeometricDistribution3.getSampleSize();
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        double double18 = hypergeometricDistribution3.probability(0);
        double double19 = hypergeometricDistribution3.getNumericalVariance();
        int int20 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 100, (int) (byte) 0, (int) (short) 100);
        double double4 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        hypergeometricDistribution3.reseedRandomGenerator(10L);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        int[] intArray14 = hypergeometricDistribution3.sample((int) ' ');
        int[] intArray16 = hypergeometricDistribution3.sample((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int8 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0);
        int int12 = hypergeometricDistribution3.getPopulationSize();
        double double14 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 100);
        int int15 = hypergeometricDistribution3.getSupportLowerBound();
        int int16 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.upperCumulativeProbability(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 1, 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: number of successes (100) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int[] intArray11 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        int int14 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        int int16 = hypergeometricDistribution3.inverseCumulativeProbability((double) (short) 0);
        double double18 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        int int19 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int5 = hypergeometricDistribution3.getPopulationSize();
        double double7 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 0);
        int[] intArray9 = hypergeometricDistribution3.sample(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '4', (int) (short) 10, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (short) -1, 0, 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: population size (-1)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (short) 100, 0);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 30, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double11 = hypergeometricDistribution3.cumulativeProbability(35, (int) 'a');
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        int int13 = hypergeometricDistribution3.getSupportUpperBound();
        int int15 = hypergeometricDistribution3.inverseCumulativeProbability((double) 0L);
        int int16 = hypergeometricDistribution3.getNumberOfSuccesses();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hypergeometricDistribution3.inverseCumulativeProbability((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException; message: 10 out of [0, 1] range");
        } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0, 35);
        hypergeometricDistribution3.reseedRandomGenerator((long) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.getNumericalMean();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        double double9 = hypergeometricDistribution3.getNumericalMean();
        int[] intArray11 = hypergeometricDistribution3.sample((int) (short) 10);
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        int[] intArray15 = hypergeometricDistribution3.sample((int) 'a');
        int int16 = hypergeometricDistribution3.getSupportLowerBound();
        int int17 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean9 = hypergeometricDistribution3.isSupportConnected();
        java.lang.Class<?> wildcardClass10 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.sample();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        int[] intArray14 = hypergeometricDistribution3.sample(35);
        int int15 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        hypergeometricDistribution3.reseedRandomGenerator(10L);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        double double13 = hypergeometricDistribution3.getNumericalVariance();
        double double16 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10, (int) (byte) 10);
        double double19 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10, (int) '4');
        double double20 = hypergeometricDistribution3.getNumericalMean();
        int int21 = hypergeometricDistribution3.getSupportUpperBound();
        double double23 = hypergeometricDistribution3.cumulativeProbability(35);
        boolean boolean24 = hypergeometricDistribution3.isSupportConnected();
        int int25 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double10 = hypergeometricDistribution3.upperCumulativeProbability(52);
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        hypergeometricDistribution3.reseedRandomGenerator(10L);
        hypergeometricDistribution3.reseedRandomGenerator((long) 97);
        double double15 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10, 100);
        boolean boolean16 = hypergeometricDistribution3.isSupportConnected();
        int[] intArray18 = hypergeometricDistribution3.sample(32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1);
        int int14 = hypergeometricDistribution3.inverseCumulativeProbability((double) (short) 0);
        double double16 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double18 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        hypergeometricDistribution3.reseedRandomGenerator((long) 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10, (int) (short) 100);
        double double13 = hypergeometricDistribution3.probability((int) '4');
        int int14 = hypergeometricDistribution3.getSampleSize();
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        int int17 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int19 = hypergeometricDistribution3.inverseCumulativeProbability((double) (byte) 0);
        int int20 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        int int11 = hypergeometricDistribution3.getSampleSize();
        int[] intArray13 = hypergeometricDistribution3.sample((int) (short) 10);
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double15 = hypergeometricDistribution3.getNumericalMean();
        int int16 = hypergeometricDistribution3.getPopulationSize();
        int int17 = hypergeometricDistribution3.sample();
        int int18 = hypergeometricDistribution3.getNumberOfSuccesses();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 10, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (52) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double9 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, (int) ' ');
        int int10 = hypergeometricDistribution3.getSampleSize();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1, (int) '#');
        double double15 = hypergeometricDistribution3.probability(97);
        int int16 = hypergeometricDistribution3.getSupportUpperBound();
        double double19 = hypergeometricDistribution3.cumulativeProbability(0, 1);
        double double20 = hypergeometricDistribution3.getNumericalVariance();
        int int21 = hypergeometricDistribution3.sample();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 30, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (52) must be less than or equal to population size (30)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) (byte) 100, (int) (byte) 1, (int) (short) 10);
        double double6 = hypergeometricDistribution4.upperCumulativeProbability((int) (short) -1);
        int int7 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int8 = hypergeometricDistribution4.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution4.inverseCumulativeProbability(1.0d);
        int int11 = hypergeometricDistribution4.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 0);
        int int9 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 0);
        double double12 = hypergeometricDistribution3.cumulativeProbability(0);
        int int13 = hypergeometricDistribution3.getSampleSize();
        double double14 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator((long) 10);
        double double14 = hypergeometricDistribution3.getNumericalMean();
        double double16 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 0);
        double double19 = hypergeometricDistribution3.cumulativeProbability((-1), 0);
        java.lang.Class<?> wildcardClass20 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.cumulativeProbability(35);
        int int17 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int18 = hypergeometricDistribution3.getSupportUpperBound();
        int int19 = hypergeometricDistribution3.sample();
        double double20 = hypergeometricDistribution3.getNumericalVariance();
        int int21 = hypergeometricDistribution3.sample();
        int int22 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.probability(100);
        int int10 = hypergeometricDistribution3.sample();
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        int[] intArray13 = hypergeometricDistribution3.sample((int) (byte) 10);
        double double15 = hypergeometricDistribution3.probability((int) (short) 10);
        int int16 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean17 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean11 = hypergeometricDistribution3.isSupportConnected();
        double double14 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, 100);
        double double15 = hypergeometricDistribution3.getNumericalMean();
        int int16 = hypergeometricDistribution3.sample();
        int int17 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double4 = hypergeometricDistribution3.getNumericalMean();
        int int5 = hypergeometricDistribution3.sample();
        double double6 = hypergeometricDistribution3.getNumericalVariance();
        int int7 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.probability((int) (byte) 100);
        hypergeometricDistribution3.reseedRandomGenerator(100L);
        boolean boolean19 = hypergeometricDistribution3.isSupportConnected();
        int int20 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1.0f);
        double double12 = hypergeometricDistribution3.cumulativeProbability(1, 10);
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        boolean boolean14 = hypergeometricDistribution3.isSupportConnected();
        double double15 = hypergeometricDistribution3.getNumericalVariance();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getSupportUpperBound();
        int[] intArray13 = hypergeometricDistribution3.sample(52);
        double double15 = hypergeometricDistribution3.probability(32);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 10);
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        int int11 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double13 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        int int14 = hypergeometricDistribution3.getPopulationSize();
        double double16 = hypergeometricDistribution3.probability((int) (byte) 10);
        double double18 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        int int19 = hypergeometricDistribution3.getSupportUpperBound();
        int int20 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        hypergeometricDistribution3.reseedRandomGenerator((long) 52);
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution3.sample();
        int int14 = hypergeometricDistribution3.getSupportLowerBound();
        int int15 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double17 = hypergeometricDistribution3.cumulativeProbability((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int[] intArray5 = hypergeometricDistribution3.sample((int) '4');
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = hypergeometricDistribution3.cumulativeProbability((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: lower endpoint (32) must be less than or equal to upper endpoint (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 100, 0, (int) (short) 100);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int11 = hypergeometricDistribution3.getPopulationSize();
        int int12 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        java.lang.Class<?> wildcardClass14 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (10)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        int int9 = hypergeometricDistribution3.getSampleSize();
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double13 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1, (int) (byte) 100);
        int int14 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double15 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        double double11 = hypergeometricDistribution3.cumulativeProbability(10, (int) (short) 100);
        double double13 = hypergeometricDistribution3.probability((int) '4');
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double17 = hypergeometricDistribution3.cumulativeProbability(10, (int) 'a');
        int int19 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        java.lang.Class<?> wildcardClass20 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.sample();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 0);
        double double16 = hypergeometricDistribution3.probability((int) (byte) 0);
        double double18 = hypergeometricDistribution3.upperCumulativeProbability((int) '#');
        double double20 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.sample();
        int int13 = hypergeometricDistribution3.getSampleSize();
        double double15 = hypergeometricDistribution3.probability((int) (short) -1);
        int int16 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int[] intArray11 = hypergeometricDistribution3.sample((int) (byte) 100);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        int int14 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        int int16 = hypergeometricDistribution3.inverseCumulativeProbability((double) (short) 0);
        hypergeometricDistribution3.reseedRandomGenerator((long) 30);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        int int14 = hypergeometricDistribution3.getSampleSize();
        double double16 = hypergeometricDistribution3.upperCumulativeProbability(52);
        double double18 = hypergeometricDistribution3.upperCumulativeProbability(100);
        double double20 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) -1);
        boolean boolean21 = hypergeometricDistribution3.isSupportConnected();
        int int22 = hypergeometricDistribution3.getSampleSize();
        double double24 = hypergeometricDistribution3.probability(0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = hypergeometricDistribution3.sample((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: number of samples (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int[] intArray5 = hypergeometricDistribution3.sample((int) '4');
        int int6 = hypergeometricDistribution3.getSampleSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability(52);
        double double10 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) 10);
        int int11 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) ' ');
        double double10 = hypergeometricDistribution3.probability((int) (short) 0);
        int int11 = hypergeometricDistribution3.getSupportLowerBound();
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        double double15 = hypergeometricDistribution3.probability(0);
        double double17 = hypergeometricDistribution3.cumulativeProbability(97);
        int int19 = hypergeometricDistribution3.inverseCumulativeProbability(0.1d);
        java.lang.Class<?> wildcardClass20 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        int int9 = hypergeometricDistribution3.getSupportUpperBound();
        int int10 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        double double14 = hypergeometricDistribution3.cumulativeProbability(1);
        double double17 = hypergeometricDistribution3.cumulativeProbability(52, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        double double12 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int9 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int10 = hypergeometricDistribution3.getSupportLowerBound();
        double double12 = hypergeometricDistribution3.cumulativeProbability((int) (short) 100);
        double double14 = hypergeometricDistribution3.cumulativeProbability(0);
        double double16 = hypergeometricDistribution3.upperCumulativeProbability((int) (short) -1);
        double double17 = hypergeometricDistribution3.getNumericalMean();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) ' ', 10, (int) (byte) 1);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        boolean boolean4 = hypergeometricDistribution3.isSupportConnected();
        double double6 = hypergeometricDistribution3.cumulativeProbability((-1));
        boolean boolean7 = hypergeometricDistribution3.isSupportConnected();
        double double9 = hypergeometricDistribution3.probability((int) 'a');
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) (short) 0);
        double double9 = hypergeometricDistribution3.getNumericalMean();
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.getNumericalMean();
        double double8 = hypergeometricDistribution3.getNumericalMean();
        java.lang.Class<?> wildcardClass9 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        boolean boolean10 = hypergeometricDistribution3.isSupportConnected();
        double double11 = hypergeometricDistribution3.getNumericalVariance();
        int int12 = hypergeometricDistribution3.getPopulationSize();
        int int13 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 10);
        int int16 = hypergeometricDistribution3.getSampleSize();
        int int17 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (short) 10, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: number of samples (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        double double14 = hypergeometricDistribution3.cumulativeProbability(1);
        int int15 = hypergeometricDistribution3.getPopulationSize();
        boolean boolean16 = hypergeometricDistribution3.isSupportConnected();
        double double18 = hypergeometricDistribution3.probability(1);
        hypergeometricDistribution3.reseedRandomGenerator((long) 52);
        double double21 = hypergeometricDistribution3.getNumericalVariance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        double double13 = hypergeometricDistribution3.cumulativeProbability(0);
        int int14 = hypergeometricDistribution3.getPopulationSize();
        double double16 = hypergeometricDistribution3.cumulativeProbability(23);
        int int17 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int18 = hypergeometricDistribution3.getPopulationSize();
        int int19 = hypergeometricDistribution3.getPopulationSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1.0f);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        int[] intArray14 = hypergeometricDistribution3.sample(100);
        double double16 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        double double18 = hypergeometricDistribution3.probability(0);
        double double20 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 1);
        int int21 = hypergeometricDistribution3.getPopulationSize();
        int int22 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        double double10 = hypergeometricDistribution3.getNumericalMean();
        double double11 = hypergeometricDistribution3.getNumericalMean();
        int int12 = hypergeometricDistribution3.getSupportUpperBound();
        int int14 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        double double16 = hypergeometricDistribution3.cumulativeProbability(100);
        double double18 = hypergeometricDistribution3.cumulativeProbability(23);
        boolean boolean19 = hypergeometricDistribution3.isSupportConnected();
        int int20 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) (byte) 1, (int) (byte) 0, 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (35) must be less than or equal to population size (1)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        int int13 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double16 = hypergeometricDistribution3.probability((int) ' ');
        double double18 = hypergeometricDistribution3.upperCumulativeProbability(97);
        int int19 = hypergeometricDistribution3.getSampleSize();
        java.lang.Class<?> wildcardClass20 = hypergeometricDistribution3.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportLowerBound();
        double double8 = hypergeometricDistribution3.upperCumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        double double14 = hypergeometricDistribution3.cumulativeProbability(1);
        int int15 = hypergeometricDistribution3.getSampleSize();
        double double18 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 1, 10);
        int[] intArray20 = hypergeometricDistribution3.sample((int) ' ');
        double double21 = hypergeometricDistribution3.getNumericalMean();
        int int22 = hypergeometricDistribution3.getSupportUpperBound();
        int int23 = hypergeometricDistribution3.getSupportUpperBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, (int) '#', 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hypergeometricDistribution4.sample();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.cumulativeProbability(0);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int12 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getPopulationSize();
        double double8 = hypergeometricDistribution3.cumulativeProbability((int) (short) -1);
        int int9 = hypergeometricDistribution3.getSampleSize();
        int int10 = hypergeometricDistribution3.getSampleSize();
        int int11 = hypergeometricDistribution3.getSampleSize();
        int int12 = hypergeometricDistribution3.getSampleSize();
        int int13 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int14 = hypergeometricDistribution3.getPopulationSize();
        double double17 = hypergeometricDistribution3.cumulativeProbability(32, (int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(32, 0, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: sample size (100) must be less than or equal to population size (32)");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSampleSize();
        double double9 = hypergeometricDistribution3.getNumericalVariance();
        int int10 = hypergeometricDistribution3.getPopulationSize();
        hypergeometricDistribution3.reseedRandomGenerator((-1L));
        boolean boolean13 = hypergeometricDistribution3.isSupportConnected();
        int int14 = hypergeometricDistribution3.getNumberOfSuccesses();
        int int15 = hypergeometricDistribution3.getPopulationSize();
        double double17 = hypergeometricDistribution3.cumulativeProbability(1);
        boolean boolean18 = hypergeometricDistribution3.isSupportConnected();
        int int19 = hypergeometricDistribution3.getSampleSize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution(10, (int) (short) 0, 10);
        int int4 = hypergeometricDistribution3.getNumberOfSuccesses();
        double double6 = hypergeometricDistribution3.upperCumulativeProbability(0);
        double double7 = hypergeometricDistribution3.getNumericalMean();
        double double9 = hypergeometricDistribution3.upperCumulativeProbability(52);
        double double11 = hypergeometricDistribution3.cumulativeProbability((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 100);
        int int8 = hypergeometricDistribution3.getSupportUpperBound();
        int int9 = hypergeometricDistribution3.sample();
        double double11 = hypergeometricDistribution3.upperCumulativeProbability(1);
        boolean boolean12 = hypergeometricDistribution3.isSupportConnected();
        int int13 = hypergeometricDistribution3.getSupportLowerBound();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int12 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        double double14 = hypergeometricDistribution3.probability((-1));
        int[] intArray16 = hypergeometricDistribution3.sample((int) (byte) 10);
        int int17 = hypergeometricDistribution3.getSupportLowerBound();
        double double19 = hypergeometricDistribution3.cumulativeProbability((int) '4');
        int int20 = hypergeometricDistribution3.sample();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution4 = new org.apache.commons.math3.distribution.HypergeometricDistribution(randomGenerator0, 97, (int) '4', (int) 'a');
        int int5 = hypergeometricDistribution4.getSampleSize();
        boolean boolean6 = hypergeometricDistribution4.isSupportConnected();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        double double7 = hypergeometricDistribution3.cumulativeProbability((int) (short) 10);
        double double9 = hypergeometricDistribution3.upperCumulativeProbability((int) '4');
        int int10 = hypergeometricDistribution3.getSupportUpperBound();
        int int12 = hypergeometricDistribution3.inverseCumulativeProbability(0.0d);
        double double14 = hypergeometricDistribution3.probability((-1));
        int[] intArray16 = hypergeometricDistribution3.sample((int) (byte) 10);
        int int17 = hypergeometricDistribution3.getSupportLowerBound();
        double double20 = hypergeometricDistribution3.cumulativeProbability((int) (byte) -1, (int) 'a');
        int int21 = hypergeometricDistribution3.getSupportUpperBound();
        boolean boolean22 = hypergeometricDistribution3.isSupportConnected();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.math3.distribution.HypergeometricDistribution hypergeometricDistribution3 = new org.apache.commons.math3.distribution.HypergeometricDistribution((int) 'a', (int) (byte) 0, (int) '#');
        double double5 = hypergeometricDistribution3.cumulativeProbability((int) (byte) 10);
        int int6 = hypergeometricDistribution3.getSupportUpperBound();
        int int7 = hypergeometricDistribution3.getSupportLowerBound();
        int int9 = hypergeometricDistribution3.inverseCumulativeProbability((double) 1.0f);
        hypergeometricDistribution3.reseedRandomGenerator((long) (byte) 1);
        int int12 = hypergeometricDistribution3.getSupportLowerBound();
        int int13 = hypergeometricDistribution3.sample();
        int int14 = hypergeometricDistribution3.getPopulationSize();
        int int15 = hypergeometricDistribution3.getSupportUpperBound();
        int[] intArray17 = hypergeometricDistribution3.sample((int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }
}

