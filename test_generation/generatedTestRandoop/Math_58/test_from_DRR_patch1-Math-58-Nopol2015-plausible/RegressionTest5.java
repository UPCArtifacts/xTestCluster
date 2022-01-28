import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) 0.0f, (double) 10.0f);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        double double12 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        java.lang.Class<?> wildcardClass14 = vectorialPointValuePairConvergenceChecker13.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (short) 10, (double) '#', (double) 10L, (double) 1.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { 1.0d, (short) 100, 1L, 100L, (byte) -1 };
        double[] doubleArray19 = new double[] { 10.0f, 1, '#', (-1), (short) 0 };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer5.optimize((int) (short) 1, differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 1.0, 35.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) 'a', (double) 'a', (double) (short) 10, (double) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) 10, (double) '4', (double) 10L);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (-1.0d), (double) (byte) 10, (double) 1);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (-1.0f), (double) (short) -1, (double) 1, (double) (-1));
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 100.0f, (double) 'a', 0.0d, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        double double18 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) (byte) 0, (double) (byte) 100);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker6);
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray13 = new double[] {};
        double[] doubleArray19 = new double[] { 'a', 0L, (byte) 0, '4', (short) 1 };
        double[] doubleArray22 = new double[] { (byte) 1, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer5.optimize((-1), differentiableMultivariateVectorialFunction12, doubleArray13, doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 0.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 10.0]");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), 0.0d, (double) 0.0f);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (-1L), (double) ' ', (double) 0L, (double) (short) -1);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, 0.0d, 10.0d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int31 = levenbergMarquardtOptimizer3.getEvaluations();
        int int32 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker26);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, Double.NaN, (double) (short) 100, (double) 10L, (double) 10L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray16 = new double[] { 1, (byte) 100, 100.0f, (-1L), (-1L), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer5.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, 100.0, -1.0, -1.0, 1.0]");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) 1.0f, (double) 1L);
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
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) 'a', (double) 'a', (double) (short) 10, (double) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
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
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int31 = levenbergMarquardtOptimizer30.getJacobianEvaluations();
        int int32 = levenbergMarquardtOptimizer30.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker33 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker33);
        double double35 = levenbergMarquardtOptimizer5.getRMS();
        int int36 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker33);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, 1.0d, (double) (-1.0f));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 100, (double) (byte) 10, (double) 10L, (double) (-1));
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (byte) 100, 100.0d, (double) (-1.0f), (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double10 = levenbergMarquardtOptimizer5.getRMS();
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) 0L, 0.0d, (double) 100, (double) (short) 1);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (-1), (double) (short) 1);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) -1, Double.NaN);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, 100.0d, (double) 100, (double) (-1L), (double) (byte) 0);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (byte) 0, (double) (short) 0, (-1.0d), (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 100.0f, (double) 100.0f, 0.0d, (double) 'a');
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (short) 1, (double) 1.0f, (double) (short) 10, 100.0d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), 1.0d, (double) 1.0f, (-1.0d), (double) (byte) -1);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 100L, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray11 = new double[] { '4' };
        double[] doubleArray13 = new double[] { (byte) 100 };
        double[] doubleArray20 = new double[] { Double.NaN, 100, (short) 0, (byte) 100, (short) 100, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) (byte) 10, differentiableMultivariateVectorialFunction9, doubleArray11, doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[NaN, 100.0, 0.0, 100.0, 100.0, 100.0]");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (-1.0d), (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) 0L, (double) (byte) -1, 1.0d, (double) (short) 10);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) (byte) 10, (double) '4', (double) (short) 10, (double) (short) -1);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double9 = levenbergMarquardtOptimizer8.getChiSquare();
        int int10 = levenbergMarquardtOptimizer8.getEvaluations();
        double double11 = levenbergMarquardtOptimizer8.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        int int11 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', (double) (byte) -1, 100.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray13 = new double[] { '4', (short) -1, (short) 0, 1, '4', (short) 1 };
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { 10, 10.0d, (short) 0, (byte) 10, 100.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer3.optimize((int) 'a', differentiableMultivariateVectorialFunction6, doubleArray13, doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, -1.0, 0.0, 1.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 10.0, 0.0, 10.0, 100.0, -1.0]");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) 0, Double.NaN, 100.0d, (double) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        int int19 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 10L, (double) 'a');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', (double) 100.0f, (double) 0.0f);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) (short) 100, (double) 1);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 100, (double) 100.0f, (double) '#', (double) (short) 1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        double double60 = levenbergMarquardtOptimizer3.getChiSquare();
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
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (-1L), (double) 10L, (double) 100.0f, (double) 1L);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', 10.0d, (double) 0L, (double) 0.0f, (double) (short) -1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 10, (double) 0, 1.0d, (double) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 100L, (double) 'a');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        int int20 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, Double.NaN, (double) 0, (-1.0d), (double) (byte) 100);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, 0.0d, (double) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) (byte) 10, (double) '4', (double) (short) 10, (double) (short) -1);
        int int10 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double13 = levenbergMarquardtOptimizer12.getChiSquare();
        int int14 = levenbergMarquardtOptimizer12.getEvaluations();
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) 1L, 10.0d, Double.NaN, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 10.0f, (double) (-1.0f), (double) ' ', (double) (short) 1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        double double10 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double12 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray15 = new double[] { 10.0d, 1.0d, '4' };
        double[] doubleArray17 = new double[] { ' ' };
        double[] doubleArray24 = new double[] { 0.0d, 10.0f, (-1), (short) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer5.optimize((int) (byte) 10, differentiableMultivariateVectorialFunction11, doubleArray15, doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 10.0, -1.0, 1.0, -1.0, 10.0]");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer84 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int85 = levenbergMarquardtOptimizer84.getJacobianEvaluations();
        double double86 = levenbergMarquardtOptimizer84.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker87 = levenbergMarquardtOptimizer84.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker87);
        int int89 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker87);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) (byte) -1, (double) (-1L));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 0.0d, (double) 10, (double) 0, (double) 100L);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 0L, (double) 'a');
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) (byte) 100, (double) (-1.0f));
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (-1.0f), (double) 0L, (double) (short) 100, (double) (-1.0f));
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (-1), (double) (short) -1, (double) 100.0f, Double.NaN);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (short) -1, (double) 100L);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer7.getEvaluations();
        int int11 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        double double20 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        int int17 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        double double22 = levenbergMarquardtOptimizer11.getRMS();
        int int23 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker26 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double27 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) 0, (double) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        double double12 = levenbergMarquardtOptimizer9.getChiSquare();
        double double13 = levenbergMarquardtOptimizer9.getChiSquare();
        int int14 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int25 = levenbergMarquardtOptimizer24.getEvaluations();
        int int26 = levenbergMarquardtOptimizer24.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double31 = levenbergMarquardtOptimizer30.getRMS();
        int int32 = levenbergMarquardtOptimizer30.getMaxEvaluations();
        int int33 = levenbergMarquardtOptimizer30.getJacobianEvaluations();
        double double34 = levenbergMarquardtOptimizer30.getChiSquare();
        int int35 = levenbergMarquardtOptimizer30.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double40 = levenbergMarquardtOptimizer39.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker41 = null;
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        int int43 = levenbergMarquardtOptimizer39.getEvaluations();
        double double44 = levenbergMarquardtOptimizer39.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer48 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double49 = levenbergMarquardtOptimizer48.getRMS();
        int int50 = levenbergMarquardtOptimizer48.getMaxEvaluations();
        int int51 = levenbergMarquardtOptimizer48.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker52 = levenbergMarquardtOptimizer48.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker52);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        int int48 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (-1), (double) '4');
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray11 = new double[] { (byte) -1, (byte) 1, 0, 100L, (short) 1 };
        double[] doubleArray18 = new double[] { 0L, (byte) 100, (short) 1, (-1.0d), (-1.0f), 1L };
        double[] doubleArray23 = new double[] { ' ', (short) 1, 'a', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer3.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction5, doubleArray11, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 0.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 100.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 1.0, 97.0, 0.0]");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (-1.0f), (double) 1.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (byte) 10, (double) ' ', (double) (-1), (double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), 100.0d, (double) (short) 100, (double) (short) 100, (double) '4');
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', (double) (-1.0f), (double) (-1.0f), (double) (-1), (double) (byte) 0);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        int int9 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        int int44 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker45 = levenbergMarquardtOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker45);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) -1, (double) 1.0f, (double) (short) 10, (double) 100.0f);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double double11 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double21 = levenbergMarquardtOptimizer20.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (double) (byte) 0);
        double double29 = levenbergMarquardtOptimizer28.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        int int41 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker36);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) '4', (double) (short) 0, (double) (byte) 1, (double) (byte) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 100.0d, (double) 1L, (double) 'a', (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), Double.NaN, (double) 10.0f, (double) (short) -1, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) 1, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        int int19 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        double double39 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (-1L), (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 1.0d, (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer57 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 100.0f, (double) (-1L), 0.0d, (double) 100.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker58 = levenbergMarquardtOptimizer57.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
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
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker58);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 100.0f, (double) (byte) 100, (double) 10.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 100.0d, 10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer7.getRMS();
        int int11 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = null;
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        int int21 = levenbergMarquardtOptimizer18.getEvaluations();
        int int22 = levenbergMarquardtOptimizer18.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double27 = levenbergMarquardtOptimizer26.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = null;
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        double double30 = levenbergMarquardtOptimizer26.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer38 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int39 = levenbergMarquardtOptimizer38.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker40 = levenbergMarquardtOptimizer38.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialPointValuePairConvergenceChecker40);
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialPointValuePairConvergenceChecker40);
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialPointValuePairConvergenceChecker40);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker40);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker40);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int37 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int38 = levenbergMarquardtOptimizer3.getEvaluations();
        double double39 = levenbergMarquardtOptimizer3.getRMS();
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
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int11 = levenbergMarquardtOptimizer10.getEvaluations();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        int int19 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer17.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        double double25 = levenbergMarquardtOptimizer5.getChiSquare();
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
        int int46 = levenbergMarquardtOptimizer29.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker47 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker47);
        int int49 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 0.0f, (double) (short) 100, 0.0d, (double) 100L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { 1, 100, 1.0d, 100.0d, 100 };
        double[] doubleArray16 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer5.optimize(10, differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 0.0d, (double) 10, (double) 0, (double) 100L);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray13 = new double[] { 1.0f, 0 };
        double[] doubleArray18 = new double[] { (byte) -1, (short) 0, (-1.0f), 0 };
        double[] doubleArray22 = new double[] { 10, 1.0d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer3.optimize((int) ' ', differentiableMultivariateVectorialFunction10, doubleArray13, doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 1.0, 0.0]");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, 0.0d, (double) (-1.0f));
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        int int21 = levenbergMarquardtOptimizer3.getEvaluations();
        int int22 = levenbergMarquardtOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (-1L), (double) (-1), 100.0d, (double) (byte) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (-1.0d), (double) (short) 1);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray11 = new double[] { (short) 10, 0.0f, 100L, 1L };
        double[] doubleArray13 = new double[] { 100L };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize(100, differentiableMultivariateVectorialFunction6, doubleArray11, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), 0.0d, (double) '4');
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) 10, (double) 0L);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray12 = new double[] { 0L, (-1), (byte) 0, (-1.0d), 10.0f };
        double[] doubleArray16 = new double[] { (-1L), (-1.0f), (byte) 10 };
        double[] doubleArray20 = new double[] { (-1.0f), 10.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize(10, differentiableMultivariateVectorialFunction6, doubleArray12, doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, -1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, 100.0]");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, Double.NaN, (double) (-1));
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        int int22 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double23 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 0L, 0.0d, (double) 10.0f, (double) 0L);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (short) 1, 0.0d, (double) 1L, (double) (-1));
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, 100.0d, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        int int9 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) 1, 100L, 10L, (-1.0d) };
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer3.optimize((-1), differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 10.0, -1.0]");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (short) -1, (double) 0);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker42 = levenbergMarquardtOptimizer41.getConvergenceChecker();
        levenbergMarquardtOptimizer37.setConvergenceChecker(vectorialPointValuePairConvergenceChecker42);
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker42);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker42);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        double double47 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int52 = levenbergMarquardtOptimizer51.getJacobianEvaluations();
        double double53 = levenbergMarquardtOptimizer51.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer57 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double58 = levenbergMarquardtOptimizer57.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker59 = null;
        levenbergMarquardtOptimizer57.setConvergenceChecker(vectorialPointValuePairConvergenceChecker59);
        double double61 = levenbergMarquardtOptimizer57.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer65 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer69 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int70 = levenbergMarquardtOptimizer69.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker71 = levenbergMarquardtOptimizer69.getConvergenceChecker();
        levenbergMarquardtOptimizer65.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        levenbergMarquardtOptimizer57.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker76 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker76);
        int int78 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int79 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker32);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker42);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker46);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker71);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray16 = new double[] { 100, 10, 1.0f, 0 };
        double[] doubleArray17 = null;
        double[] doubleArray22 = new double[] { (short) -1, 0L, 0L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer3.optimize((int) (short) 1, differentiableMultivariateVectorialFunction11, doubleArray16, doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0, 0.0, 52.0]");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray11 = new double[] { (short) -1, (-1.0f), (short) 0 };
        double[] doubleArray17 = new double[] { '4', (short) -1, 0.0f, (short) 10, (short) 1 };
        double[] doubleArray22 = new double[] { 1.0f, 1.0d, (short) 1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer3.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction7, doubleArray11, doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, -1.0, 0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 1.0, 1.0, -1.0]");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer5.getRMS();
        double double17 = levenbergMarquardtOptimizer5.getRMS();
        int int18 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, 100.0d, (double) 10);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 100, (double) '#');
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) (short) -1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), Double.NaN, (double) 10.0f, (double) (byte) 1, (double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double14 = levenbergMarquardtOptimizer13.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = null;
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        int int17 = levenbergMarquardtOptimizer13.getEvaluations();
        double double18 = levenbergMarquardtOptimizer13.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double23 = levenbergMarquardtOptimizer22.getRMS();
        int int24 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        int int25 = levenbergMarquardtOptimizer22.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker26 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker26);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer75 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 'a', (double) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer76 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer80 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker81 = levenbergMarquardtOptimizer80.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer87 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker88 = levenbergMarquardtOptimizer87.getConvergenceChecker();
        levenbergMarquardtOptimizer80.setConvergenceChecker(vectorialPointValuePairConvergenceChecker88);
        levenbergMarquardtOptimizer76.setConvergenceChecker(vectorialPointValuePairConvergenceChecker88);
        levenbergMarquardtOptimizer75.setConvergenceChecker(vectorialPointValuePairConvergenceChecker88);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker88);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker93 = levenbergMarquardtOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker81);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker88);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker93);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) ' ', (double) 100L);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 100, 10.0d, 0.0d, (-1.0d));
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) (-1.0f), 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) '#', 0.0d, (double) 10.0f, (double) 0.0f);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, 1.0d, (double) 10, Double.NaN, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int14 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int19 = levenbergMarquardtOptimizer18.getEvaluations();
        int int20 = levenbergMarquardtOptimizer18.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double26 = levenbergMarquardtOptimizer25.getRMS();
        int int27 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        int int28 = levenbergMarquardtOptimizer25.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        int int34 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray18 = new double[] { (short) 10, 100L, 1.0d, (short) 10, (short) 1, Double.NaN };
        double[] doubleArray21 = new double[] { (byte) 10, (short) 100 };
        double[] doubleArray22 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer3.optimize((int) (short) 0, differentiableMultivariateVectorialFunction11, doubleArray18, doubleArray21, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0, 1.0, 10.0, 1.0, NaN]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, 0.0d, 10.0d, (double) 10L, (double) 0.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double41 = levenbergMarquardtOptimizer40.getRMS();
        int int42 = levenbergMarquardtOptimizer40.getMaxEvaluations();
        int int43 = levenbergMarquardtOptimizer40.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker44 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer50 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker51 = levenbergMarquardtOptimizer50.getConvergenceChecker();
        levenbergMarquardtOptimizer40.setConvergenceChecker(vectorialPointValuePairConvergenceChecker51);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer56 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer60 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker61 = levenbergMarquardtOptimizer60.getConvergenceChecker();
        levenbergMarquardtOptimizer56.setConvergenceChecker(vectorialPointValuePairConvergenceChecker61);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer66 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer70 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker71 = levenbergMarquardtOptimizer70.getConvergenceChecker();
        levenbergMarquardtOptimizer66.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        levenbergMarquardtOptimizer56.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        levenbergMarquardtOptimizer40.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker75 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        int int76 = levenbergMarquardtOptimizer40.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker77 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker77);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray79 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker36);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker51);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker61);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker71);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker77);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 0, (double) (byte) -1, (double) (byte) 100, (-1.0d));
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 0.0d, (double) 10, (double) 0, (double) 100L);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray16 = new double[] { 0.0d, (byte) 10, (byte) 100, 10, (byte) 100 };
        double[] doubleArray20 = new double[] { 1.0d, (-1.0d), 100L };
        double[] doubleArray26 = new double[] { (short) 0, (short) 1, 1.0f, 0L, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction10, doubleArray16, doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 10.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0, 1.0, 0.0, 32.0]");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (-1.0f), (double) 1.0f);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { 10L };
        double[] doubleArray11 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.optimize((int) (short) 0, differentiableMultivariateVectorialFunction6, doubleArray7, doubleArray9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) 1L, 1.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray8 = new double[] { 1L, 100L };
        double[] doubleArray15 = new double[] { (byte) 0, 0, 1.0f, 100, (short) 0, 10L };
        double[] doubleArray17 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction5, doubleArray8, doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 1.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) '#', (double) (short) 0, 0.0d, (double) 0L);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double5 = levenbergMarquardtOptimizer4.getRMS();
        int int6 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray19 = new double[] { 1L, 0, 100, 0.0d, (-1.0f), 10.0f };
        double[] doubleArray21 = new double[] { 10.0f };
        double[] doubleArray22 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.optimize((int) '4', differentiableMultivariateVectorialFunction12, doubleArray19, doubleArray21, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 0.0, 100.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) 10, Double.NaN);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double double11 = levenbergMarquardtOptimizer5.getChiSquare();
        double double12 = levenbergMarquardtOptimizer5.getRMS();
        int int13 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) 0L, (double) 1.0f);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 100L, 1.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer10.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int21 = levenbergMarquardtOptimizer20.getJacobianEvaluations();
        int int22 = levenbergMarquardtOptimizer20.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        double double30 = levenbergMarquardtOptimizer28.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double35 = levenbergMarquardtOptimizer34.getRMS();
        int int36 = levenbergMarquardtOptimizer34.getMaxEvaluations();
        int int37 = levenbergMarquardtOptimizer34.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker39 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker39);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker39);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 10L, (-1.0d), (double) (short) -1, (double) (-1.0f));
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
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), Double.NaN, (double) 10.0f, (double) (byte) 1, (double) (byte) 1);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (-1.0d), 10.0d, (double) 0L, 10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = null;
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        int int13 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = null;
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        double double21 = levenbergMarquardtOptimizer17.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int30 = levenbergMarquardtOptimizer29.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray11 = new double[] { 10.0f, '4', 100.0d, 100 };
        double[] doubleArray13 = new double[] { ' ' };
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize(10, differentiableMultivariateVectorialFunction6, doubleArray11, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0]");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        double double13 = levenbergMarquardtOptimizer9.getChiSquare();
        int int14 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double19 = levenbergMarquardtOptimizer18.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = null;
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        int int22 = levenbergMarquardtOptimizer18.getEvaluations();
        double double23 = levenbergMarquardtOptimizer18.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double28 = levenbergMarquardtOptimizer27.getRMS();
        int int29 = levenbergMarquardtOptimizer27.getMaxEvaluations();
        int int30 = levenbergMarquardtOptimizer27.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        int int35 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) 0.0f, (double) '4');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) (-1.0f), (double) '4');
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 100.0f, (double) (byte) 1, (double) (-1L), 100.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) -1, 10.0d, (double) (-1L), (double) 'a');
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) (short) 1, (double) 1L, 0.0d, (double) 0);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) (-1.0f), 1.0d);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int46 = levenbergMarquardtOptimizer45.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker47 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        int int48 = levenbergMarquardtOptimizer45.getJacobianEvaluations();
        double double49 = levenbergMarquardtOptimizer45.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int54 = levenbergMarquardtOptimizer53.getEvaluations();
        int int55 = levenbergMarquardtOptimizer53.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer56 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer60 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double61 = levenbergMarquardtOptimizer60.getRMS();
        int int62 = levenbergMarquardtOptimizer60.getMaxEvaluations();
        int int63 = levenbergMarquardtOptimizer60.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker64 = levenbergMarquardtOptimizer60.getConvergenceChecker();
        levenbergMarquardtOptimizer56.setConvergenceChecker(vectorialPointValuePairConvergenceChecker64);
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialPointValuePairConvergenceChecker64);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker67 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        levenbergMarquardtOptimizer45.setConvergenceChecker(vectorialPointValuePairConvergenceChecker67);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker67);
        double double70 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker64);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker67);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), 0.0d, (double) 100);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 10, (double) 1L, (double) 100L, (-1.0d));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = null;
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        double double15 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double21 = levenbergMarquardtOptimizer20.getRMS();
        int int22 = levenbergMarquardtOptimizer20.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) 100L, (double) 100, (double) 10.0f, (double) 100);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) -1, (double) 100L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        double double15 = levenbergMarquardtOptimizer13.getRMS();
        int int16 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) 0, (double) '4', (double) 100.0f, (double) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int37 = levenbergMarquardtOptimizer36.getMaxEvaluations();
        int int38 = levenbergMarquardtOptimizer36.getJacobianEvaluations();
        int int39 = levenbergMarquardtOptimizer36.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double44 = levenbergMarquardtOptimizer43.getRMS();
        int int45 = levenbergMarquardtOptimizer43.getMaxEvaluations();
        int int46 = levenbergMarquardtOptimizer43.getEvaluations();
        int int47 = levenbergMarquardtOptimizer43.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker52 = levenbergMarquardtOptimizer51.getConvergenceChecker();
        levenbergMarquardtOptimizer43.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker52);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 100L, (double) 'a');
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double11 = levenbergMarquardtOptimizer5.getChiSquare();
        double double12 = levenbergMarquardtOptimizer5.getChiSquare();
        int int13 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double15 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray12 = new double[] { (-1L), 1L, (-1.0f), (-1.0f), 0.0d };
        double[] doubleArray16 = new double[] { 0.0f, (short) 0, (byte) 0 };
        double[] doubleArray21 = new double[] { '4', 0L, 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize((-1), differentiableMultivariateVectorialFunction6, doubleArray12, doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 0.0, 1.0, 0.0]");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray9 = new double[] { ' ' };
        double[] doubleArray11 = new double[] { (short) 1 };
        double[] doubleArray13 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer3.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction7, doubleArray9, doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 1.0d, (double) 10L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int10 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double17 = levenbergMarquardtOptimizer16.getRMS();
        int int18 = levenbergMarquardtOptimizer16.getMaxEvaluations();
        int int19 = levenbergMarquardtOptimizer16.getEvaluations();
        int int20 = levenbergMarquardtOptimizer16.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double33 = levenbergMarquardtOptimizer32.getRMS();
        int int34 = levenbergMarquardtOptimizer32.getMaxEvaluations();
        int int35 = levenbergMarquardtOptimizer32.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double40 = levenbergMarquardtOptimizer39.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker41 = null;
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        int int43 = levenbergMarquardtOptimizer39.getEvaluations();
        double double44 = levenbergMarquardtOptimizer39.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer48 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double49 = levenbergMarquardtOptimizer48.getRMS();
        int int50 = levenbergMarquardtOptimizer48.getMaxEvaluations();
        int int51 = levenbergMarquardtOptimizer48.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker52 = levenbergMarquardtOptimizer48.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialPointValuePairConvergenceChecker52);
        int int55 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer61 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int62 = levenbergMarquardtOptimizer61.getJacobianEvaluations();
        int int63 = levenbergMarquardtOptimizer61.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer67 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double68 = levenbergMarquardtOptimizer67.getRMS();
        int int69 = levenbergMarquardtOptimizer67.getMaxEvaluations();
        int int70 = levenbergMarquardtOptimizer67.getEvaluations();
        int int71 = levenbergMarquardtOptimizer67.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer75 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker76 = levenbergMarquardtOptimizer75.getConvergenceChecker();
        levenbergMarquardtOptimizer67.setConvergenceChecker(vectorialPointValuePairConvergenceChecker76);
        levenbergMarquardtOptimizer61.setConvergenceChecker(vectorialPointValuePairConvergenceChecker76);
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialPointValuePairConvergenceChecker76);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker76);
        int int81 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker25);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker76);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) (byte) 1, (double) 10L);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
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
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) (short) 10, (double) 10L, (double) (-1.0f), (double) ' ');
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 100, (double) (short) -1, (double) (-1.0f), 10.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray10 = new double[] { 'a', 100L };
        double[] doubleArray12 = new double[] { (short) 10 };
        double[] doubleArray16 = new double[] { 1L, 100L, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer5.optimize((int) (short) 0, differentiableMultivariateVectorialFunction7, doubleArray10, doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, 10.0]");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, 10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int8 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        double double26 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) (byte) 1, (double) (short) -1);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        int int21 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double22 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        int int10 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) (short) 0, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 0, (double) (byte) 10);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 100.0d, (double) 1L, (double) 'a', (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) 0.0f, 1.0d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) (byte) -1, (double) 10, (double) 'a', (double) 100);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (-1.0f), (double) (byte) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) (short) 0, (double) 0.0f);
        double double8 = levenbergMarquardtOptimizer7.getChiSquare();
        int int9 = levenbergMarquardtOptimizer7.getEvaluations();
        int int10 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int12 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double17 = levenbergMarquardtOptimizer16.getRMS();
        int int18 = levenbergMarquardtOptimizer16.getMaxEvaluations();
        int int19 = levenbergMarquardtOptimizer16.getEvaluations();
        int int20 = levenbergMarquardtOptimizer16.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        java.lang.Class<?> wildcardClass29 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) (byte) 10, (double) (-1L));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 100, 0.0d, (double) 'a', (double) (-1.0f));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray11 = new double[] { (short) 100, (-1), 100L };
        double[] doubleArray14 = new double[] { '4', (short) -1 };
        double[] doubleArray16 = new double[] { Double.NaN };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer5.optimize(100, differentiableMultivariateVectorialFunction7, doubleArray11, doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[NaN]");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 'a', (double) 10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray10 = new double[] { (short) 0, 1.0f, (short) 100, 10L };
        double[] doubleArray14 = new double[] { (short) 10, ' ', ' ' };
        double[] doubleArray17 = new double[] { Double.NaN, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize(1, differentiableMultivariateVectorialFunction5, doubleArray10, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[NaN, 1.0]");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double15 = levenbergMarquardtOptimizer14.getRMS();
        int int16 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        double double21 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
        int int20 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int21 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int22 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        int int44 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction46 = null;
        double[] doubleArray49 = new double[] { 10L, (-1.0f) };
        double[] doubleArray52 = new double[] { 1L, 100.0d };
        double[] doubleArray58 = new double[] { 100, 1.0f, (-1L), (byte) -1, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair59 = levenbergMarquardtOptimizer3.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction46, doubleArray49, doubleArray52, doubleArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 1.0, -1.0, -1.0, 100.0]");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) '4', (double) (-1.0f));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) (short) -1, (double) 1.0f, (double) (byte) 10, (double) 0L);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) 100.0f, 10.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray7 = new double[] { (short) 10 };
        double[] doubleArray8 = null;
        double[] doubleArray10 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer3.optimize((int) (short) -1, differentiableMultivariateVectorialFunction5, doubleArray7, doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        double double16 = levenbergMarquardtOptimizer14.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double21 = levenbergMarquardtOptimizer20.getRMS();
        int int22 = levenbergMarquardtOptimizer20.getMaxEvaluations();
        int int23 = levenbergMarquardtOptimizer20.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker25 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        double double28 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 0L, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray15 = new double[] { 10.0f, (short) 100, (byte) -1, (byte) -1, (short) 10 };
        double[] doubleArray22 = new double[] { 1.0d, (byte) 0, (short) 10, 1.0f, ' ', 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer5.optimize((int) (short) 0, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 0.0, 10.0, 1.0, 32.0, 1.0]");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getEvaluations();
        int int11 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) (byte) 1, (double) 'a');
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (-1L), (double) 10L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getEvaluations();
        double double11 = levenbergMarquardtOptimizer3.getChiSquare();
        int int12 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 100.0d, 0.0d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) 100, (double) (byte) 1);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double13 = levenbergMarquardtOptimizer12.getRMS();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        int int18 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int20 = levenbergMarquardtOptimizer3.getEvaluations();
        int int21 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        int int16 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 1.0d, (double) (-1L));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) 100, (double) (short) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', 10.0d, (double) 0L, (double) 0.0f, (double) (short) -1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) 10, (double) 0, 1.0d, (double) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 100L, (double) 'a');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction21 = null;
        double[] doubleArray25 = new double[] { (-1), (byte) -1, (short) 1 };
        double[] doubleArray26 = new double[] {};
        double[] doubleArray33 = new double[] { 1, '4', 10L, (byte) 1, (short) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair34 = levenbergMarquardtOptimizer5.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction21, doubleArray25, doubleArray26, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 52.0, 10.0, 1.0, 100.0, 100.0]");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        int int19 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int20 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        int int19 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer17.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer47 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker48 = levenbergMarquardtOptimizer47.getConvergenceChecker();
        levenbergMarquardtOptimizer43.setConvergenceChecker(vectorialPointValuePairConvergenceChecker48);
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialPointValuePairConvergenceChecker48);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker48);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer55 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer59 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker60 = levenbergMarquardtOptimizer59.getConvergenceChecker();
        levenbergMarquardtOptimizer55.setConvergenceChecker(vectorialPointValuePairConvergenceChecker60);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer67 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer73 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker74 = levenbergMarquardtOptimizer73.getConvergenceChecker();
        levenbergMarquardtOptimizer67.setConvergenceChecker(vectorialPointValuePairConvergenceChecker74);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker76 = levenbergMarquardtOptimizer67.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer77 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double78 = levenbergMarquardtOptimizer77.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker79 = levenbergMarquardtOptimizer77.getConvergenceChecker();
        levenbergMarquardtOptimizer67.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer55.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer91 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker92 = levenbergMarquardtOptimizer91.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker93 = levenbergMarquardtOptimizer91.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker93);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker48);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker60);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker74);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker76);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker79);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker92);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker93);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int9 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        int int21 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int11 = levenbergMarquardtOptimizer10.getEvaluations();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        int int19 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer17.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        double double25 = levenbergMarquardtOptimizer5.getChiSquare();
        double double26 = levenbergMarquardtOptimizer5.getChiSquare();
        double double27 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0, (double) (-1), (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = null;
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, 10.0d, (double) 1L);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (-1.0f), (double) (short) 1);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 0, (double) (-1), (double) (short) 1, (double) (-1.0f));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = null;
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker6);
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 1, (double) (byte) 10, (double) (byte) 1, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (byte) -1, (double) '4', (double) 100.0f, (double) (byte) 10);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 1.0f, (double) 100.0f);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) 10L, (double) 0L, (double) (-1), (double) 1L);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 0.0d, (double) 10, (double) 0, (double) 100L);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (short) 10, (double) 10L, (double) 1.0f, (double) (short) -1);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        double double19 = levenbergMarquardtOptimizer5.getChiSquare();
        double double20 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) 100L, (double) 100, (double) 10.0f, (double) 100);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int11 = levenbergMarquardtOptimizer10.getEvaluations();
        int int12 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        int int19 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer17.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int30 = levenbergMarquardtOptimizer29.getMaxEvaluations();
        int int31 = levenbergMarquardtOptimizer29.getJacobianEvaluations();
        int int32 = levenbergMarquardtOptimizer29.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double37 = levenbergMarquardtOptimizer36.getRMS();
        int int38 = levenbergMarquardtOptimizer36.getMaxEvaluations();
        int int39 = levenbergMarquardtOptimizer36.getEvaluations();
        int int40 = levenbergMarquardtOptimizer36.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker45 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialPointValuePairConvergenceChecker45);
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker45);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker45);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker45);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker45);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (-1.0d), Double.NaN, 0.0d, (double) 1.0f);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int46 = levenbergMarquardtOptimizer45.getEvaluations();
        double double47 = levenbergMarquardtOptimizer45.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double52 = levenbergMarquardtOptimizer51.getRMS();
        int int53 = levenbergMarquardtOptimizer51.getMaxEvaluations();
        int int54 = levenbergMarquardtOptimizer51.getJacobianEvaluations();
        double double55 = levenbergMarquardtOptimizer51.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer61 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int62 = levenbergMarquardtOptimizer61.getJacobianEvaluations();
        int int63 = levenbergMarquardtOptimizer61.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer69 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker70 = levenbergMarquardtOptimizer69.getConvergenceChecker();
        double double71 = levenbergMarquardtOptimizer69.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer75 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double76 = levenbergMarquardtOptimizer75.getRMS();
        int int77 = levenbergMarquardtOptimizer75.getMaxEvaluations();
        int int78 = levenbergMarquardtOptimizer75.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker79 = levenbergMarquardtOptimizer75.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker80 = levenbergMarquardtOptimizer75.getConvergenceChecker();
        levenbergMarquardtOptimizer69.setConvergenceChecker(vectorialPointValuePairConvergenceChecker80);
        levenbergMarquardtOptimizer61.setConvergenceChecker(vectorialPointValuePairConvergenceChecker80);
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialPointValuePairConvergenceChecker80);
        int int84 = levenbergMarquardtOptimizer51.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker85 = levenbergMarquardtOptimizer51.getConvergenceChecker();
        levenbergMarquardtOptimizer45.setConvergenceChecker(vectorialPointValuePairConvergenceChecker85);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker85);
        double double88 = levenbergMarquardtOptimizer3.getRMS();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker70);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker79);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker80);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker85);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 1, (double) (byte) 10, (double) (byte) 1, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        double double28 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double5 = levenbergMarquardtOptimizer4.getRMS();
        int int6 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 100, (double) 10, 100.0d, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (short) 10, (double) (byte) -1, 0.0d, (double) (byte) 100);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (byte) 10, 0.0d, (double) 'a', 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) 10L, (double) 10.0f);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) 100L, (double) (byte) 10);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        java.lang.Class<?> wildcardClass35 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker30);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) 'a', (double) 'a', (double) (short) 10, (double) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double13 = levenbergMarquardtOptimizer12.getRMS();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = null;
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        int int23 = levenbergMarquardtOptimizer19.getEvaluations();
        double double24 = levenbergMarquardtOptimizer19.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double29 = levenbergMarquardtOptimizer28.getRMS();
        int int30 = levenbergMarquardtOptimizer28.getMaxEvaluations();
        int int31 = levenbergMarquardtOptimizer28.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker32 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        int int35 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int42 = levenbergMarquardtOptimizer41.getJacobianEvaluations();
        int int43 = levenbergMarquardtOptimizer41.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer47 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double48 = levenbergMarquardtOptimizer47.getRMS();
        int int49 = levenbergMarquardtOptimizer47.getMaxEvaluations();
        int int50 = levenbergMarquardtOptimizer47.getEvaluations();
        int int51 = levenbergMarquardtOptimizer47.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer55 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker56 = levenbergMarquardtOptimizer55.getConvergenceChecker();
        levenbergMarquardtOptimizer47.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker56);
        int int60 = levenbergMarquardtOptimizer12.getEvaluations();
        int int61 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker62 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker62);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker62);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 0.0d, (-1.0d));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1L, (double) 0, (double) '4', (double) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        double double14 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int16 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        double double46 = levenbergMarquardtOptimizer0.getChiSquare();
        double double47 = levenbergMarquardtOptimizer0.getChiSquare();
        int int48 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) (byte) -1, (double) (-1L));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        double double27 = levenbergMarquardtOptimizer3.getChiSquare();
        int int28 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double double11 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double21 = levenbergMarquardtOptimizer20.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (double) (byte) 0);
        double double29 = levenbergMarquardtOptimizer28.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        double double41 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker36);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) 0L, (double) (byte) 10, (double) (-1L), (double) 1.0f);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 100, (double) (byte) 10, (double) 10L, (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (short) 10);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (byte) 1, (double) 10L, (double) '4', (double) (short) 10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { 100L, (-1.0d), 1.0d, 10.0d, 100.0d };
        double[] doubleArray19 = new double[] { 1L, (-1.0f), (byte) -1, 100.0d, (-1.0f) };
        double[] doubleArray24 = new double[] { 0.0f, (-1), (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer5.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, -1.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, -1.0, 1.0, 10.0]");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        int int19 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 0.0d, (double) '#');
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (byte) 10, (double) 1.0f, (double) '#', 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray17 = new double[] { 1, (short) 0, '#', '#' };
        double[] doubleArray20 = new double[] { 1L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer5.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction10, doubleArray12, doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 0.0, 35.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 0.0]");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1L, (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 100, (double) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double30 = levenbergMarquardtOptimizer29.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass37 = vectorialPointValuePairConvergenceChecker36.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker26);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) (byte) 10, (double) 1L, (-1.0d));
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        int int13 = levenbergMarquardtOptimizer11.getJacobianEvaluations();
        int int14 = levenbergMarquardtOptimizer11.getJacobianEvaluations();
        double double15 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        java.lang.Class<?> wildcardClass18 = vectorialPointValuePairConvergenceChecker16.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int45 = levenbergMarquardtOptimizer44.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int50 = levenbergMarquardtOptimizer49.getEvaluations();
        int int51 = levenbergMarquardtOptimizer49.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer56 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double57 = levenbergMarquardtOptimizer56.getRMS();
        int int58 = levenbergMarquardtOptimizer56.getMaxEvaluations();
        int int59 = levenbergMarquardtOptimizer56.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker60 = levenbergMarquardtOptimizer56.getConvergenceChecker();
        levenbergMarquardtOptimizer52.setConvergenceChecker(vectorialPointValuePairConvergenceChecker60);
        levenbergMarquardtOptimizer49.setConvergenceChecker(vectorialPointValuePairConvergenceChecker60);
        levenbergMarquardtOptimizer44.setConvergenceChecker(vectorialPointValuePairConvergenceChecker60);
        double double64 = levenbergMarquardtOptimizer44.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer68 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, (double) ' ', (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer74 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int75 = levenbergMarquardtOptimizer74.getEvaluations();
        int int76 = levenbergMarquardtOptimizer74.getEvaluations();
        int int77 = levenbergMarquardtOptimizer74.getMaxEvaluations();
        int int78 = levenbergMarquardtOptimizer74.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker79 = levenbergMarquardtOptimizer74.getConvergenceChecker();
        levenbergMarquardtOptimizer68.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer44.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker79);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker60);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker79);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 100, (double) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, 0.0d, (double) (short) 10, (double) (byte) 0, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        double double21 = levenbergMarquardtOptimizer3.getChiSquare();
        double double22 = levenbergMarquardtOptimizer3.getRMS();
        int int23 = levenbergMarquardtOptimizer3.getEvaluations();
        int int24 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        double double14 = levenbergMarquardtOptimizer5.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 10.0f, (double) (-1), 1.0d, (double) '4');
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) ' ', 10.0d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 100.0f, 0.0d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) 100L, (double) (byte) 10);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double14 = levenbergMarquardtOptimizer13.getRMS();
        int int15 = levenbergMarquardtOptimizer13.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int20 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, 0.0d, (-1.0d), (double) (short) 10, (double) 10L);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 10, 10.0d);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (short) 100, (-1.0d), 0.0d, (double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (short) 10, 100.0d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        double double14 = levenbergMarquardtOptimizer5.getChiSquare();
        double double15 = levenbergMarquardtOptimizer5.getRMS();
        int int16 = levenbergMarquardtOptimizer5.getEvaluations();
        double double17 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 1, (double) (byte) 100);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int9 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer8.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        int int14 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        double double18 = levenbergMarquardtOptimizer3.getRMS();
        int int19 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) (short) 1, (double) (short) 1, (double) 10L, (double) 'a');
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 100, 0.0d, (double) 100.0f, (double) '4');
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) '#', (double) (short) 0);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (-1.0d), (double) (short) -1, (double) 1.0f, (double) ' ');
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (byte) 1, 0.0d, (double) (short) 0, (-1.0d));
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 10L, (double) (byte) 0, (double) (byte) 0, (double) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, 1.0d, 10.0d, (double) (byte) -1, (double) 1L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = null;
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        int int19 = levenbergMarquardtOptimizer15.getEvaluations();
        double double20 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double25 = levenbergMarquardtOptimizer24.getRMS();
        int int26 = levenbergMarquardtOptimizer24.getMaxEvaluations();
        int int27 = levenbergMarquardtOptimizer24.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 1, (double) (byte) 10, (double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer36.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) '#', 0.0d, (double) 10.0f, (double) 0.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        int int22 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int23 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (-1), 0.0d);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 0L, (double) 100L);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
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
        int int26 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (short) 100, 0.0d, (double) (byte) 100, Double.NaN);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), 0.0d, (double) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (-1.0f), Double.NaN);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) '4', 0.0d, (double) (short) 100, 100.0d);
        int int22 = levenbergMarquardtOptimizer21.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) (byte) 10, (double) 1L, (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = null;
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer12.getEvaluations();
        double double16 = levenbergMarquardtOptimizer12.getRMS();
        double double17 = levenbergMarquardtOptimizer12.getChiSquare();
        int int18 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (-1L), (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker23);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray26 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) 0, (double) '4', (double) 100.0f, (double) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1L), (double) 'a');
        int int10 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        int int20 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int21 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double22 = levenbergMarquardtOptimizer3.getRMS();
        int int23 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) 100, (double) (byte) -1, (double) (short) 100, (double) '#');
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) ' ', 0.0d, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int13 = levenbergMarquardtOptimizer12.getEvaluations();
        int int14 = levenbergMarquardtOptimizer12.getEvaluations();
        int int15 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        double double16 = levenbergMarquardtOptimizer12.getRMS();
        double double17 = levenbergMarquardtOptimizer12.getChiSquare();
        int int18 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) (byte) 10, (double) 0L, (double) ' ', (double) '#');
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) 1.0f, (double) (byte) 1, 10.0d, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray11 = new double[] { (short) 1 };
        double[] doubleArray15 = new double[] { '4', (-1.0f), 1L };
        double[] doubleArray18 = new double[] { 10L, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction9, doubleArray11, doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 0.0]");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (-1.0d), 1.0d, (double) 100.0f, 10.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray11 = new double[] { (short) -1, '4', (byte) 0 };
        double[] doubleArray16 = new double[] { 100L, 1.0d, 0.0d, (byte) 1 };
        double[] doubleArray18 = new double[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction7, doubleArray11, doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) 100L, (double) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray9 = new double[] { 'a', '#' };
        double[] doubleArray16 = new double[] { (short) 1, (-1.0f), 0, (short) 1, (byte) 1, (byte) 100 };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) (short) -1, differentiableMultivariateVectorialFunction6, doubleArray9, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 0.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, 1.0d, 0.0d, (double) (-1), Double.NaN);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) 1L, (double) ' ', (double) 100L, (double) (-1));
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (short) 0, (double) (-1L));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray6 = new double[] {};
        double[] doubleArray8 = new double[] { (short) 100 };
        double[] doubleArray14 = new double[] { (byte) -1, (byte) 100, (short) 10, 10L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize(100, differentiableMultivariateVectorialFunction5, doubleArray6, doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 10.0, 10.0, 1.0]");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, 0.0d, (double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 0L, (double) (short) -1, 1.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double14 = levenbergMarquardtOptimizer13.getRMS();
        int int15 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        int int16 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        int int23 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, 10.0d, (double) 1L, (double) 10.0f, (double) (short) 1);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray23 = new double[] { Double.NaN, 100L, 1.0d, (short) 0, 100L, 10.0d };
        double[] doubleArray29 = new double[] { ' ', 0.0f, (short) 100, 1L, 100 };
        double[] doubleArray32 = new double[] { 100L, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair33 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction16, doubleArray23, doubleArray29, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[NaN, 100.0, 1.0, 0.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[32.0, 0.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, -1.0]");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        double double25 = levenbergMarquardtOptimizer5.getChiSquare();
        double double26 = levenbergMarquardtOptimizer5.getRMS();
        double double27 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction29 = null;
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        double[] doubleArray37 = new double[] { (-1.0f), (short) 0, 0, (byte) 1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair38 = levenbergMarquardtOptimizer5.optimize((int) '4', differentiableMultivariateVectorialFunction29, doubleArray30, doubleArray31, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 0.0, 1.0, 10.0]");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (byte) 100, Double.NaN, (double) (byte) -1, (double) 10L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        int int38 = levenbergMarquardtOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray9 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double41 = levenbergMarquardtOptimizer40.getRMS();
        int int42 = levenbergMarquardtOptimizer40.getMaxEvaluations();
        int int43 = levenbergMarquardtOptimizer40.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker44 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer50 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker51 = levenbergMarquardtOptimizer50.getConvergenceChecker();
        levenbergMarquardtOptimizer40.setConvergenceChecker(vectorialPointValuePairConvergenceChecker51);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer56 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer60 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker61 = levenbergMarquardtOptimizer60.getConvergenceChecker();
        levenbergMarquardtOptimizer56.setConvergenceChecker(vectorialPointValuePairConvergenceChecker61);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer66 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer70 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker71 = levenbergMarquardtOptimizer70.getConvergenceChecker();
        levenbergMarquardtOptimizer66.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        levenbergMarquardtOptimizer56.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        levenbergMarquardtOptimizer40.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker75 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        int int76 = levenbergMarquardtOptimizer40.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker77 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker77);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray79 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker36);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker51);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker61);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker71);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker77);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, Double.NaN, (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) (-1L), (double) (short) -1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray12 = new double[] { 0, (-1.0d), (-1.0f), 'a', 100.0f, 10.0d };
        double[] doubleArray15 = new double[] { '4', 1.0d };
        double[] doubleArray21 = new double[] { (-1.0d), (byte) -1, 1, 1.0f, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer3.optimize((int) '4', differentiableMultivariateVectorialFunction5, doubleArray12, doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, -1.0, -1.0, 97.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 1.0, 1.0, 0.0]");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) (byte) 10, (double) 0L, (double) ' ', (double) '#');
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) (short) 100, (double) (byte) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (byte) -1, (double) 10L);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 1L, (double) (-1L), (double) (short) 1, (double) 100);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (-1.0f), (double) (short) 0);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (-1L), (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int11 = levenbergMarquardtOptimizer10.getEvaluations();
        double double12 = levenbergMarquardtOptimizer10.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        double double14 = levenbergMarquardtOptimizer10.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, Double.NaN, (double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 10L, (double) (short) 10, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker25);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer3.getEvaluations();
        double double15 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction17 = null;
        double[] doubleArray22 = new double[] { ' ', 10, (-1L), (byte) 0 };
        double[] doubleArray23 = new double[] {};
        double[] doubleArray25 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer3.optimize((int) '#', differentiableMultivariateVectorialFunction17, doubleArray22, doubleArray23, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (byte) -1, (double) 1.0f, (double) 1, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (-1.0f), (double) (short) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double13 = levenbergMarquardtOptimizer12.getRMS();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        double double16 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (short) 10, (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        int int24 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction26 = null;
        double[] doubleArray29 = new double[] { (short) -1, 1.0f };
        double[] doubleArray30 = new double[] {};
        double[] doubleArray37 = new double[] { (-1L), 0.0d, (byte) 1, (-1), (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair38 = levenbergMarquardtOptimizer3.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction26, doubleArray29, doubleArray30, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 1.0, -1.0, 1.0, 35.0]");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) 100L, (double) 10.0f, (double) 100L, (double) (short) 1);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) (byte) -1, (double) 100, (double) 100L, (double) 0.0f);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) 0.0f, (double) '4');
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray9 = new double[] { '4' };
        double[] doubleArray10 = new double[] {};
        double[] doubleArray17 = new double[] { (short) 10, ' ', 100.0f, 10, 1.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((-1), differentiableMultivariateVectorialFunction7, doubleArray9, doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 32.0, 100.0, 10.0, 1.0, 100.0]");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, Double.NaN, (double) 100.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker27 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker27);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker27);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker27);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker43 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker45 = levenbergMarquardtOptimizer36.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker46 = levenbergMarquardtOptimizer36.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker46);
        int int49 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker50 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker27);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker45);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker50);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) 1, (double) '4');
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray12 = new double[] { 10, '4', 100, (byte) 1, (short) 10, 0 };
        double[] doubleArray14 = new double[] { 1L };
        double[] doubleArray20 = new double[] { 100L, (short) -1, Double.NaN, (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) (short) -1, differentiableMultivariateVectorialFunction5, doubleArray12, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, -1.0, NaN, 0.0, 32.0]");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) '4', (double) 1L, 0.0d, (double) 'a');
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double13 = levenbergMarquardtOptimizer12.getChiSquare();
        int int14 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) -1, (double) (byte) 100);
        int int21 = levenbergMarquardtOptimizer20.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        int int26 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int35 = levenbergMarquardtOptimizer34.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker36);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1L, (-1.0d), (double) 0.0f, (double) (short) 10);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) (short) 10, (double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 0.0d, (double) 'a', (double) 1, (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, 0.0d, (double) '4', Double.NaN, (double) (byte) 100);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) 10L, (double) (byte) 100, (double) (byte) 10, (double) 10L);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, 0.0d, (double) '4');
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        int int11 = levenbergMarquardtOptimizer5.getEvaluations();
        double double12 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int18 = levenbergMarquardtOptimizer17.getEvaluations();
        int int19 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        double double20 = levenbergMarquardtOptimizer17.getRMS();
        int int21 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 1L, (double) 10.0f);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (byte) 1, (double) (byte) 10, (double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        java.lang.Class<?> wildcardClass33 = vectorialPointValuePairConvergenceChecker31.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, (double) '4', 1.0d);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        java.lang.Class<?> wildcardClass16 = vectorialPointValuePairConvergenceChecker14.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, 0.0d, (double) 1, (double) (-1), Double.NaN);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray14 = new double[] { (-1L), (-1), '#', 1.0d, (byte) 10 };
        double[] doubleArray18 = new double[] { (-1L), Double.NaN, '4' };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer5.optimize(100, differentiableMultivariateVectorialFunction8, doubleArray14, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 35.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, NaN, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (byte) 1, (double) 10L, (double) '4', (double) (short) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) '#', (double) (-1L), (double) 1L, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray12 = null;
        double[] doubleArray13 = new double[] {};
        double[] doubleArray18 = new double[] { (short) 10, 1.0d, 100.0f, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((int) (short) -1, differentiableMultivariateVectorialFunction11, doubleArray12, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0, 100.0, 100.0]");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
        int int20 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int21 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray22 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (short) 10, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 0.0d, (double) 10, (double) 0, (double) 100L);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 10.0f, (double) (-1.0f), (double) ' ', (double) (short) 1);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray14 = new double[] { 100L, (short) -1, 100.0d };
        double[] doubleArray20 = new double[] { (-1L), (-1), Double.NaN, 10L, 1 };
        double[] doubleArray27 = new double[] { 0.0d, '#', '#', 0.0f, (short) 10, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction10, doubleArray14, doubleArray20, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, NaN, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 35.0, 35.0, 0.0, 10.0, 100.0]");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) 100, (double) (byte) 10, (double) (-1), (double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker11);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (byte) -1, (double) 0.0f, (double) (short) 10);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, 0.0d, (double) (short) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 100.0f, (double) 1);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 100, (double) (byte) 10, (double) 10L, (double) (-1));
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray11 = new double[] { 10, 100 };
        double[] doubleArray18 = new double[] { 1, (short) 1, 10L, 10.0f, '#', (short) 100 };
        double[] doubleArray25 = new double[] { (-1), '#', 1.0f, (short) 1, Double.NaN, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer5.optimize((int) (short) 10, differentiableMultivariateVectorialFunction8, doubleArray11, doubleArray18, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0, 10.0, 10.0, 35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 35.0, 1.0, 1.0, NaN, 100.0]");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
        int int42 = levenbergMarquardtOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) '#', (double) (byte) 10);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) (byte) 10, (double) 100);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) '#', (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, (double) (byte) 1, (double) (short) 100, (double) (-1.0f), 100.0d);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), 10.0d, 10.0d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (short) 100, (-1.0d), (double) '4', (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) 0, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double5 = levenbergMarquardtOptimizer4.getChiSquare();
        int int6 = levenbergMarquardtOptimizer4.getEvaluations();
        int int7 = levenbergMarquardtOptimizer4.getEvaluations();
        double double8 = levenbergMarquardtOptimizer4.getChiSquare();
        int int9 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double20 = levenbergMarquardtOptimizer19.getRMS();
        int int21 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        double double26 = levenbergMarquardtOptimizer15.getRMS();
        int int27 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker30);
        int int32 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int33 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, 10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int8 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, 100.0d, (double) (byte) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int10 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double16 = levenbergMarquardtOptimizer15.getChiSquare();
        int int17 = levenbergMarquardtOptimizer15.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int22 = levenbergMarquardtOptimizer21.getJacobianEvaluations();
        double double23 = levenbergMarquardtOptimizer21.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker27 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        int int28 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        int int9 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) 0, (double) (-1), (double) 100, (double) 100L);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) -1, (double) (byte) 100);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (short) 1, (double) (-1));
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1L, (-1.0d), (double) 0.0f, (double) (short) 10);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) (short) 10, (double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 0.0d, (double) 'a', (double) 1, (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        java.lang.Class<?> wildcardClass20 = vectorialPointValuePairConvergenceChecker17.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
        int int49 = levenbergMarquardtOptimizer5.getEvaluations();
        int int50 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int51 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) 100L, (double) (short) -1);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double30 = levenbergMarquardtOptimizer29.getRMS();
        int int31 = levenbergMarquardtOptimizer29.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer29.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker33 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker34 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker34);
        double double36 = levenbergMarquardtOptimizer25.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, Double.NaN, 1.0d, Double.NaN, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker44 = levenbergMarquardtOptimizer43.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker33);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker34);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker44);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double double11 = levenbergMarquardtOptimizer5.getRMS();
        int int12 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer5.getEvaluations();
        int int14 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double15 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 10.0d, (double) (short) 1, (double) ' ', Double.NaN);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) '4', 10.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) (byte) -1, (double) 100, (double) 100L, (double) 0.0f);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double15 = levenbergMarquardtOptimizer5.getChiSquare();
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
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker55);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker60 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker33);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker45);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker55);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker60);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) '4', (double) 100.0f);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 100.0d, 10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer7.getRMS();
        int int11 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer3.getEvaluations();
        double double15 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        double double13 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int20 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        int int21 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        double double29 = levenbergMarquardtOptimizer27.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double34 = levenbergMarquardtOptimizer33.getRMS();
        int int35 = levenbergMarquardtOptimizer33.getMaxEvaluations();
        int int36 = levenbergMarquardtOptimizer33.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        int int42 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker43 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        double double45 = levenbergMarquardtOptimizer3.getChiSquare();
        double double46 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 100.0d, (double) (short) 0, (double) 0.0f, (double) ' ');
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 100, (double) 100.0f, (double) '4', (double) 100L);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) '#', (double) '#');
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (-1), (double) 10);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, Double.NaN, (double) 10, (double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) 1, (double) 'a');
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 0, (double) 1.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1.0f), (double) (byte) 0, (double) '#', (double) (byte) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        double double16 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction22 = null;
        double[] doubleArray24 = new double[] { '#' };
        double[] doubleArray30 = new double[] { 10L, 100.0f, 10L, (-1.0d), 0.0f };
        double[] doubleArray34 = new double[] { 0.0d, (byte) -1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair35 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction22, doubleArray24, doubleArray30, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0, 10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, -1.0, 1.0]");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 100, (double) 10, 100.0d, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer3.getEvaluations();
        int int13 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int16 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double18 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) '#', (double) (-1L), (double) 1L, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) '4', (double) (-1));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) (short) 0, (double) (short) 10, (double) 0, (double) 100);
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
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double12 = levenbergMarquardtOptimizer11.getChiSquare();
        int int13 = levenbergMarquardtOptimizer11.getEvaluations();
        int int14 = levenbergMarquardtOptimizer11.getEvaluations();
        double double15 = levenbergMarquardtOptimizer11.getChiSquare();
        int int16 = levenbergMarquardtOptimizer11.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double27 = levenbergMarquardtOptimizer26.getRMS();
        int int28 = levenbergMarquardtOptimizer26.getMaxEvaluations();
        int int29 = levenbergMarquardtOptimizer26.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker31 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialPointValuePairConvergenceChecker31);
        double double33 = levenbergMarquardtOptimizer22.getRMS();
        int int34 = levenbergMarquardtOptimizer22.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        double double41 = levenbergMarquardtOptimizer40.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker42 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker42);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int54 = levenbergMarquardtOptimizer53.getEvaluations();
        int int55 = levenbergMarquardtOptimizer53.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer59 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double60 = levenbergMarquardtOptimizer59.getRMS();
        int int61 = levenbergMarquardtOptimizer59.getMaxEvaluations();
        int int62 = levenbergMarquardtOptimizer59.getJacobianEvaluations();
        double double63 = levenbergMarquardtOptimizer59.getChiSquare();
        int int64 = levenbergMarquardtOptimizer59.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer68 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double69 = levenbergMarquardtOptimizer68.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker70 = null;
        levenbergMarquardtOptimizer68.setConvergenceChecker(vectorialPointValuePairConvergenceChecker70);
        int int72 = levenbergMarquardtOptimizer68.getEvaluations();
        double double73 = levenbergMarquardtOptimizer68.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer77 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double78 = levenbergMarquardtOptimizer77.getRMS();
        int int79 = levenbergMarquardtOptimizer77.getMaxEvaluations();
        int int80 = levenbergMarquardtOptimizer77.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker81 = levenbergMarquardtOptimizer77.getConvergenceChecker();
        levenbergMarquardtOptimizer68.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        levenbergMarquardtOptimizer59.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        levenbergMarquardtOptimizer49.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker81);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker30);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker81);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double34 = levenbergMarquardtOptimizer33.getRMS();
        int int35 = levenbergMarquardtOptimizer33.getMaxEvaluations();
        int int36 = levenbergMarquardtOptimizer33.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker44 = levenbergMarquardtOptimizer43.getConvergenceChecker();
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialPointValuePairConvergenceChecker44);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker54 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        levenbergMarquardtOptimizer49.setConvergenceChecker(vectorialPointValuePairConvergenceChecker54);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer59 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer63 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker64 = levenbergMarquardtOptimizer63.getConvergenceChecker();
        levenbergMarquardtOptimizer59.setConvergenceChecker(vectorialPointValuePairConvergenceChecker64);
        levenbergMarquardtOptimizer49.setConvergenceChecker(vectorialPointValuePairConvergenceChecker64);
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialPointValuePairConvergenceChecker64);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker68 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker68);
        double double70 = levenbergMarquardtOptimizer28.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker71 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker71);
        double double73 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass74 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker44);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker54);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker64);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker68);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker71);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) 100L, (double) 'a');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int9 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        int int21 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 10.0f, (double) (-1.0f), (double) ' ', (double) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 100.0d, 10.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker32);
        int int35 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) (short) 1, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 'a', (double) '4', (double) 100L, (double) (byte) 1);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (-1.0f), (double) 0L, (double) (short) 100, (double) (-1.0f));
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) (byte) -1, (double) (byte) 100);
        int int11 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        int int16 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int25 = levenbergMarquardtOptimizer24.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker26 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker26);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 10L, (double) 1.0f);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
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
        int int19 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) 100.0f, (double) 10L);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        int int36 = levenbergMarquardtOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int13 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) 1.0f, 100.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray12 = new double[] { (-1), (byte) 10, (byte) -1, (byte) 0, (-1.0d), (byte) 100 };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize((int) (short) -1, differentiableMultivariateVectorialFunction5, doubleArray12, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', (double) (byte) -1, 100.0d);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 1.0d, (double) 0L, (double) 'a', 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (byte) -1, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) ' ', (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) (short) 1, (double) (-1));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int9 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        int int21 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int22 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
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
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int21 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, 0.0d, 10.0d, (double) 10L, (double) 0.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
        int int28 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int29 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
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
        int int28 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer3.getRMS();
        double double11 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double11 = levenbergMarquardtOptimizer10.getChiSquare();
        int int12 = levenbergMarquardtOptimizer10.getEvaluations();
        int int13 = levenbergMarquardtOptimizer10.getEvaluations();
        double double14 = levenbergMarquardtOptimizer10.getChiSquare();
        int int15 = levenbergMarquardtOptimizer10.getEvaluations();
        int int16 = levenbergMarquardtOptimizer10.getEvaluations();
        int int17 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double22 = levenbergMarquardtOptimizer21.getRMS();
        int int23 = levenbergMarquardtOptimizer21.getMaxEvaluations();
        int int24 = levenbergMarquardtOptimizer21.getEvaluations();
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
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker41);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double12 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 0L, 1.0d, 1.0d, (double) '4');
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 10L, (double) '4');
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        double double20 = levenbergMarquardtOptimizer5.getRMS();
        int int21 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        double double40 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) 1, (double) '4', (double) (short) 100, (double) '#');
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        double double8 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        int int17 = levenbergMarquardtOptimizer16.getEvaluations();
        int int18 = levenbergMarquardtOptimizer16.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) 0.0f, Double.NaN, (double) (byte) 1, (double) (short) -1);
        double double25 = levenbergMarquardtOptimizer24.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) (short) 0, (double) (short) 100);
        double double30 = levenbergMarquardtOptimizer29.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double35 = levenbergMarquardtOptimizer34.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker36 = null;
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialPointValuePairConvergenceChecker36);
        double double38 = levenbergMarquardtOptimizer34.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer46 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int47 = levenbergMarquardtOptimizer46.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker48 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer42.setConvergenceChecker(vectorialPointValuePairConvergenceChecker48);
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialPointValuePairConvergenceChecker48);
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialPointValuePairConvergenceChecker48);
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker48);
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialPointValuePairConvergenceChecker48);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker48);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker48);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 100.0f, (double) (-1L), (double) '4', 10.0d);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, 10.0d, (double) 100L, (double) (byte) -1, (double) 100);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        double double16 = levenbergMarquardtOptimizer14.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double21 = levenbergMarquardtOptimizer20.getRMS();
        int int22 = levenbergMarquardtOptimizer20.getMaxEvaluations();
        int int23 = levenbergMarquardtOptimizer20.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker25 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker25);
        int int28 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int29 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) 100.0f, (double) '4');
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray12 = new double[] {};
        double[] doubleArray15 = new double[] { 0L, ' ' };
        double[] doubleArray21 = new double[] { Double.NaN, 100.0d, 1, 10, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer3.optimize((int) '4', differentiableMultivariateVectorialFunction11, doubleArray12, doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[NaN, 100.0, 1.0, 10.0, 0.0]");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 0.0f, (double) (short) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) (byte) -1, 100.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 'a', (double) (byte) 1, (double) (short) 0, (double) (short) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
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
        int int42 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass43 = levenbergMarquardtOptimizer3.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 'a', (double) 10);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 0.0d, (-1.0d));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray8 = new double[] { 0.0d, (short) 10 };
        double[] doubleArray13 = new double[] { (byte) 1, 1, (-1), 0.0d };
        double[] doubleArray15 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer3.optimize((int) 'a', differentiableMultivariateVectorialFunction5, doubleArray8, doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) 100L, (double) ' ', (double) 1.0f, (double) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 10L, (double) (short) 10, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        int int13 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (-1L), (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (-1.0d), (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', Double.NaN, (double) (-1L), Double.NaN, (-1.0d));
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) (-1.0f), (double) 0, (double) (short) 1, (double) (short) 1);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double11 = levenbergMarquardtOptimizer10.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = null;
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        double double14 = levenbergMarquardtOptimizer10.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int23 = levenbergMarquardtOptimizer22.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker24);
        int int27 = levenbergMarquardtOptimizer10.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker28);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker30);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (short) 100, 0.0d, (double) 10, (double) (short) 100);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int15 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        int int16 = levenbergMarquardtOptimizer14.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        double double20 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, 1.0d, (double) 100L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray9 = new double[] { 1.0d, 10L, (-1.0d) };
        double[] doubleArray13 = new double[] { 0.0d, 1.0d, 0.0f };
        double[] doubleArray20 = new double[] { 10, (short) -1, 1, 100, 100.0f, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction5, doubleArray9, doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 1.0, 100.0, 100.0, 10.0]");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', (double) (byte) 100, 10.0d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        int int52 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker53 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray54 = levenbergMarquardtOptimizer3.getCovariances();
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker53);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 100.0d, (double) (byte) -1);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 0.0f, (double) (short) -1);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
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
        double double23 = levenbergMarquardtOptimizer5.getChiSquare();
        int int24 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 100.0f, (double) (byte) 100, (double) 10.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 10.0f, 1.0d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (-1.0f), (double) (short) 1);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { 1L, '#', (byte) 100, 1.0d, (-1) };
        double[] doubleArray20 = new double[] { 1, Double.NaN, Double.NaN, 100.0d, 1.0f, 10L };
        double[] doubleArray22 = new double[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 35.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, NaN, NaN, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 10, (double) (-1.0f), (double) (-1), (double) (short) 0);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        double double13 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int20 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        int int21 = levenbergMarquardtOptimizer19.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        double double29 = levenbergMarquardtOptimizer27.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double34 = levenbergMarquardtOptimizer33.getRMS();
        int int35 = levenbergMarquardtOptimizer33.getMaxEvaluations();
        int int36 = levenbergMarquardtOptimizer33.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        int int42 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker43 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        int int45 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 100.0d, 10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer7.getRMS();
        int int11 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray20 = new double[] { (byte) 100, (-1.0f), (short) 100, 10L };
        double[] doubleArray25 = new double[] { 100.0f, 0.0d, '4', (short) -1 };
        double[] doubleArray28 = new double[] { 10, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer3.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction15, doubleArray20, doubleArray25, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 0.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0]");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 0, (double) 100);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray17 = new double[] { 100, ' ', 10.0d, 1.0d, (byte) 10, 10.0d };
        double[] doubleArray23 = new double[] { 10, 100.0d, (byte) -1, '#', (-1) };
        double[] doubleArray25 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer3.optimize((int) (short) 100, differentiableMultivariateVectorialFunction10, doubleArray17, doubleArray23, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 32.0, 10.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0, -1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 10L, (double) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) '4', (double) 100L);
        double double8 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray10 = null;
        double[] doubleArray12 = new double[] { (-1.0d) };
        double[] doubleArray15 = new double[] { 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction9, doubleArray10, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0]");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '#', (double) '4', (double) (short) -1, 0.0d, (double) 100L);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 0.0d, (double) (-1), (double) '4', (double) (short) 100);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) 1, (double) (byte) -1, (double) 10, (double) 0L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { '4', 1L, (short) 0, 0, (short) 0 };
        double[] doubleArray19 = new double[] { '#', 100.0f, 1.0f, 0.0f, '4' };
        double[] doubleArray25 = new double[] { 10.0f, 'a', (byte) 10, '4', 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 1.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 100.0, 1.0, 0.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 97.0, 10.0, 52.0, 0.0]");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer3.getEvaluations();
        int int13 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int16 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 100L, (double) (short) 1);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) 'a', (double) 10L);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }
}

