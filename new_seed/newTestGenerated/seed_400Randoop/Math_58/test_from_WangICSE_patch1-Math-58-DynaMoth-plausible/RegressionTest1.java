import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 1, (double) (byte) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        double double9 = levenbergMarquardtOptimizer7.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        java.lang.Class<?> wildcardClass12 = vectorialPointValuePairConvergenceChecker10.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', 0.0d, (double) 1.0f, (double) 0, 0.0d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) -1, (double) (-1));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (-1.0f), Double.NaN);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 0.0f, (double) (short) 100, 0.0d, (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray11 = new double[] { (short) 10, (-1L), 1L, (byte) 1, 100.0f };
        double[] doubleArray13 = new double[] { '4' };
        double[] doubleArray19 = new double[] { (-1.0d), (byte) 10, 10, (byte) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer3.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction5, doubleArray11, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 10.0, 0.0, -1.0]");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = vectorialPointValuePairConvergenceChecker6.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer3.getEvaluations();
        int int13 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, Double.NaN, (double) (-1.0f));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray10 = new double[] { 10.0f, (-1.0f) };
        double[] doubleArray11 = new double[] {};
        double[] doubleArray14 = new double[] { (-1.0f), 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize((int) (short) 10, differentiableMultivariateVectorialFunction7, doubleArray10, doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0]");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, (double) (byte) 0);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1L), (double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 100.0d, 10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int12 = levenbergMarquardtOptimizer11.getEvaluations();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double19 = levenbergMarquardtOptimizer18.getRMS();
        int int20 = levenbergMarquardtOptimizer18.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer18.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double35 = levenbergMarquardtOptimizer34.getRMS();
        int int36 = levenbergMarquardtOptimizer34.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction43 = null;
        double[] doubleArray50 = new double[] { (-1L), ' ', 10L, (short) -1, 10L, 1L };
        double[] doubleArray53 = new double[] { (short) 1, 0 };
        double[] doubleArray58 = new double[] { '4', (short) 100, '4', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair59 = levenbergMarquardtOptimizer3.optimize((int) 'a', differentiableMultivariateVectorialFunction43, doubleArray50, doubleArray53, doubleArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 32.0, 10.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[52.0, 100.0, 52.0, 10.0]");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray16 = new double[] { (-1.0f), '4', 100L };
        double[] doubleArray18 = new double[] { 100 };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer3.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction12, doubleArray16, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) (short) 0, (double) 0.0f);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray11 = new double[] { 100L, (byte) -1, 1.0f, 10.0d };
        double[] doubleArray13 = new double[] { 100 };
        double[] doubleArray17 = new double[] { '#', Double.NaN, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction6, doubleArray11, doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, NaN, 10.0]");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) 1L, (double) ' ');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) 100.0f, (double) (short) 1, (double) ' ', (double) '4');
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 0L, (double) (short) 0, (double) 'a', (double) ' ');
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) 1L, (double) ' ');
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction5, doubleArray6, doubleArray7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, 0.0d, (double) 100L, 0.0d, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = vectorialPointValuePairConvergenceChecker6.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray10 = null;
        double[] doubleArray16 = new double[] { (short) -1, '4', (-1.0f), (byte) 100, '4' };
        double[] doubleArray18 = new double[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize(1, differentiableMultivariateVectorialFunction9, doubleArray10, doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 52.0, -1.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray19 = new double[] {};
        double[] doubleArray23 = new double[] { '4', 'a', (short) 0 };
        double[] doubleArray25 = new double[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction18, doubleArray19, doubleArray23, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0]");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double double11 = levenbergMarquardtOptimizer5.getChiSquare();
        double double12 = levenbergMarquardtOptimizer5.getRMS();
        int int13 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer5.getChiSquare();
        double double15 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) (-1.0f), (double) (byte) 100, (double) 100.0f, (double) (byte) -1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 10L, (double) (short) 10, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) '4', (double) (short) 0, (double) (byte) 1, (double) (byte) -1);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) '#', (double) (-1L), (double) 1L, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 1, (double) (byte) 10, (double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        java.lang.Class<?> wildcardClass14 = vectorialPointValuePairConvergenceChecker12.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        int int23 = levenbergMarquardtOptimizer5.getEvaluations();
        int int24 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction26 = null;
        double[] doubleArray27 = null;
        double[] doubleArray29 = new double[] { 0.0d };
        double[] doubleArray34 = new double[] { (-1L), Double.NaN, 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair35 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction26, doubleArray27, doubleArray29, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, NaN, 100.0, -1.0]");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (-1.0d), (double) (short) 1);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (short) -1, 10.0d, (double) (short) 100, (double) (byte) 100);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray14 = new double[] { (short) 0, (short) 1, (byte) 0, 100, 'a' };
        double[] doubleArray19 = new double[] { 10.0d, 10.0d, '#', (short) 100 };
        double[] doubleArray22 = new double[] { 100L, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer5.optimize((int) (short) 1, differentiableMultivariateVectorialFunction8, doubleArray14, doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0, 0.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0]");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) 100L, (double) 100, (double) 10.0f, (double) 100);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 0L, 0.0d, (double) 100L, (double) ' ');
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 100, (double) (byte) 10, (double) 10L, (double) (-1));
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double39 = levenbergMarquardtOptimizer3.getChiSquare();
        int int40 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass41 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 1, (double) ' ', (double) 0, (double) 100.0f);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 10.0f, (double) (byte) 1);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int16 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        int int20 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', (double) 100L, 0.0d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (byte) 100, (double) '#');
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 1.0f, 0.0d, 0.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) 100L, (double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double14 = levenbergMarquardtOptimizer13.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = null;
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        int int17 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int23 = levenbergMarquardtOptimizer22.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double28 = levenbergMarquardtOptimizer27.getRMS();
        int int29 = levenbergMarquardtOptimizer27.getMaxEvaluations();
        int int30 = levenbergMarquardtOptimizer27.getEvaluations();
        int int31 = levenbergMarquardtOptimizer27.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker36);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) (byte) 0, 0.0d, (double) 1, 0.0d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray15 = new double[] { (byte) 100, 1L, (byte) 10, 1.0d, 10.0f };
        double[] doubleArray16 = new double[] {};
        double[] doubleArray20 = new double[] { (short) 0, 0.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) ' ', differentiableMultivariateVectorialFunction9, doubleArray15, doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, -1.0]");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double18 = levenbergMarquardtOptimizer3.getRMS();
        int int19 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double24 = levenbergMarquardtOptimizer23.getRMS();
        int int25 = levenbergMarquardtOptimizer23.getMaxEvaluations();
        int int26 = levenbergMarquardtOptimizer23.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker27 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker44 = levenbergMarquardtOptimizer43.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker54 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        levenbergMarquardtOptimizer49.setConvergenceChecker(vectorialPointValuePairConvergenceChecker54);
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialPointValuePairConvergenceChecker54);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker54);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker58 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker27);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker54);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker58);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int23 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        int int24 = levenbergMarquardtOptimizer22.getJacobianEvaluations();
        int int25 = levenbergMarquardtOptimizer22.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double30 = levenbergMarquardtOptimizer29.getRMS();
        int int31 = levenbergMarquardtOptimizer29.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer29.getEvaluations();
        int int33 = levenbergMarquardtOptimizer29.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0, (double) (-1), (double) (byte) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { (-1), 0, 1.0d, 10L, (byte) 1 };
        double[] doubleArray19 = new double[] { 10.0d, 1.0f, 0.0d, 0.0d, (-1.0d) };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer5.optimize(10, differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 1.0, 0.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (-1.0f), (double) 1.0f);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) (-1), (double) (byte) -1);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, 100.0d, (double) (byte) 100, (double) 100, (double) (short) -1);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) -1, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 'a', (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (byte) 100, (double) 100, (double) 10.0f, (double) '4');
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double5 = levenbergMarquardtOptimizer4.getRMS();
        int int6 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        java.lang.Class<?> wildcardClass26 = vectorialPointValuePairConvergenceChecker23.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int14 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        double double23 = levenbergMarquardtOptimizer21.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double28 = levenbergMarquardtOptimizer27.getRMS();
        int int29 = levenbergMarquardtOptimizer27.getMaxEvaluations();
        int int30 = levenbergMarquardtOptimizer27.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker32 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        int int36 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = null;
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int22 = levenbergMarquardtOptimizer21.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        double double27 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction29 = null;
        double[] doubleArray32 = new double[] { (short) 0, 0.0d };
        double[] doubleArray37 = new double[] { 0L, ' ', 1.0f, 1.0f };
        double[] doubleArray42 = new double[] { 1L, (-1L), (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair43 = levenbergMarquardtOptimizer3.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction29, doubleArray32, doubleArray37, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 32.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, -1.0, 100.0, 1.0]");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { (-1.0f), 10L, (-1.0f), 1.0f, 1L };
        double[] doubleArray16 = new double[] { (byte) 0, 1.0d };
        double[] doubleArray18 = new double[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize((int) ' ', differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0]");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) (-1.0f), (double) 0, (double) 10L, (double) 10L);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int16 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        double double20 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray21 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double10 = levenbergMarquardtOptimizer9.getChiSquare();
        int int11 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int16 = levenbergMarquardtOptimizer15.getJacobianEvaluations();
        double double17 = levenbergMarquardtOptimizer15.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int22 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray11 = new double[] { 100.0f };
        double[] doubleArray12 = new double[] {};
        double[] doubleArray14 = new double[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer5.optimize((int) (short) -1, differentiableMultivariateVectorialFunction9, doubleArray11, doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) 0L, (double) (byte) 1);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) '#', (double) (-1L), (double) 0L, (double) (short) 100);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 0.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int14 = levenbergMarquardtOptimizer13.getEvaluations();
        int int15 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        int int21 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        double double23 = levenbergMarquardtOptimizer19.getChiSquare();
        int int24 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double29 = levenbergMarquardtOptimizer28.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = null;
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker30);
        int int32 = levenbergMarquardtOptimizer28.getEvaluations();
        double double33 = levenbergMarquardtOptimizer28.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double38 = levenbergMarquardtOptimizer37.getRMS();
        int int39 = levenbergMarquardtOptimizer37.getMaxEvaluations();
        int int40 = levenbergMarquardtOptimizer37.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker41 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        int int47 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        double double18 = levenbergMarquardtOptimizer5.getChiSquare();
        double double19 = levenbergMarquardtOptimizer5.getChiSquare();
        int int20 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray12 = new double[] { (short) 10 };
        double[] doubleArray17 = new double[] { (-1.0f), 0L, 10.0f, 1.0d };
        double[] doubleArray19 = new double[] { Double.NaN };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer3.optimize((int) (short) 100, differentiableMultivariateVectorialFunction10, doubleArray12, doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[NaN]");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) 0, (double) 1.0f);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, Double.NaN, (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 0, (double) (-1.0f), Double.NaN, (double) (short) 100);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray14 = new double[] { 1.0d, 100, 10L, (byte) 0, (byte) 100 };
        double[] doubleArray19 = new double[] { 0.0f, 1.0d, 1, (byte) 100 };
        double[] doubleArray21 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer5.optimize((int) (short) -1, differentiableMultivariateVectorialFunction8, doubleArray14, doubleArray19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0]");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double10 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray16 = new double[] { (-1) };
        double[] doubleArray21 = new double[] { 10L, (short) 0, '#', (short) 100 };
        double[] doubleArray26 = new double[] { (short) 10, 0.0f, 1.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer3.optimize((-1), differentiableMultivariateVectorialFunction14, doubleArray16, doubleArray21, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 0.0, 35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 0.0, 1.0, 10.0]");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double18 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int20 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction22 = null;
        double[] doubleArray28 = new double[] { 1.0f, (-1.0f), (short) 0, 'a', 10L };
        double[] doubleArray31 = new double[] { 0L, (byte) -1 };
        double[] doubleArray32 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair33 = levenbergMarquardtOptimizer3.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction22, doubleArray28, doubleArray31, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, -1.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = null;
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int22 = levenbergMarquardtOptimizer21.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        double double27 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) '#', (double) 0L, (double) '4', (double) 'a');
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 1.0f, (double) 10L, (-1.0d), 0.0d);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray20 = null;
        double[] doubleArray21 = new double[] {};
        double[] doubleArray25 = new double[] { (byte) 100, (-1.0f), 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction19, doubleArray20, doubleArray21, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, -1.0, 0.0]");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int16 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        double double20 = levenbergMarquardtOptimizer3.getRMS();
        java.lang.Class<?> wildcardClass21 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double5 = levenbergMarquardtOptimizer4.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double29 = levenbergMarquardtOptimizer28.getRMS();
        int int30 = levenbergMarquardtOptimizer28.getJacobianEvaluations();
        int int31 = levenbergMarquardtOptimizer28.getJacobianEvaluations();
        double double32 = levenbergMarquardtOptimizer28.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker33 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        double double36 = levenbergMarquardtOptimizer3.getRMS();
        java.lang.Class<?> wildcardClass37 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker33);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 100, 0.0d);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) '#', (double) (byte) 1);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (short) 10, (double) 0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 'a', 10.0d, (-1.0d), (double) 100);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray8 = new double[] { (-1) };
        double[] doubleArray11 = new double[] { 100.0d, 10.0d };
        double[] doubleArray15 = new double[] { (short) -1, (short) 1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer3.optimize((int) (short) 10, differentiableMultivariateVectorialFunction6, doubleArray8, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 1.0, -1.0]");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 100L, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        int int21 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        int int27 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker30);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker40 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer35.setConvergenceChecker(vectorialPointValuePairConvergenceChecker40);
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker40);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker40);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker44 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        java.lang.Class<?> wildcardClass46 = vectorialPointValuePairConvergenceChecker44.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker30);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker40);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer59 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker60 = levenbergMarquardtOptimizer59.getConvergenceChecker();
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialPointValuePairConvergenceChecker60);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker62 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer63 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double64 = levenbergMarquardtOptimizer63.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker65 = levenbergMarquardtOptimizer63.getConvergenceChecker();
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        double double69 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction71 = null;
        double[] doubleArray77 = new double[] { 10, 1, (byte) 1, 1L, (byte) 0 };
        double[] doubleArray84 = new double[] { '4', 10, (short) -1, 10, '#', (byte) 100 };
        double[] doubleArray89 = new double[] { 10.0f, (-1), (-1L), (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair90 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction71, doubleArray77, doubleArray84, doubleArray89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker46);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker60);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker62);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker65);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[10.0, 1.0, 1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[52.0, 10.0, -1.0, 10.0, 35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[10.0, -1.0, -1.0, -1.0]");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), Double.NaN, (double) 10.0f, (double) (byte) 1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (-1L), (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (short) 1, 0.0d, (double) 1L, (double) (-1));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 100L, (double) 100);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 10L, (double) (short) 10, (double) (short) 1, (double) 100L);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int10 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        int int21 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker30);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker40 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer35.setConvergenceChecker(vectorialPointValuePairConvergenceChecker40);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker50 = levenbergMarquardtOptimizer49.getConvergenceChecker();
        levenbergMarquardtOptimizer45.setConvergenceChecker(vectorialPointValuePairConvergenceChecker50);
        levenbergMarquardtOptimizer35.setConvergenceChecker(vectorialPointValuePairConvergenceChecker50);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker50);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer57 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer61 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker62 = levenbergMarquardtOptimizer61.getConvergenceChecker();
        levenbergMarquardtOptimizer57.setConvergenceChecker(vectorialPointValuePairConvergenceChecker62);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer69 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer75 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker76 = levenbergMarquardtOptimizer75.getConvergenceChecker();
        levenbergMarquardtOptimizer69.setConvergenceChecker(vectorialPointValuePairConvergenceChecker76);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker78 = levenbergMarquardtOptimizer69.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer79 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double80 = levenbergMarquardtOptimizer79.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker81 = levenbergMarquardtOptimizer79.getConvergenceChecker();
        levenbergMarquardtOptimizer69.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        levenbergMarquardtOptimizer57.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray88 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker30);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker40);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker50);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker62);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker76);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker78);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker81);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer3.getEvaluations();
        int int13 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double15 = levenbergMarquardtOptimizer3.getRMS();
        double double16 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) -1, (double) (byte) 100);
        double double21 = levenbergMarquardtOptimizer20.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int28 = levenbergMarquardtOptimizer27.getMaxEvaluations();
        int int29 = levenbergMarquardtOptimizer27.getJacobianEvaluations();
        int int30 = levenbergMarquardtOptimizer27.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double35 = levenbergMarquardtOptimizer34.getRMS();
        int int36 = levenbergMarquardtOptimizer34.getMaxEvaluations();
        int int37 = levenbergMarquardtOptimizer34.getEvaluations();
        int int38 = levenbergMarquardtOptimizer34.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker43 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = vectorialPointValuePairConvergenceChecker6.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 0, (double) (-1), (double) (short) 1, (double) (-1.0f));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = null;
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker6);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray8 = levenbergMarquardtOptimizer5.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (short) -1, 0.0d);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 100, 10.0d, 0.0d, (-1.0d));
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 0, (double) 1L);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) (byte) 10, (double) 1L, (-1.0d));
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        int int20 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) (-1), (double) 10);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray10 = new double[] { (byte) -1 };
        double[] doubleArray13 = new double[] { (short) 10, Double.NaN };
        double[] doubleArray19 = new double[] { (short) -1, 10.0f, (short) 10, 100.0f, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer3.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction8, doubleArray10, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, NaN]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 10.0, 100.0, -1.0]");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) (-1.0f), (double) (-1));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray9 = new double[] { 100L, 1, 100.0d };
        double[] doubleArray11 = new double[] { 'a' };
        double[] doubleArray18 = new double[] { (-1.0f), 100.0d, (-1.0f), (short) -1, 0L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize((int) 'a', differentiableMultivariateVectorialFunction5, doubleArray9, doubleArray11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, -1.0, -1.0, 0.0, 10.0]");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) 100, (double) (byte) 10, (double) (-1), (double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray10 = null;
        double[] doubleArray14 = new double[] { (byte) 1, (-1L), (byte) 1 };
        double[] doubleArray18 = new double[] { (-1.0d), 1L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction9, doubleArray10, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0, 0.0]");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) (short) 10, (double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 0.0d, (double) 'a', (double) 1, (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray19 = new double[] { Double.NaN, 0L, (short) -1, (short) 1, (byte) -1 };
        double[] doubleArray25 = new double[] { (byte) 0, 'a', 1, 10.0d, 1.0d };
        double[] doubleArray28 = new double[] { 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer3.optimize((int) (short) 1, differentiableMultivariateVectorialFunction13, doubleArray19, doubleArray25, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[NaN, 0.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 97.0, 1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 10.0]");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) (byte) 10, (double) 1L, (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, (double) 0L, (double) 100L, 1.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 100.0d, (double) 1L, (double) 'a', (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        int int9 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double15 = levenbergMarquardtOptimizer14.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer14.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer14.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        double double22 = levenbergMarquardtOptimizer3.getChiSquare();
        int int23 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer5.getRMS();
        int int17 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (-1L), (double) 10L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double25 = levenbergMarquardtOptimizer24.getRMS();
        int int26 = levenbergMarquardtOptimizer24.getJacobianEvaluations();
        int int27 = levenbergMarquardtOptimizer24.getJacobianEvaluations();
        double double28 = levenbergMarquardtOptimizer24.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction32 = null;
        double[] doubleArray36 = new double[] { 10, 1.0f, 1 };
        double[] doubleArray38 = new double[] { (short) -1 };
        double[] doubleArray41 = new double[] { (short) -1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair42 = levenbergMarquardtOptimizer0.optimize((int) (short) 100, differentiableMultivariateVectorialFunction32, doubleArray36, doubleArray38, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 10.0]");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, Double.NaN, (double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 10L, (double) (short) 10, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction21 = null;
        double[] doubleArray27 = new double[] { (byte) 1, 1, 10.0d, 10.0f, 10L };
        double[] doubleArray32 = new double[] { (-1.0d), 1, (-1.0f), (short) 0 };
        double[] doubleArray34 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair35 = levenbergMarquardtOptimizer5.optimize((-1), differentiableMultivariateVectorialFunction21, doubleArray27, doubleArray32, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 1.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0]");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', (double) 10L, (double) 10, (double) 1L, (double) (byte) 100);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker6);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) (byte) 100, (double) 0L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray12 = new double[] { (-1.0f), 100.0d, (short) 10, (byte) 1, (short) 100, (short) 1 };
        double[] doubleArray18 = new double[] { 0L, 1.0d, (-1.0d), 0L, ' ' };
        double[] doubleArray20 = new double[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize(1, differentiableMultivariateVectorialFunction5, doubleArray12, doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 10.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0, -1.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double13 = levenbergMarquardtOptimizer12.getRMS();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker33 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer38 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker43 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer38.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker47 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        double double48 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker49 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker33);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker49);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1L, (-1.0d), (double) 0.0f, (double) (short) 10);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1L, (-1.0d), (double) 0.0f, (double) (short) 10);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = null;
        double[] doubleArray14 = new double[] { 1.0d, 100, (-1.0d), (byte) 10 };
        double[] doubleArray21 = new double[] { 100.0f, (byte) 0, 100, (short) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer5.optimize((int) 'a', differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 0.0, 100.0, 10.0, 0.0, 10.0]");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0, (double) (short) -1);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        int int23 = levenbergMarquardtOptimizer5.getEvaluations();
        int int24 = levenbergMarquardtOptimizer5.getEvaluations();
        int int25 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray15 = new double[] { (-1L), 10L, 100.0d, '4', (-1L), (-1L) };
        double[] doubleArray16 = new double[] {};
        double[] doubleArray18 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((int) (short) 10, differentiableMultivariateVectorialFunction8, doubleArray15, doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, 100.0, 52.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0]");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) 0, (double) (-1.0f));
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer5.getRMS();
        int int17 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker39 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker39);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (-1.0d), (double) (short) 1);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray7 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = null;
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        int int24 = levenbergMarquardtOptimizer21.getEvaluations();
        int int25 = levenbergMarquardtOptimizer21.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double30 = levenbergMarquardtOptimizer29.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = null;
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        double double33 = levenbergMarquardtOptimizer29.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int42 = levenbergMarquardtOptimizer41.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker43 = levenbergMarquardtOptimizer41.getConvergenceChecker();
        levenbergMarquardtOptimizer37.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = levenbergMarquardtOptimizer5.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) ' ', (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 1.0d, (double) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 10.0f, (double) 1L, (double) (byte) 1, (double) 100);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double18 = levenbergMarquardtOptimizer3.getRMS();
        int int19 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int24 = levenbergMarquardtOptimizer23.getEvaluations();
        int int25 = levenbergMarquardtOptimizer23.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double31 = levenbergMarquardtOptimizer30.getRMS();
        int int32 = levenbergMarquardtOptimizer30.getMaxEvaluations();
        int int33 = levenbergMarquardtOptimizer30.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        java.lang.Class<?> wildcardClass39 = vectorialPointValuePairConvergenceChecker37.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) 1.0f, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (-1L), 100.0d);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        double double14 = levenbergMarquardtOptimizer5.getChiSquare();
        double double15 = levenbergMarquardtOptimizer5.getRMS();
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0, (double) (-1), (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer5.getRMS();
        int int17 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double19 = levenbergMarquardtOptimizer5.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (-1.0d), (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 100L, (double) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = null;
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        double double11 = levenbergMarquardtOptimizer7.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int20 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        double double25 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 100, (double) 10.0f);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) (byte) 1, (double) '4', (double) (byte) 100, (double) (-1L));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 100.0f, (double) (-1L), (double) '4', 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        double double15 = levenbergMarquardtOptimizer13.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        int int21 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction28 = null;
        double[] doubleArray30 = new double[] { 10 };
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair33 = levenbergMarquardtOptimizer5.optimize((int) (short) 10, differentiableMultivariateVectorialFunction28, doubleArray30, doubleArray31, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) 0, (double) '4', (double) 100.0f, (double) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int20 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        int int22 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double27 = levenbergMarquardtOptimizer26.getRMS();
        int int28 = levenbergMarquardtOptimizer26.getMaxEvaluations();
        int int29 = levenbergMarquardtOptimizer26.getEvaluations();
        int int30 = levenbergMarquardtOptimizer26.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        java.lang.Class<?> wildcardClass39 = vectorialPointValuePairConvergenceChecker35.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) 0, (double) '4', (double) 100.0f, (double) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int29 = levenbergMarquardtOptimizer28.getMaxEvaluations();
        int int30 = levenbergMarquardtOptimizer28.getJacobianEvaluations();
        int int31 = levenbergMarquardtOptimizer28.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double36 = levenbergMarquardtOptimizer35.getRMS();
        int int37 = levenbergMarquardtOptimizer35.getMaxEvaluations();
        int int38 = levenbergMarquardtOptimizer35.getEvaluations();
        int int39 = levenbergMarquardtOptimizer35.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker44 = levenbergMarquardtOptimizer43.getConvergenceChecker();
        levenbergMarquardtOptimizer35.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker44);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 0, 0.0d, (double) 'a', 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) 1, (double) 0);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) ' ', (double) (byte) 10);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int13 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = null;
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 1.0d, (double) (short) 0);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray11 = new double[] { '4' };
        double[] doubleArray12 = null;
        double[] doubleArray18 = new double[] { 100.0f, (-1L), (byte) 10, 1.0f, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize(100, differentiableMultivariateVectorialFunction9, doubleArray11, doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, -1.0, 10.0, 1.0, 0.0]");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray16 = new double[] { 0L, 1.0d, '#', 10L, '4', 0.0d };
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction9, doubleArray16, doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0, 35.0, 10.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) 100, (double) (byte) 10, (double) (-1), (double) (byte) -1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 100L, 1.0d);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) '4', 0.0d, (double) (short) 100, 100.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, Double.NaN, (double) 10.0f, (double) 0, (double) (byte) 0);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 10L, (double) (byte) 100);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int15 = levenbergMarquardtOptimizer14.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        double double18 = levenbergMarquardtOptimizer14.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int23 = levenbergMarquardtOptimizer22.getEvaluations();
        int int24 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double30 = levenbergMarquardtOptimizer29.getRMS();
        int int31 = levenbergMarquardtOptimizer29.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer29.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker33 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction40 = null;
        double[] doubleArray43 = new double[] { 100.0d, (short) 1 };
        double[] doubleArray46 = new double[] { (short) 1, 100L };
        double[] doubleArray47 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair48 = levenbergMarquardtOptimizer5.optimize(100, differentiableMultivariateVectorialFunction40, doubleArray43, doubleArray46, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker33);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker36);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) (byte) 10, (double) (byte) 100, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray12 = new double[] { (short) 1 };
        double[] doubleArray16 = new double[] { 1.0d, (-1.0f), 100L };
        double[] doubleArray21 = new double[] { 10.0d, 'a', (byte) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer3.optimize((int) ' ', differentiableMultivariateVectorialFunction10, doubleArray12, doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 97.0, 0.0, 0.0]");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) -1, (double) 100L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) 0, (double) 100, (double) 10.0f, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double17 = levenbergMarquardtOptimizer16.getRMS();
        int int18 = levenbergMarquardtOptimizer16.getMaxEvaluations();
        int int19 = levenbergMarquardtOptimizer16.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker27 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker27);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer36.getConvergenceChecker();
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer46 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker47 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker51 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker51);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker51);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction55 = null;
        double[] doubleArray59 = new double[] { (byte) 0, (byte) 1, (-1) };
        double[] doubleArray60 = null;
        double[] doubleArray66 = new double[] { (short) 0, (-1L), 1.0d, 100.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair67 = levenbergMarquardtOptimizer5.optimize((int) (short) -1, differentiableMultivariateVectorialFunction55, doubleArray59, doubleArray60, doubleArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker27);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker47);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker51);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, -1.0, 1.0, 100.0, 1.0]");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        int int9 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray19 = new double[] { 10, (short) -1, (byte) 1, (short) 10, 0L };
        double[] doubleArray24 = new double[] { (byte) -1, '#', (byte) 0, 1.0f };
        double[] doubleArray31 = new double[] { ' ', (byte) 1, 0L, (short) 100, 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer3.optimize((-1), differentiableMultivariateVectorialFunction13, doubleArray19, doubleArray24, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 35.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 1.0, 0.0, 100.0, 97.0, 35.0]");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) '#', (double) (-1L), (double) 0L, (double) (short) 100);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray12 = new double[] { (short) 10, 10 };
        double[] doubleArray14 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer5.optimize((int) '#', differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0]");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int16 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        int int20 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass22 = vectorialPointValuePairConvergenceChecker21.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int16 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer15.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double23 = levenbergMarquardtOptimizer22.getRMS();
        int int24 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        int int25 = levenbergMarquardtOptimizer22.getEvaluations();
        int int26 = levenbergMarquardtOptimizer22.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        int int35 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) -1, (double) (byte) 100, (double) 0.0f, (double) (short) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray9 = new double[] { 100 };
        double[] doubleArray16 = new double[] { 1L, Double.NaN, ' ', (-1), 100, 1.0d };
        double[] doubleArray18 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction7, doubleArray9, doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, NaN, 32.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 10.0f, (double) (short) 0);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = null;
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer10.getEvaluations();
        double double15 = levenbergMarquardtOptimizer10.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        int int21 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        int int26 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int33 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        int int34 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer38 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double39 = levenbergMarquardtOptimizer38.getRMS();
        int int40 = levenbergMarquardtOptimizer38.getMaxEvaluations();
        int int41 = levenbergMarquardtOptimizer38.getEvaluations();
        int int42 = levenbergMarquardtOptimizer38.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer46 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker47 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer38.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        int int51 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double5 = levenbergMarquardtOptimizer4.getRMS();
        int int6 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray18 = new double[] { (-1.0d), 'a', (byte) 10, (short) 1, 1.0d, 10.0d };
        double[] doubleArray22 = new double[] { (short) 10, 10.0d, (short) 10 };
        double[] doubleArray24 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize((int) (short) -1, differentiableMultivariateVectorialFunction11, doubleArray18, doubleArray22, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 10.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0]");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray18 = new double[] { 0.0f, (short) 100, (byte) 10, 1.0f, 100L, (byte) 0 };
        double[] doubleArray20 = new double[] { 1L };
        double[] doubleArray23 = new double[] { 1.0d, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction11, doubleArray18, doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 100.0, 10.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0]");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 100L, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray15 = new double[] { Double.NaN, (short) 10, 100, (byte) 1, (short) -1, 100L };
        double[] doubleArray16 = null;
        double[] doubleArray21 = new double[] { 10, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction8, doubleArray15, doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[NaN, 10.0, 100.0, 1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 0.0, 10.0, 100.0]");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray9 = new double[] { 100.0f };
        double[] doubleArray11 = new double[] { (short) -1 };
        double[] doubleArray14 = new double[] { (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction7, doubleArray9, doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0]");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer5.getRMS();
        int int17 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double19 = levenbergMarquardtOptimizer5.getChiSquare();
        int int20 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray15 = new double[] { (-1.0f), '#', 0.0d, 0L };
        double[] doubleArray18 = new double[] { (short) 100, (byte) 0 };
        double[] doubleArray21 = new double[] { (-1.0d), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer3.optimize((int) (short) 0, differentiableMultivariateVectorialFunction10, doubleArray15, doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 35.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0]");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, 0.0d, (double) 100L, 0.0d, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer59 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker60 = levenbergMarquardtOptimizer59.getConvergenceChecker();
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialPointValuePairConvergenceChecker60);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker62 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer63 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double64 = levenbergMarquardtOptimizer63.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker65 = levenbergMarquardtOptimizer63.getConvergenceChecker();
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer74 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, 1.0d, 10.0d, (double) (byte) -1, (double) 1L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer78 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double79 = levenbergMarquardtOptimizer78.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker80 = null;
        levenbergMarquardtOptimizer78.setConvergenceChecker(vectorialPointValuePairConvergenceChecker80);
        int int82 = levenbergMarquardtOptimizer78.getEvaluations();
        double double83 = levenbergMarquardtOptimizer78.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer87 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double88 = levenbergMarquardtOptimizer87.getRMS();
        int int89 = levenbergMarquardtOptimizer87.getMaxEvaluations();
        int int90 = levenbergMarquardtOptimizer87.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker91 = levenbergMarquardtOptimizer87.getConvergenceChecker();
        levenbergMarquardtOptimizer78.setConvergenceChecker(vectorialPointValuePairConvergenceChecker91);
        levenbergMarquardtOptimizer74.setConvergenceChecker(vectorialPointValuePairConvergenceChecker91);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker91);
        java.lang.Class<?> wildcardClass95 = vectorialPointValuePairConvergenceChecker91.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker46);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker60);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker62);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker65);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker91);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 0, 10.0f, 'a', 0.0d, 10, 10.0f };
        double[] doubleArray21 = new double[] { (byte) 0 };
        double[] doubleArray28 = new double[] { (-1.0f), (short) 0, 0L, 10L, 10L, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer5.optimize((int) '#', differentiableMultivariateVectorialFunction12, doubleArray19, doubleArray21, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, 97.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 0.0, 10.0, 10.0, 1.0]");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 1, (double) (byte) 10, (double) (byte) 1, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int16 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer15.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double23 = levenbergMarquardtOptimizer22.getRMS();
        int int24 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        int int25 = levenbergMarquardtOptimizer22.getEvaluations();
        int int26 = levenbergMarquardtOptimizer22.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        int int35 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 1, (double) 10L, (double) 1L, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 10L, (double) (byte) 0, (double) (-1.0f), (double) 10L);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) (short) 10, (double) 10L, (double) (-1.0f), (double) ' ');
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray16 = new double[] { (byte) -1, (byte) 100, (-1.0f), (short) 100, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer5.optimize(100, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, -1.0, 100.0, 10.0]");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray15 = new double[] { (short) -1, 100.0d, '4', 0.0f, 10.0d, 0.0d };
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction8, doubleArray15, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 52.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 10L, (-1.0d));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray12 = new double[] { 1.0f, 'a', 100.0f };
        double[] doubleArray17 = new double[] { 0L, (byte) 1, Double.NaN, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) (byte) 10, differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0, NaN, -1.0]");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 100L, (double) (-1L), (double) 10L, (double) '4');
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double39 = levenbergMarquardtOptimizer3.getChiSquare();
        int int40 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double41 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer11.getEvaluations();
        int int15 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        java.lang.Class<?> wildcardClass23 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, Double.NaN, (double) 100.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        int int27 = levenbergMarquardtOptimizer26.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int36 = levenbergMarquardtOptimizer35.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int44 = levenbergMarquardtOptimizer43.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer48 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int49 = levenbergMarquardtOptimizer48.getJacobianEvaluations();
        int int50 = levenbergMarquardtOptimizer48.getMaxEvaluations();
        int int51 = levenbergMarquardtOptimizer48.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer55 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker56 = levenbergMarquardtOptimizer55.getConvergenceChecker();
        int int57 = levenbergMarquardtOptimizer55.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker58 = levenbergMarquardtOptimizer55.getConvergenceChecker();
        levenbergMarquardtOptimizer48.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer43.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        double double63 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker58);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 100.0f, (double) (-1L), (double) '4', 10.0d);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double18 = levenbergMarquardtOptimizer17.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer3.getEvaluations();
        int int13 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double14 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (byte) 1, (double) 0.0f);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, (double) (short) -1, 10.0d);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray11 = new double[] { (short) 1, 1, ' ', ' ' };
        double[] doubleArray16 = new double[] { 1L, 10, (-1L), (short) 1 };
        double[] doubleArray22 = new double[] { (short) 1, 100L, 'a', (-1), 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer3.optimize((int) '#', differentiableMultivariateVectorialFunction6, doubleArray11, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0, 97.0, -1.0, 10.0]");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int13 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double15 = levenbergMarquardtOptimizer14.getChiSquare();
        int int16 = levenbergMarquardtOptimizer14.getEvaluations();
        int int17 = levenbergMarquardtOptimizer14.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = null;
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int22 = levenbergMarquardtOptimizer21.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        double double27 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass28 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) -1, 10.0d, (double) (-1L), (double) 'a');
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double39 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker40 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double41 = levenbergMarquardtOptimizer3.getChiSquare();
        double double42 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, 1.0d, (double) 100, (double) 100, (-1.0d));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray9 = new double[] { (byte) 100 };
        double[] doubleArray14 = new double[] { '4', 100, 100, Double.NaN };
        double[] doubleArray18 = new double[] { 10L, 0L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize(100, differentiableMultivariateVectorialFunction7, doubleArray9, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, 100.0, 100.0, NaN]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 0.0, 10.0]");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (short) 0, (double) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int8 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int13 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        int int21 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        int int26 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double27 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer3.getEvaluations();
        int int13 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker27 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker27);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction32 = null;
        double[] doubleArray37 = new double[] { 1.0d, 100, '#', (short) 10 };
        double[] doubleArray40 = new double[] { (short) 100, (-1L) };
        double[] doubleArray44 = new double[] { (short) 100, 10L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair45 = levenbergMarquardtOptimizer3.optimize((int) (short) 10, differentiableMultivariateVectorialFunction32, doubleArray37, doubleArray40, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker27);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 100.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 10.0, 10.0]");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 1, (double) (byte) 10, (double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray13 = null;
        double[] doubleArray14 = new double[] {};
        double[] doubleArray19 = new double[] { (short) 10, 0.0f, ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction12, doubleArray13, doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0, 32.0, 32.0]");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) 100, (double) 1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray10 = new double[] { (short) 100, 100.0d, (-1.0f), 1 };
        double[] doubleArray11 = null;
        double[] doubleArray16 = new double[] { (short) 1, 1, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer3.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction5, doubleArray10, doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 100.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, 32.0, 1.0]");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) -1, (double) 100L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 1L, (double) (short) 1);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) '#', (double) 0, (double) 0L, (double) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int10 = levenbergMarquardtOptimizer9.getEvaluations();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer9.getRMS();
        int int13 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1.0f));
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = null;
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        int int16 = levenbergMarquardtOptimizer13.getEvaluations();
        int int17 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double22 = levenbergMarquardtOptimizer21.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = null;
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        double double25 = levenbergMarquardtOptimizer21.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int34 = levenbergMarquardtOptimizer33.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray40 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getEvaluations();
        int int11 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { (short) -1, (byte) 10, (byte) -1, 0, (byte) 1, (byte) 1 };
        double[] doubleArray25 = new double[] { 0L, 10.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction13, doubleArray14, doubleArray21, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 10.0, 0.0]");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 100, (double) (byte) 10, (double) 10L, (double) (-1));
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 1, (double) (byte) 100);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, (double) (short) -1);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 100L, 1.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray8 = new double[] { 'a', 10.0d };
        double[] doubleArray15 = new double[] { (short) 0, (-1.0d), 1L, (short) 10, (byte) 10, ' ' };
        double[] doubleArray22 = new double[] { Double.NaN, 1.0d, (byte) 10, (-1.0f), 0L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer3.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction5, doubleArray8, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, -1.0, 1.0, 10.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[NaN, 1.0, 10.0, -1.0, 0.0, -1.0]");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 1, (double) (byte) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        double double9 = levenbergMarquardtOptimizer7.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        int int21 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double27 = levenbergMarquardtOptimizer26.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        int int29 = levenbergMarquardtOptimizer26.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        int int31 = levenbergMarquardtOptimizer26.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker32 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker32);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) (byte) 10, (double) 1L, (-1.0d));
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray14 = new double[] { '#', 'a', (byte) 0, (-1.0f), '4' };
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction8, doubleArray14, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 97.0, 0.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 100.0f, (double) (byte) -1, (double) 1, (double) 100L);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray11 = new double[] { 0.0d };
        double[] doubleArray14 = new double[] { (short) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize(1, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, 100.0d, (double) 10);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1.0f));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray9 = new double[] { 10L, 0L, (-1.0d) };
        double[] doubleArray13 = new double[] { Double.NaN, (short) 100, 0 };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction5, doubleArray9, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[NaN, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, 0.0d, (double) 1L);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) (byte) 0, (double) 0L);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 0, (double) 1.0f);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray9 = new double[] { ' ', (-1.0f) };
        double[] doubleArray15 = new double[] { 0.0d, (short) 0, 'a', 10, 10L };
        double[] doubleArray19 = new double[] { 100.0f, 10L, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer3.optimize((-1), differentiableMultivariateVectorialFunction6, doubleArray9, doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 97.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 0.0]");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1L, (-1.0d), (double) 0.0f, (double) (short) 10);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) 100L, (double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = null;
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int17 = levenbergMarquardtOptimizer16.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double22 = levenbergMarquardtOptimizer21.getRMS();
        int int23 = levenbergMarquardtOptimizer21.getMaxEvaluations();
        int int24 = levenbergMarquardtOptimizer21.getEvaluations();
        int int25 = levenbergMarquardtOptimizer21.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker30);
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker30);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker30);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker30);
        double double35 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass36 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 0.0d, (-1.0d));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) 0.0f, (double) (byte) 0, (double) ' ', (double) 1.0f);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) (-1.0f), (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) 100L, (double) 'a');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        double double8 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray16 = new double[] { 0.0d, 1.0f, (short) 0 };
        double[] doubleArray19 = new double[] { 100.0f, (byte) 1 };
        double[] doubleArray26 = new double[] { 1.0f, (short) 0, (short) 100, 0L, (-1), 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer3.optimize((int) (short) -1, differentiableMultivariateVectorialFunction12, doubleArray16, doubleArray19, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 0.0, 100.0, 0.0, -1.0, 0.0]");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray15 = new double[] { (byte) 0, (-1.0d), (byte) 0, 10, 10.0f };
        double[] doubleArray18 = new double[] { 10, '#' };
        double[] doubleArray23 = new double[] { 0, 10L, (-1.0f), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer3.optimize(10, differentiableMultivariateVectorialFunction9, doubleArray15, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, -1.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 10.0, -1.0, -1.0]");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, 1.0d, 10.0d, (double) (byte) -1, (double) 1L);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, 1.0d, 10.0d, (double) (byte) -1, (double) 1L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = null;
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer9.getEvaluations();
        double double14 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double19 = levenbergMarquardtOptimizer18.getRMS();
        int int20 = levenbergMarquardtOptimizer18.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer18.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        int int25 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 0L, 0.0d, (double) 10.0f, (double) 0L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, 1.0d, (double) 10, Double.NaN, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        java.lang.Class<?> wildcardClass14 = vectorialPointValuePairConvergenceChecker12.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', (double) '4', (double) (short) -1, 0.0d, (double) 100L);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int18 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) '#', (double) 0, (double) 0L, (double) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int29 = levenbergMarquardtOptimizer28.getEvaluations();
        int int30 = levenbergMarquardtOptimizer28.getMaxEvaluations();
        double double31 = levenbergMarquardtOptimizer28.getRMS();
        int int32 = levenbergMarquardtOptimizer28.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker33 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        double double37 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker33);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 1, (double) (byte) -1, (double) 0, (double) (byte) 1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 1L, 100L, 0 };
        double[] doubleArray15 = new double[] { (short) 1, (-1L) };
        double[] doubleArray19 = new double[] { (byte) -1, (short) 100, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer5.optimize((int) '4', differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 10.0]");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0, (double) (-1), (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer5.getRMS();
        int int17 = levenbergMarquardtOptimizer5.getEvaluations();
        int int18 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int19 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction21 = null;
        double[] doubleArray24 = new double[] { 1.0f, (short) 100 };
        double[] doubleArray30 = new double[] { (byte) -1, (-1.0f), 1, (-1L), '4' };
        double[] doubleArray37 = new double[] { (byte) 1, (byte) 10, 10.0f, 0.0f, (-1.0d), 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair38 = levenbergMarquardtOptimizer5.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction21, doubleArray24, doubleArray30, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 1.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0, 10.0, 0.0, -1.0, 100.0]");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray11 = new double[] { 100, 10, 100, '#' };
        double[] doubleArray14 = new double[] { 10, 100L };
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer3.optimize((int) (short) 0, differentiableMultivariateVectorialFunction6, doubleArray11, doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) -1, (double) (byte) 100);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int11 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        int int19 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer17.getEvaluations();
        int int21 = levenbergMarquardtOptimizer17.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        double double30 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 0.0f, (double) (short) 100, 0.0d, (double) 100L);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) -1, (double) (-1));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) '#', (double) 0.0f, (double) (short) 10, (double) 0.0f);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (-1.0d), (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double14 = levenbergMarquardtOptimizer13.getRMS();
        int int15 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        int int16 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker44 = levenbergMarquardtOptimizer43.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer55 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker56 = levenbergMarquardtOptimizer55.getConvergenceChecker();
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer63 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer69 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker70 = levenbergMarquardtOptimizer69.getConvergenceChecker();
        levenbergMarquardtOptimizer63.setConvergenceChecker(vectorialPointValuePairConvergenceChecker70);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker72 = levenbergMarquardtOptimizer63.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer73 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double74 = levenbergMarquardtOptimizer73.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker75 = levenbergMarquardtOptimizer73.getConvergenceChecker();
        levenbergMarquardtOptimizer63.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        java.lang.Class<?> wildcardClass81 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker56);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker70);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker72);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker75);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (-1.0f), (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) -1, (double) (-1));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction3 = null;
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 100, 100.0d };
        double[] doubleArray14 = new double[] { 10L, ' ', 100.0d, '#', (byte) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.optimize((int) (short) 100, differentiableMultivariateVectorialFunction3, doubleArray4, doubleArray7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 32.0, 100.0, 35.0, 10.0, 35.0]");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 0.0f, (double) 0, (double) (short) 100, (double) 10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 0.0d, (-1.0d));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer3.getEvaluations();
        int int13 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double31 = levenbergMarquardtOptimizer30.getRMS();
        int int32 = levenbergMarquardtOptimizer30.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker33 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker45 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer40.setConvergenceChecker(vectorialPointValuePairConvergenceChecker45);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer50 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer54 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker55 = levenbergMarquardtOptimizer54.getConvergenceChecker();
        levenbergMarquardtOptimizer50.setConvergenceChecker(vectorialPointValuePairConvergenceChecker55);
        levenbergMarquardtOptimizer40.setConvergenceChecker(vectorialPointValuePairConvergenceChecker55);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker55);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker55);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker33);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker45);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker55);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray17 = new double[] { (byte) 0, Double.NaN, (byte) 10, (byte) 0 };
        double[] doubleArray20 = new double[] { '#', (short) 10 };
        double[] doubleArray25 = new double[] { ' ', 10L, 100.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer3.optimize((int) (short) 1, differentiableMultivariateVectorialFunction12, doubleArray17, doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, NaN, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 10.0, 100.0, 10.0]");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 0, (double) (-1), (double) (short) 1, (double) (-1.0f));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = null;
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker6);
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double25 = levenbergMarquardtOptimizer24.getRMS();
        int int26 = levenbergMarquardtOptimizer24.getMaxEvaluations();
        int int27 = levenbergMarquardtOptimizer24.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker45 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer40.setConvergenceChecker(vectorialPointValuePairConvergenceChecker45);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer50 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer54 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker55 = levenbergMarquardtOptimizer54.getConvergenceChecker();
        levenbergMarquardtOptimizer50.setConvergenceChecker(vectorialPointValuePairConvergenceChecker55);
        levenbergMarquardtOptimizer40.setConvergenceChecker(vectorialPointValuePairConvergenceChecker55);
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker55);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker55);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker60 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker60);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker45);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker55);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker60);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 1.0f, (double) (-1), 1.0d, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) (short) -1, 0.0d, (double) (byte) 10, (double) (short) 1);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 10.0d, (double) (short) 1, (double) ' ', Double.NaN);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 0.0d, (byte) 0, (-1.0f), 1, ' ' };
        double[] doubleArray16 = new double[] { (byte) -1, (short) -1 };
        double[] doubleArray20 = new double[] { 1.0f, (short) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize(10, differentiableMultivariateVectorialFunction6, doubleArray13, doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 0.0, -1.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 1.0]");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1L), (double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 100.0d, 10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int12 = levenbergMarquardtOptimizer11.getEvaluations();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double19 = levenbergMarquardtOptimizer18.getRMS();
        int int20 = levenbergMarquardtOptimizer18.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer18.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double35 = levenbergMarquardtOptimizer34.getRMS();
        int int36 = levenbergMarquardtOptimizer34.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        double double42 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction44 = null;
        double[] doubleArray45 = new double[] {};
        double[] doubleArray47 = new double[] { 1 };
        double[] doubleArray51 = new double[] { 10L, (byte) 100, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair52 = levenbergMarquardtOptimizer3.optimize((int) '4', differentiableMultivariateVectorialFunction44, doubleArray45, doubleArray47, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 100.0, 1.0]");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, Double.NaN, (double) 0, (-1.0d), (double) (byte) 100);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 'a', (double) (byte) 100, (double) 100, (double) (short) 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        int int18 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int19 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) ' ', (double) 10L, (double) 0, (double) ' ');
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray13 = new double[] { (short) 100, 10, (short) 1, 1.0d };
        double[] doubleArray17 = new double[] { (short) 0, 100.0f, (short) 100 };
        double[] doubleArray20 = new double[] { '4', 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction8, doubleArray13, doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 1.0]");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) ' ', (double) 10L, (double) 0, (double) ' ');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = null;
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker6);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) -1, (double) (byte) 100);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int11 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        int int19 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer17.getEvaluations();
        int int21 = levenbergMarquardtOptimizer17.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        int int30 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = vectorialPointValuePairConvergenceChecker5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double double11 = levenbergMarquardtOptimizer5.getChiSquare();
        int int12 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction23 = null;
        double[] doubleArray27 = new double[] { (short) 100, 10.0d, (byte) 10 };
        double[] doubleArray28 = null;
        double[] doubleArray30 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair31 = levenbergMarquardtOptimizer5.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction23, doubleArray27, doubleArray28, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0]");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (byte) 100, Double.NaN, (double) (byte) -1, (double) 10L);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 100L, (double) '#', (-1.0d), (double) 1.0f);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 10L, (double) (short) 10, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 100L, 1.0d);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        int int10 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer8.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer38 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker39 = levenbergMarquardtOptimizer38.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker43 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        double double45 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int47 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double48 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker39);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer3.getRMS();
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int12 = levenbergMarquardtOptimizer11.getEvaluations();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        int int19 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer17.getJacobianEvaluations();
        double double21 = levenbergMarquardtOptimizer17.getChiSquare();
        int int22 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double27 = levenbergMarquardtOptimizer26.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = null;
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        int int30 = levenbergMarquardtOptimizer26.getEvaluations();
        double double31 = levenbergMarquardtOptimizer26.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double36 = levenbergMarquardtOptimizer35.getRMS();
        int int37 = levenbergMarquardtOptimizer35.getMaxEvaluations();
        int int38 = levenbergMarquardtOptimizer35.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker39 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int50 = levenbergMarquardtOptimizer49.getJacobianEvaluations();
        int int51 = levenbergMarquardtOptimizer49.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer57 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker58 = levenbergMarquardtOptimizer57.getConvergenceChecker();
        double double59 = levenbergMarquardtOptimizer57.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer63 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double64 = levenbergMarquardtOptimizer63.getRMS();
        int int65 = levenbergMarquardtOptimizer63.getMaxEvaluations();
        int int66 = levenbergMarquardtOptimizer63.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker67 = levenbergMarquardtOptimizer63.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker68 = levenbergMarquardtOptimizer63.getConvergenceChecker();
        levenbergMarquardtOptimizer57.setConvergenceChecker(vectorialPointValuePairConvergenceChecker68);
        levenbergMarquardtOptimizer49.setConvergenceChecker(vectorialPointValuePairConvergenceChecker68);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker68);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray72 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker39);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker58);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker67);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker68);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        int int10 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer8.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer38 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker39 = levenbergMarquardtOptimizer38.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker43 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        double double45 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker39);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker46);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double17 = levenbergMarquardtOptimizer16.getRMS();
        int int18 = levenbergMarquardtOptimizer16.getJacobianEvaluations();
        int int19 = levenbergMarquardtOptimizer16.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        java.lang.Class<?> wildcardClass23 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (short) 100, 0.0d, (double) (byte) 100, Double.NaN);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1, (double) '#', (double) (short) 10, (double) (-1.0f));
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (short) 0, (double) (-1), 0.0d, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, (double) 0L, (double) 100L, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0, (double) (-1), (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1, (double) (short) 10);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer3.getChiSquare();
        int int14 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (-1L), (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        java.lang.Class<?> wildcardClass19 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker27 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker27);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double35 = levenbergMarquardtOptimizer34.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double40 = levenbergMarquardtOptimizer39.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker41 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        double double44 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker27);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) (-1), 0.0d, (double) 10L, Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, Double.NaN, (double) 100.0f);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, 1.0d, (double) 10, Double.NaN, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        int int10 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        double double43 = levenbergMarquardtOptimizer3.getRMS();
        double double44 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, 0.0d, 0.0d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer5.getRMS();
        int int17 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction20 = null;
        double[] doubleArray22 = new double[] { Double.NaN };
        double[] doubleArray23 = new double[] {};
        double[] doubleArray27 = new double[] { (short) 100, ' ', 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer5.optimize((int) (short) -1, differentiableMultivariateVectorialFunction20, doubleArray22, doubleArray23, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 32.0, 0.0]");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) 100L, (double) (byte) 10);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, 1.0d, (double) 10, Double.NaN, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int13 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        int int19 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer17.getEvaluations();
        int int21 = levenbergMarquardtOptimizer17.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        java.lang.Class<?> wildcardClass30 = vectorialPointValuePairConvergenceChecker26.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (byte) 0, (double) (short) 0, (-1.0d), (double) 100.0f);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) 10L, (double) (byte) 100);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) 0L, (double) (byte) 10, (double) (-1L), (double) 1.0f);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, 10.0d, (double) (byte) -1);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0L, (double) (byte) 1, (double) 'a');
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) (byte) 10, (double) 1L, (-1.0d));
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 0.0f, (double) (short) 100, 0.0d, (double) 100L);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 100.0f, (double) (byte) 100, (double) 10.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (-1L), (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) -1, (double) (byte) 100, (double) 0.0f, (double) (short) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray15 = new double[] { 10, (short) 0, 10L, (short) 0, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer5.optimize((int) 'a', differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 0.0, 10.0, 0.0, 0.0]");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer59 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker60 = levenbergMarquardtOptimizer59.getConvergenceChecker();
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialPointValuePairConvergenceChecker60);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker62 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer63 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double64 = levenbergMarquardtOptimizer63.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker65 = levenbergMarquardtOptimizer63.getConvergenceChecker();
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        int int69 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker46);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker60);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker62);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10.0f, (double) ' ', (double) ' ', (double) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray14 = new double[] { (-1.0d), 100, Double.NaN, 1L, (byte) 0, 'a' };
        double[] doubleArray20 = new double[] { 1.0f, 10.0d, '4', 1L, (short) 1 };
        double[] doubleArray25 = new double[] { 10.0f, 0.0d, (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction7, doubleArray14, doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, NaN, 1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 10.0, 52.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 0.0, -1.0, 100.0]");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int16 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        double double20 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass21 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) (short) 0, (double) (short) 100);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (-1L), (double) 0);
        int int10 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        int int17 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) 10, 1.0d);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (-1.0d), (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray14 = new double[] { 0, 100.0d, (byte) 10, (byte) 1, 0L, 10.0f };
        double[] doubleArray16 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer3.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction6, doubleArray7, doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 100.0, 10.0, 1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0]");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double13 = levenbergMarquardtOptimizer12.getChiSquare();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 0L, 1.0d, 1.0d, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        int int11 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) (short) 10, (double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 0.0d, (double) 'a', (double) 1, (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 1, (double) 1);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) 100, (double) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int10 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        double double19 = levenbergMarquardtOptimizer17.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double24 = levenbergMarquardtOptimizer23.getRMS();
        int int25 = levenbergMarquardtOptimizer23.getMaxEvaluations();
        int int26 = levenbergMarquardtOptimizer23.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker27 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker27);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker27 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker27);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double35 = levenbergMarquardtOptimizer34.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double40 = levenbergMarquardtOptimizer39.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker41 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        int int44 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker27);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) 0, (double) 100, (double) 10.0f, (double) (short) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray9 = new double[] { (short) -1 };
        double[] doubleArray11 = new double[] { '4' };
        double[] doubleArray13 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer5.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction7, doubleArray9, doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray12 = new double[] { 0L, (-1.0f) };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray18 = new double[] { 1.0f, (short) 100, 1L, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((-1), differentiableMultivariateVectorialFunction9, doubleArray12, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 100.0, 1.0, 10.0]");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, 0.0d, (double) (byte) 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 1, (double) 10L, (double) 1L, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray8 = new double[] { Double.NaN };
        double[] doubleArray10 = new double[] { 0.0f };
        double[] doubleArray14 = new double[] { 10L, '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize(1, differentiableMultivariateVectorialFunction6, doubleArray8, doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 35.0, 0.0]");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) -1, (double) (byte) 100);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) 1.0f, (double) 100.0f, (double) 100.0f, 10.0d);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker1);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (-1.0f), Double.NaN);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 0L, 0.0d, (double) 10.0f, (double) 0L);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        double double38 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker39 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker40 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int41 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker39);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) ' ', (-1.0d), Double.NaN);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) 10.0f, 100.0d, (double) (-1), Double.NaN);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 100L, (double) 'a');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer5.getEvaluations();
        double double17 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, Double.NaN, 1.0d, Double.NaN, (double) (-1L));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray17 = new double[] { 10, 1, (byte) -1, 100.0f, (short) 0, (-1) };
        double[] doubleArray20 = new double[] { (byte) 1, 'a' };
        double[] doubleArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction10, doubleArray17, doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 1.0, -1.0, 100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 97.0]");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) 100, (double) (byte) 10, (double) (-1), (double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 0, (double) (-1), (double) (short) 1, (double) (-1.0f));
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double43 = levenbergMarquardtOptimizer42.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer47 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double48 = levenbergMarquardtOptimizer47.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker49 = levenbergMarquardtOptimizer47.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setConvergenceChecker(vectorialPointValuePairConvergenceChecker49);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker49);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker49);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker49);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 1, (double) (byte) 10, (double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int12 = levenbergMarquardtOptimizer11.getEvaluations();
        double double13 = levenbergMarquardtOptimizer11.getChiSquare();
        int int14 = levenbergMarquardtOptimizer11.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) 1L, 0.0d, (double) (-1L), (double) (short) -1);
        int int23 = levenbergMarquardtOptimizer22.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 10L, 0.0d, (double) 10.0f, (double) 10L);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int14 = levenbergMarquardtOptimizer13.getEvaluations();
        double double15 = levenbergMarquardtOptimizer13.getRMS();
        int int16 = levenbergMarquardtOptimizer13.getEvaluations();
        int int17 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        int int19 = levenbergMarquardtOptimizer13.getEvaluations();
        int int20 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        double double27 = levenbergMarquardtOptimizer26.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        double double34 = levenbergMarquardtOptimizer33.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker40 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double45 = levenbergMarquardtOptimizer44.getRMS();
        int int46 = levenbergMarquardtOptimizer44.getMaxEvaluations();
        int int47 = levenbergMarquardtOptimizer44.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker48 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer54 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker55 = levenbergMarquardtOptimizer54.getConvergenceChecker();
        levenbergMarquardtOptimizer44.setConvergenceChecker(vectorialPointValuePairConvergenceChecker55);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer60 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer64 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker65 = levenbergMarquardtOptimizer64.getConvergenceChecker();
        levenbergMarquardtOptimizer60.setConvergenceChecker(vectorialPointValuePairConvergenceChecker65);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer70 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer74 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker75 = levenbergMarquardtOptimizer74.getConvergenceChecker();
        levenbergMarquardtOptimizer70.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        levenbergMarquardtOptimizer60.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        levenbergMarquardtOptimizer44.setConvergenceChecker(vectorialPointValuePairConvergenceChecker75);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker79 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker40);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker48);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker55);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker65);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker75);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker79);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 10L, (-1.0d), (-1.0d), (double) (-1));
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) ' ', (double) (byte) 10);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        double double15 = levenbergMarquardtOptimizer13.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        int int21 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        int int27 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double28 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 0L, 1.0d, 1.0d, (double) '4');
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        int int9 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray17 = new double[] {};
        double[] doubleArray18 = new double[] {};
        double[] doubleArray23 = new double[] { 10L, 10, 0.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer3.optimize((int) (byte) 10, differentiableMultivariateVectorialFunction16, doubleArray17, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 10.0, 0.0, 100.0]");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer23.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        double double43 = levenbergMarquardtOptimizer3.getChiSquare();
        int int44 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double39 = levenbergMarquardtOptimizer3.getRMS();
        double double40 = levenbergMarquardtOptimizer3.getChiSquare();
        int int41 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction43 = null;
        double[] doubleArray44 = new double[] {};
        double[] doubleArray46 = new double[] { 10.0d };
        double[] doubleArray50 = new double[] { 0L, (-1.0f), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair51 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction43, doubleArray44, doubleArray46, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, -1.0, 100.0]");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) '#', (double) (short) 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 'a', (double) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction21 = null;
        double[] doubleArray23 = new double[] { (short) -1 };
        double[] doubleArray26 = new double[] { 100.0d, 0L };
        double[] doubleArray31 = new double[] { 'a', 100.0f, (-1.0f), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer3.optimize((int) (short) -1, differentiableMultivariateVectorialFunction21, doubleArray23, doubleArray26, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 100.0, -1.0, -1.0]");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 100L, (double) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        double double17 = levenbergMarquardtOptimizer16.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        int int11 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 0, (double) 1.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) 0, (double) '4', (double) 100.0f, (double) (short) 1);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1L), (double) 10.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray10 = new double[] { (byte) 0, 0, 10, (-1) };
        double[] doubleArray11 = new double[] {};
        double[] doubleArray17 = new double[] { (short) 100, 10.0f, 10, 10.0d, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) ' ', differentiableMultivariateVectorialFunction5, doubleArray10, doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 10.0, 10.0, 97.0]");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) (short) -1, (double) 0);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray9 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, 0.0d, 100.0d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) 100, (double) (byte) 10, (double) (-1), (double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double39 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int44 = levenbergMarquardtOptimizer43.getJacobianEvaluations();
        double double45 = levenbergMarquardtOptimizer43.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double50 = levenbergMarquardtOptimizer49.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker51 = null;
        levenbergMarquardtOptimizer49.setConvergenceChecker(vectorialPointValuePairConvergenceChecker51);
        double double53 = levenbergMarquardtOptimizer49.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer57 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer61 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int62 = levenbergMarquardtOptimizer61.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker63 = levenbergMarquardtOptimizer61.getConvergenceChecker();
        levenbergMarquardtOptimizer57.setConvergenceChecker(vectorialPointValuePairConvergenceChecker63);
        levenbergMarquardtOptimizer49.setConvergenceChecker(vectorialPointValuePairConvergenceChecker63);
        levenbergMarquardtOptimizer43.setConvergenceChecker(vectorialPointValuePairConvergenceChecker63);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker63);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray68 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker63);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        int int13 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        int int22 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int23 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (short) -1, 0.0d);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray17 = new double[] { (byte) 1, 'a', 0.0f, 10, 100.0f, (short) 10 };
        double[] doubleArray20 = new double[] { 10L, (short) 100 };
        double[] doubleArray23 = new double[] { 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer5.optimize((int) (short) 0, differentiableMultivariateVectorialFunction10, doubleArray17, doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 97.0, 0.0, 10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 35.0]");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, (double) 0.0f, (double) ' ', (double) 10, (double) (short) -1);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, 10.0d, (double) ' ', (double) 10, 100.0d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, 0.0d, (double) (-1L));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, 10.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) '#', (double) 100L, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray11 = new double[] { (short) 100, 1L, (-1) };
        double[] doubleArray13 = new double[] { 100 };
        double[] doubleArray16 = new double[] { (short) 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer5.optimize(1, differentiableMultivariateVectorialFunction7, doubleArray11, doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, -1.0]");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        int int17 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        double double21 = levenbergMarquardtOptimizer11.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double26 = levenbergMarquardtOptimizer25.getRMS();
        int int27 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        int int28 = levenbergMarquardtOptimizer25.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer55 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker56 = levenbergMarquardtOptimizer55.getConvergenceChecker();
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer63 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer67 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker68 = levenbergMarquardtOptimizer67.getConvergenceChecker();
        levenbergMarquardtOptimizer63.setConvergenceChecker(vectorialPointValuePairConvergenceChecker68);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer75 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer81 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker82 = levenbergMarquardtOptimizer81.getConvergenceChecker();
        levenbergMarquardtOptimizer75.setConvergenceChecker(vectorialPointValuePairConvergenceChecker82);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker84 = levenbergMarquardtOptimizer75.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer85 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double86 = levenbergMarquardtOptimizer85.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker87 = levenbergMarquardtOptimizer85.getConvergenceChecker();
        levenbergMarquardtOptimizer75.setConvergenceChecker(vectorialPointValuePairConvergenceChecker87);
        levenbergMarquardtOptimizer63.setConvergenceChecker(vectorialPointValuePairConvergenceChecker87);
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker87);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker87);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker87);
        double double93 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker36);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker46);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker56);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker68);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker82);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker84);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker87);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (short) 0, (double) 1L, (double) ' ', (double) (byte) 0);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double double11 = levenbergMarquardtOptimizer5.getRMS();
        int int12 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (short) 100, (-1.0d), 0.0d, (double) (byte) 10);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { 1, 100.0d, 0, 100.0d, 1 };
        double[] doubleArray20 = new double[] { 10, 1, 0.0d, 10.0f, (short) 1, (-1L) };
        double[] doubleArray24 = new double[] { (byte) 1, 0.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer3.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray20, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 0.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 1.0, 0.0, 10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 0.0, 0.0]");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) (short) -1, (double) (short) 0, 10.0d, 0.0d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (byte) 10, 0.0d, (double) 'a', 0.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { 10L, (byte) 0, ' ', 10.0f };
        double[] doubleArray17 = new double[] { 0.0d, 10L, (byte) 0, 10 };
        double[] doubleArray19 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer5.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 0.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 10.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 0, (double) (-1.0f), Double.NaN, (double) (short) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = null;
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker6);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (byte) 10, (double) ' ', (double) (-1), (double) (byte) 10);
        int int14 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double21 = levenbergMarquardtOptimizer20.getChiSquare();
        int int22 = levenbergMarquardtOptimizer20.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = null;
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        int int39 = levenbergMarquardtOptimizer36.getEvaluations();
        int int40 = levenbergMarquardtOptimizer36.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double45 = levenbergMarquardtOptimizer44.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = null;
        levenbergMarquardtOptimizer44.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        double double48 = levenbergMarquardtOptimizer44.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer56 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int57 = levenbergMarquardtOptimizer56.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker58 = levenbergMarquardtOptimizer56.getConvergenceChecker();
        levenbergMarquardtOptimizer52.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer44.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        java.lang.Class<?> wildcardClass66 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker58);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) 100L, (double) (byte) 10);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10, (double) 0L, (double) 100L, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker7);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray15 = new double[] { (-1.0d), 0.0f, (byte) 1, (short) 0 };
        double[] doubleArray19 = new double[] { 1L, (byte) 100, (short) 0 };
        double[] doubleArray21 = new double[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction10, doubleArray15, doubleArray19, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0]");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0, (double) (-1), (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 1, (double) 10L, (double) 1L, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray11 = new double[] { 1.0d, (short) 1 };
        double[] doubleArray15 = new double[] { 10L, 100.0d, 100 };
        double[] doubleArray21 = new double[] { (short) 1, '4', (short) 100, (-1), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer5.optimize((int) 'a', differentiableMultivariateVectorialFunction8, doubleArray11, doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 52.0, 100.0, -1.0, 10.0]");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray10 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }
}

