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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray12 = new double[] { 100.0f, (short) 10, (byte) 0, (short) 0, '#' };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray20 = new double[] { 1.0f, 1.0f, 1.0f, '4', 10L, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) (short) 0, differentiableMultivariateVectorialFunction6, doubleArray12, doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 0.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 1.0, 1.0, 52.0, 10.0, 100.0]");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray9 = new double[] { 0L, (byte) 0, 0L };
        double[] doubleArray11 = new double[] { 100.0f };
        double[] doubleArray17 = new double[] { 0, 100.0f, 1L, 0.0f, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) '4', differentiableMultivariateVectorialFunction5, doubleArray9, doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 100.0, 1.0, 0.0, 0.0]");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray12 = new double[] { 0L, 10.0f, (byte) 10 };
        double[] doubleArray17 = new double[] { (short) 10, (byte) -1, 10.0d, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) 'a', differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0, 10.0, 100.0]");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray7 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray11 = new double[] { 0 };
        double[] doubleArray14 = new double[] { 100.0d, (-1) };
        double[] doubleArray18 = new double[] { 10L, 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize((int) (byte) 10, differentiableMultivariateVectorialFunction9, doubleArray11, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 10.0]");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), 0.0d, (double) (byte) 10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray16 = new double[] { 0.0d, 0.0f, (short) -1, '#', (-1) };
        double[] doubleArray20 = new double[] { 1.0f, 1.0f, (-1L) };
        double[] doubleArray23 = new double[] { 0.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer3.optimize((int) (byte) 10, differentiableMultivariateVectorialFunction10, doubleArray16, doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, -1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0]");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { (-1.0f), 1, 0, (-1.0f) };
        double[] doubleArray14 = new double[] { 'a' };
        double[] doubleArray16 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer3.optimize(100, differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray14 = new double[] { (-1.0d), (-1.0f), 1.0f };
        double[] doubleArray15 = new double[] {};
        double[] doubleArray17 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) ' ', differentiableMultivariateVectorialFunction10, doubleArray14, doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray7 = new double[] { 10.0d };
        double[] doubleArray13 = new double[] { (byte) 1, (byte) 10, 1, 10, 1L };
        double[] doubleArray20 = new double[] { 10L, Double.NaN, 100, 100.0f, (byte) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction5, doubleArray7, doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, 1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, NaN, 100.0, 100.0, 0.0, 0.0]");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction3 = null;
        double[] doubleArray10 = new double[] { '4', 'a', 0.0f, 10.0f, (short) 0, '#' };
        double[] doubleArray13 = new double[] { 10.0f, 1 };
        double[] doubleArray15 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.optimize((int) 'a', differentiableMultivariateVectorialFunction3, doubleArray10, doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 97.0, 0.0, 10.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray18 = new double[] { (-1), 1.0f, Double.NaN, (byte) 1, (-1), (-1) };
        double[] doubleArray19 = new double[] {};
        double[] doubleArray24 = new double[] { 0.0d, 0.0f, (byte) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer3.optimize((int) (short) 1, differentiableMultivariateVectorialFunction11, doubleArray18, doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0, NaN, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 1.0]");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray11 = new double[] { (byte) 1, (byte) 10, (byte) 0 };
        double[] doubleArray18 = new double[] { (short) 0, (-1.0d), 10.0d, (-1.0f), 10.0d, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction6, doubleArray7, doubleArray11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, -1.0, 10.0, -1.0, 10.0, 35.0]");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0, (double) (-1), (double) (byte) 0);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 0, (double) (-1.0f), Double.NaN, (double) (short) 100);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) (short) 1, (double) 0, (double) (-1), (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass3 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray24 = new double[] { (short) 100, 0.0f, (short) -1, ' ' };
        double[] doubleArray27 = new double[] { 100, 'a' };
        double[] doubleArray30 = new double[] { 1.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair31 = levenbergMarquardtOptimizer3.optimize(10, differentiableMultivariateVectorialFunction19, doubleArray24, doubleArray27, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 1.0]");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray9 = new double[] { 1, (-1) };
        double[] doubleArray10 = new double[] {};
        double[] doubleArray12 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer3.optimize((int) 'a', differentiableMultivariateVectorialFunction6, doubleArray9, doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0]");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray11 = new double[] { 10.0d, 1L };
        double[] doubleArray12 = new double[] {};
        double[] doubleArray17 = new double[] { 100.0f, 100L, (short) 100, Double.NaN };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction8, doubleArray11, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0, 100.0, NaN]");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        java.lang.Class<?> wildcardClass11 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { (-1.0d), 10.0d };
        double[] doubleArray13 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction4 = null;
        double[] doubleArray5 = new double[] {};
        double[] doubleArray9 = new double[] { 1, 0, 1L };
        double[] doubleArray11 = new double[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.optimize((int) (short) -1, differentiableMultivariateVectorialFunction4, doubleArray5, doubleArray9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray16 = null;
        double[] doubleArray20 = new double[] { (short) 1, 1, 0L };
        double[] doubleArray25 = new double[] { 10, 10.0d, ' ', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer3.optimize((int) (short) 1, differentiableMultivariateVectorialFunction15, doubleArray16, doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 32.0, 10.0]");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, 10.0d, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double5 = levenbergMarquardtOptimizer4.getRMS();
        int int6 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray17 = new double[] { '#', 10.0f, 1.0f, 10.0f, 0 };
        double[] doubleArray18 = null;
        double[] doubleArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.optimize((int) (short) 100, differentiableMultivariateVectorialFunction11, doubleArray17, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, 10.0, 1.0, 10.0, 0.0]");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray17 = new double[] { (-1L), (short) 10, 'a', (short) -1, Double.NaN };
        double[] doubleArray18 = null;
        double[] doubleArray20 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) (short) 0, differentiableMultivariateVectorialFunction11, doubleArray17, doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, 97.0, -1.0, NaN]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray14 = new double[] { '4', (-1), (byte) -1, 10L, (byte) 0, Double.NaN };
        double[] doubleArray21 = new double[] { 100.0f, (byte) 0, (short) 1, (short) 0, 10, 0L };
        double[] doubleArray26 = new double[] { 0.0f, 10.0d, 0.0f, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer5.optimize(10, differentiableMultivariateVectorialFunction7, doubleArray14, doubleArray21, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, -1.0, 10.0, 0.0, NaN]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 0.0, 1.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 10.0, 0.0, 100.0]");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = null;
        double[] doubleArray16 = new double[] { ' ', 'a', (short) 0, Double.NaN, (byte) 1, 0L };
        double[] doubleArray20 = new double[] { (short) 1, 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer5.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 97.0, 0.0, NaN, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 97.0, -1.0]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, 1.0d, (double) (short) 1, (double) 1L, 0.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { 100, (byte) 100, (byte) 0, 0.0d };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray19 = new double[] { 1, (byte) 100, (byte) 100, (-1L), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 100.0, -1.0, 32.0]");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray14 = new double[] { 1.0f, 100.0f, 0L, (short) 1, (byte) -1, '#' };
        double[] doubleArray15 = new double[] {};
        double[] doubleArray17 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) (short) 100, differentiableMultivariateVectorialFunction7, doubleArray14, doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 0.0, 1.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
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
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 100, (double) (short) -1, (double) (-1.0f), 10.0d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { 1L, 100L, (short) 0, 100L, (short) -1 };
        double[] doubleArray18 = new double[] { 1L, ' ', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize((int) 'a', differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 0.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 32.0, 10.0]");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, 0.0d, (double) (byte) 0, Double.NaN, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, 1.0d, (double) (short) 1, (double) 1L, 0.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray14 = new double[] { 10, 100.0f, (byte) 100, (byte) 10, 100, '#' };
        double[] doubleArray17 = new double[] { 1, (short) 1 };
        double[] doubleArray21 = new double[] { (short) 100, 10.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer5.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction7, doubleArray14, doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0, 100.0, 10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 10.0, 100.0]");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) 0, (double) (-1.0f), Double.NaN, (double) (short) 100);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) 100, (double) (byte) 10, (double) (-1), (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 0.0f, (double) '4', (double) (short) 10, 100.0d);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray18 = new double[] { 100.0f, (-1.0d), 0.0d, 0.0f };
        double[] doubleArray21 = new double[] { 10.0f, (short) 0 };
        double[] doubleArray27 = new double[] { 100L, 'a', (byte) 10, 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer3.optimize(1, differentiableMultivariateVectorialFunction13, doubleArray18, doubleArray21, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 97.0, 10.0, 1.0, 10.0]");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 1.0d, (double) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray8 = new double[] { (byte) 1, (-1L) };
        double[] doubleArray9 = new double[] {};
        double[] doubleArray13 = new double[] { (short) 10, 1.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer3.optimize((int) (short) 10, differentiableMultivariateVectorialFunction5, doubleArray8, doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 0.0]");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (-1L), (double) '#');
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray8 = new double[] { 100.0f };
        double[] doubleArray12 = new double[] { (byte) 10, 1L, (short) 10 };
        double[] doubleArray19 = new double[] { 'a', 1L, 0.0f, (byte) 1, '4', 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction6, doubleArray8, doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 1.0, 0.0, 1.0, 52.0, 100.0]");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        java.lang.Class<?> wildcardClass2 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 1.0d, (double) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray8 = new double[] { 10L };
        double[] doubleArray13 = new double[] { 1.0d, (short) 10, (-1), '4' };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction6, doubleArray8, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) (short) 100, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        java.lang.Class<?> wildcardClass14 = vectorialPointValuePairConvergenceChecker12.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) (short) 10, (double) ' ', (double) (-1.0f), 0.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { (byte) 1, 0.0f, (short) 100, (-1L), (byte) 100 };
        double[] doubleArray14 = new double[] {};
        double[] doubleArray20 = new double[] { (byte) -1, 1, 1.0f, (short) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer5.optimize((int) 'a', differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0, 100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 1.0, 1.0, 0.0, 52.0]");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction39 = null;
        double[] doubleArray46 = new double[] { 0.0f, 0L, (short) -1, 1, 1.0f, 0 };
        double[] doubleArray51 = new double[] { 1.0f, (-1.0d), 100L, (-1.0f) };
        double[] doubleArray56 = new double[] { 10, (-1), (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair57 = levenbergMarquardtOptimizer3.optimize(10, differentiableMultivariateVectorialFunction39, doubleArray46, doubleArray51, doubleArray56);
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, -1.0, 1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, -1.0, 0.0, 100.0]");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, 1.0d, (double) 100L);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        java.lang.Class<?> wildcardClass17 = vectorialPointValuePairConvergenceChecker14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (byte) 10, (double) 1.0f, (double) '#', 1.0d);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1), (double) 1L, (double) '#', (double) 10, (double) 10L);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 10, (double) (byte) 100, (double) 10L, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, 10.0d, (double) 1.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray10 = new double[] { '4', (short) -1, (-1.0f), 100 };
        double[] doubleArray11 = new double[] {};
        double[] doubleArray16 = new double[] { '#', 10, '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer3.optimize((int) (byte) 10, differentiableMultivariateVectorialFunction5, doubleArray10, doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 10.0, 52.0, 1.0]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction22 = null;
        double[] doubleArray28 = new double[] { (short) 100, 0.0d, 10.0f, (-1L), (short) -1 };
        double[] doubleArray35 = new double[] { 100.0f, 10.0d, 1.0d, 1, (byte) 0, (-1L) };
        double[] doubleArray39 = new double[] { 100.0f, 0L, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair40 = levenbergMarquardtOptimizer3.optimize((int) ' ', differentiableMultivariateVectorialFunction22, doubleArray28, doubleArray35, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 0.0, 10.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 10.0, 1.0, 1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 0.0, -1.0]");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray10 = new double[] {};
        double[] doubleArray12 = new double[] { (-1L) };
        double[] doubleArray18 = new double[] { 100.0d, 0.0d, 0.0f, 'a', 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize((-1), differentiableMultivariateVectorialFunction9, doubleArray10, doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 0.0, 0.0, 97.0, 10.0]");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 0, (double) (-1), (double) (short) 1, (double) (-1.0f));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = null;
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker6);
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer5.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = vectorialPointValuePairConvergenceChecker4.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) 0, (double) (-1), (double) (short) 1, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) (byte) -1, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) (-1L), (double) 1, (double) 100.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray10 = new double[] { 0.0f, 'a' };
        double[] doubleArray16 = new double[] { 0, (byte) 0, (byte) 100, 1, 100.0f };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer5.optimize(100, differentiableMultivariateVectorialFunction7, doubleArray10, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 100.0, 1.0, 100.0]");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray13 = new double[] { (byte) 0, (short) 100, (byte) 1 };
        double[] doubleArray15 = new double[] { (byte) 0 };
        double[] doubleArray18 = new double[] { 'a', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction9, doubleArray13, doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 0.0]");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) 100, (double) (byte) 10, (double) (-1), (double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) 0, (double) (short) 100);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) (short) 1, 0.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray12 = new double[] { 100.0d, 10.0f, 1.0d, (short) 0, (short) 100, 1.0d };
        double[] doubleArray19 = new double[] { ' ', 100.0d, (-1), 1.0d, 10.0f, (short) 100 };
        double[] doubleArray24 = new double[] { '#', (byte) 100, (short) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer3.optimize((int) (short) 100, differentiableMultivariateVectorialFunction5, doubleArray12, doubleArray19, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 1.0, 0.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 100.0, -1.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[35.0, 100.0, 100.0, 100.0]");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray10 = null;
        double[] doubleArray14 = new double[] { (short) 10, 100.0f, (byte) 1 };
        double[] doubleArray19 = new double[] { 1, 'a', 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer3.optimize((int) '#', differentiableMultivariateVectorialFunction9, doubleArray10, doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 97.0, 10.0, -1.0]");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction21 = null;
        double[] doubleArray22 = null;
        double[] doubleArray28 = new double[] { (short) 1, 'a', 1.0d, 100L, 10.0d };
        double[] doubleArray34 = new double[] { (short) 1, 10.0d, (-1), 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair35 = levenbergMarquardtOptimizer3.optimize((-1), differentiableMultivariateVectorialFunction21, doubleArray22, doubleArray28, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 97.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0, -1.0, 0.0, 10.0]");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray13 = new double[] { (-1), 0.0d, 100, (byte) -1 };
        double[] doubleArray15 = new double[] { 100L };
        double[] doubleArray20 = new double[] { (short) 1, (short) 100, 100.0f, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction8, doubleArray13, doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray16 = new double[] { '#', 0, 1.0d, 1L, 'a', (byte) -1 };
        double[] doubleArray17 = new double[] {};
        double[] doubleArray20 = new double[] { 1L, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer5.optimize((int) (short) 0, differentiableMultivariateVectorialFunction9, doubleArray16, doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 0.0, 1.0, 1.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 1.0]");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        double double13 = levenbergMarquardtOptimizer3.getChiSquare();
        int int14 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray13 = new double[] { 10L, (short) 100, 0.0d, (short) 100 };
        double[] doubleArray18 = new double[] { Double.NaN, (byte) 0, (-1), 100 };
        double[] doubleArray21 = new double[] { (short) 1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction8, doubleArray13, doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[NaN, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 0.0]");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (byte) 10, (double) 1.0f, (double) '#', 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (-1L), (double) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray10 = new double[] { 1, 100L, 100.0f, Double.NaN };
        double[] doubleArray16 = new double[] { '#', (-1.0f), (byte) 100, (byte) 100, (byte) 1 };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) ' ', differentiableMultivariateVectorialFunction5, doubleArray10, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 100.0, 100.0, NaN]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, -1.0, 100.0, 100.0, 1.0]");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 1.0d, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray12 = new double[] { Double.NaN, 10.0f, 10, 0.0f, 0.0f, 0.0f };
        double[] doubleArray18 = new double[] { 10L, (-1L), 10.0d, 100.0f, ' ' };
        double[] doubleArray21 = new double[] { 10.0f, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer3.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction5, doubleArray12, doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[NaN, 10.0, 10.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 10.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, -1.0]");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray10 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer5.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction8, doubleArray10, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray13 = new double[] { 10.0f, (byte) 1, 100L };
        double[] doubleArray15 = new double[] { (byte) 1 };
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer5.optimize((int) (short) -1, differentiableMultivariateVectorialFunction9, doubleArray13, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = vectorialPointValuePairConvergenceChecker6.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, (double) ' ', (-1.0d), Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray25 = new double[] { 'a', (-1L), 10.0d, 100.0f, 0L };
        double[] doubleArray27 = new double[] { (byte) 10 };
        double[] doubleArray28 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer3.optimize((int) (short) 1, differentiableMultivariateVectorialFunction19, doubleArray25, doubleArray27, doubleArray28);
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { 10, (short) 10, 'a', 'a' };
        double[] doubleArray19 = new double[] { 100.0f, 1.0d, (byte) -1, 100L, (short) 0, 10.0d };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, -1.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction31 = null;
        double[] doubleArray37 = new double[] { 0.0d, (short) 100, 10, 100L, (short) 1 };
        double[] doubleArray40 = new double[] { 100.0f, '#' };
        double[] doubleArray42 = new double[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair43 = levenbergMarquardtOptimizer3.optimize((int) (short) 10, differentiableMultivariateVectorialFunction31, doubleArray37, doubleArray40, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker26);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 100.0, 10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0]");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        java.lang.Class<?> wildcardClass18 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) 10.0f);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray8 = new double[] { 100.0d, 0.0f };
        double[] doubleArray9 = new double[] {};
        double[] doubleArray13 = new double[] { 10, 10L, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer3.optimize((int) '#', differentiableMultivariateVectorialFunction5, doubleArray8, doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 10.0]");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray12 = new double[] { 1, 1.0f };
        double[] doubleArray15 = new double[] { (short) 100, 10.0f };
        double[] doubleArray22 = new double[] { 1, Double.NaN, (byte) -1, 100, ' ', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer5.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction9, doubleArray12, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, NaN, -1.0, 100.0, 32.0, 100.0]");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        java.lang.Class<?> wildcardClass9 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 'a', (double) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker16);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) (-1.0f), 0.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        double[] doubleArray32 = new double[] { 100.0d, 10.0d, 1L };
        double[] doubleArray33 = new double[] {};
        double[] doubleArray36 = new double[] { 'a', (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair37 = levenbergMarquardtOptimizer5.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction28, doubleArray32, doubleArray33, doubleArray36);
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
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[97.0, -1.0]");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) 0, Double.NaN, (double) (short) 0, (double) (byte) 100);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 0L, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction22 = null;
        double[] doubleArray25 = new double[] { 100.0f, (short) -1 };
        double[] doubleArray32 = new double[] { Double.NaN, '4', 1, (byte) 1, 1L, (byte) 100 };
        double[] doubleArray33 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair34 = levenbergMarquardtOptimizer3.optimize((int) 'a', differentiableMultivariateVectorialFunction22, doubleArray25, doubleArray32, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[NaN, 52.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 100.0d, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) (short) 0, (double) (short) 100);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray10 = new double[] { (short) 100, (-1.0f), 100.0f, (short) 1 };
        double[] doubleArray17 = new double[] { (-1L), 10.0d, 1, (byte) 100, (byte) 10, 100L };
        double[] doubleArray20 = new double[] { 10L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) '#', differentiableMultivariateVectorialFunction5, doubleArray10, doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, 1.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0]");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 100.0d, 10.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = null;
        double[] doubleArray8 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer3.optimize((int) (short) -1, differentiableMultivariateVectorialFunction5, doubleArray6, doubleArray7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) 100, (double) (byte) 10, (double) (-1), (double) (byte) -1);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, 0.0d, (double) (byte) -1, (double) 100L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 100.0d, 10.0d);
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        int int10 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer8.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray18 = new double[] { (byte) 100, 100 };
        double[] doubleArray25 = new double[] { (-1.0d), 0, 10.0f, 100.0d, (-1), (short) -1 };
        double[] doubleArray29 = new double[] { (-1.0d), (short) 100, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer3.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction15, doubleArray18, doubleArray25, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 0.0]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        java.lang.Class<?> wildcardClass69 = vectorialPointValuePairConvergenceChecker65.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1L), (double) 'a');
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray11 = new double[] { 10.0d, 0.0f, (byte) 100, 10, '#' };
        double[] doubleArray13 = new double[] { 10L };
        double[] doubleArray15 = new double[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction5, doubleArray11, doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 100.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int14 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray19 = new double[] { (-1L), 0.0d };
        double[] doubleArray22 = new double[] { 0.0f, 100.0f };
        double[] doubleArray23 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer5.optimize((int) '#', differentiableMultivariateVectorialFunction16, doubleArray19, doubleArray22, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray8 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        java.lang.Class<?> wildcardClass1 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 0.0f, (double) (short) 100, 0.0d, (double) 100L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray13 = new double[] { (byte) -1, (byte) 1, (byte) 0, 0.0d };
        double[] doubleArray19 = new double[] { 'a', 1.0f, 100L, (-1.0d), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer5.optimize(1, differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 1.0, 100.0, -1.0, 0.0]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 100, (double) 10L, (double) 10L, (double) (byte) 1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { (-1), (short) 0, 100, (-1) };
        double[] doubleArray13 = null;
        double[] doubleArray19 = new double[] { 1L, 10.0d, (byte) 0, (-1.0d), '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer5.optimize((int) '#', differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 0.0, -1.0, 52.0]");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray8 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, 0.0d, (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray12 = new double[] { 1.0d, (-1.0f), (byte) -1, 'a', 100 };
        double[] doubleArray17 = new double[] { 0.0f, (byte) 1, (byte) -1, (short) 1 };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction6, doubleArray12, doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, -1.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray11 = new double[] { (-1), (short) 100, 100 };
        double[] doubleArray18 = new double[] { (short) 1, (short) 0, 10L, (-1.0f), 100.0f, 1.0f };
        double[] doubleArray21 = new double[] { 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer5.optimize(10, differentiableMultivariateVectorialFunction7, doubleArray11, doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 0.0, 10.0, -1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 52.0]");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction2 = null;
        double[] doubleArray9 = new double[] { 10L, 100L, 100L, 100, 100, (byte) -1 };
        double[] doubleArray10 = new double[] {};
        double[] doubleArray14 = new double[] { (short) 1, (byte) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.optimize(0, differentiableMultivariateVectorialFunction2, doubleArray9, doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 100.0, 100.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 0.0]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray11 = new double[] {};
        double[] doubleArray15 = new double[] { '4', (short) 1, 100.0f };
        double[] doubleArray20 = new double[] { 0, (-1.0d), 1.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) (short) 1, differentiableMultivariateVectorialFunction10, doubleArray11, doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, -1.0, 1.0, 10.0]");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray8 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction3 = null;
        double[] doubleArray5 = new double[] { 1L };
        double[] doubleArray10 = new double[] { (short) 0, (byte) 10, 0.0f, (byte) 1 };
        double[] doubleArray12 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.optimize((int) 'a', differentiableMultivariateVectorialFunction3, doubleArray5, doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 10.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0]");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        java.lang.Class<?> wildcardClass23 = vectorialPointValuePairConvergenceChecker20.getClass();
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        int int7 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray15 = new double[] { 10.0d, 1.0d };
        double[] doubleArray20 = new double[] { 10.0d, (short) 1, (byte) 1, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize(100, differentiableMultivariateVectorialFunction10, doubleArray12, doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, Double.NaN, (double) 100.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer28.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker38 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker38);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction41 = null;
        double[] doubleArray48 = new double[] { ' ', (byte) 0, 0.0d, 100L, (short) -1, (byte) -1 };
        double[] doubleArray55 = new double[] { (short) 100, (-1L), 10.0f, 1, (short) 1, '4' };
        double[] doubleArray59 = new double[] { (byte) 10, 0.0f, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair60 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction41, doubleArray48, doubleArray55, doubleArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[32.0, 0.0, 0.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, -1.0, 10.0, 1.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 0.0, 0.0]");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, Double.NaN, (double) 0, (-1.0d), (double) (byte) 100);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 10.0f, (double) (-1.0f), (double) ' ', (double) (short) 1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray14 = new double[] { 100, 10.0f, 100.0d, 10, (byte) 100, 'a' };
        double[] doubleArray20 = new double[] { (byte) 100, 0.0f, 10.0d, 100.0d, 100.0d };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer5.optimize((int) '4', differentiableMultivariateVectorialFunction7, doubleArray14, doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 100.0, 10.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 0.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        int int10 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer8.getEvaluations();
        int int12 = levenbergMarquardtOptimizer8.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        java.lang.Class<?> wildcardClass20 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), (double) 10L, 0.0d, (double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 100, (double) (byte) -1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 100, (double) 10L, (double) 10L, (double) (byte) 1);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        java.lang.Class<?> wildcardClass14 = vectorialPointValuePairConvergenceChecker12.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass18 = vectorialPointValuePairConvergenceChecker16.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getEvaluations();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) 1L, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        double double9 = levenbergMarquardtOptimizer5.getChiSquare();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        java.lang.Class<?> wildcardClass36 = levenbergMarquardtOptimizer3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 100.0d, (double) 1L, (double) 'a', (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = vectorialPointValuePairConvergenceChecker6.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int13 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        java.lang.Class<?> wildcardClass17 = vectorialPointValuePairConvergenceChecker14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray24 = new double[] { (byte) 1, (-1L), (byte) -1, ' ' };
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer3.optimize((int) (short) 10, differentiableMultivariateVectorialFunction19, doubleArray24, doubleArray25, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray9 = new double[] { (short) -1, Double.NaN };
        double[] doubleArray10 = new double[] {};
        double[] doubleArray17 = new double[] { (-1.0f), 1.0d, (byte) 0, (-1), 100.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer3.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction6, doubleArray9, doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, NaN]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 0.0, -1.0, 100.0, 10.0]");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, 0.0d, Double.NaN, (double) (byte) 0, 0.0d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 100.0d, (double) 1L, (double) 'a', (double) 1.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = null;
        double[] doubleArray16 = new double[] { (-1L), (byte) 0, (byte) -1, 'a', 10, 10 };
        double[] doubleArray23 = new double[] { 100.0f, (-1L), 1L, 0.0d, 10.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer5.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0, -1.0, 97.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, -1.0, 1.0, 0.0, 10.0, -1.0]");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass8 = vectorialPointValuePairConvergenceChecker7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double26 = levenbergMarquardtOptimizer25.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker27 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker27);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker27);
        int int30 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 100, (double) (byte) 10, (double) 10L, (double) (-1));
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray7 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (short) 100, (double) (byte) 10, (double) (-1), (double) (byte) -1);
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) (-1L), (double) (short) 10, (double) 'a', (double) 1L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray16 = new double[] { (short) 0, 0L, (short) 100, ' ' };
        double[] doubleArray21 = new double[] { 0.0d, (short) 10, 100L, (byte) 100 };
        double[] doubleArray28 = new double[] { (short) 1, 0, 0.0f, 1L, (byte) 100, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer3.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction11, doubleArray16, doubleArray21, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 0.0, 0.0, 1.0, 100.0, 10.0]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.Class<?> wildcardClass21 = vectorialPointValuePairConvergenceChecker19.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker16);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray11 = new double[] {};
        double[] doubleArray17 = new double[] { 10.0d, 100L, Double.NaN, (byte) 0, 100.0d };
        double[] doubleArray20 = new double[] { (short) 100, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction10, doubleArray11, doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, NaN, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 0.0]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, 0.0d, (double) (byte) 0, Double.NaN, (double) (-1.0f));
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        java.lang.Class<?> wildcardClass15 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
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
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        double double18 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (-1.0f), Double.NaN);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray10 = new double[] { 10.0f, (short) 10, 0.0d };
        double[] doubleArray12 = new double[] { (-1) };
        double[] doubleArray16 = new double[] { ' ', 1.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer3.optimize((int) (short) 100, differentiableMultivariateVectorialFunction6, doubleArray10, doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 1.0, 0.0]");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = vectorialPointValuePairConvergenceChecker5.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double5 = levenbergMarquardtOptimizer4.getRMS();
        int int6 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer4.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) 1.0f, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray15 = new double[] { (byte) 10, ' ', (byte) 1 };
        double[] doubleArray22 = new double[] { ' ', '4', (byte) 10, 10.0d, (-1.0d), (-1.0d) };
        double[] doubleArray24 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction11, doubleArray15, doubleArray22, doubleArray24);
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 52.0, 10.0, 10.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0]");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker15);
        double double18 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) -1, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (-1.0f), Double.NaN);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (short) 10, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { 10, (byte) 10, '4', (byte) 1, (byte) 0 };
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { (short) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 52.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0, -1.0]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) (short) -1, (double) (byte) -1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray11 = new double[] { 1.0d, 0, (-1), (short) 1, '#' };
        double[] doubleArray13 = new double[] { 1.0f };
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction5, doubleArray11, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 0.0, -1.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = null;
        double[] doubleArray13 = new double[] { (byte) 100, 0.0d, (short) 10 };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) (-1), 1.0d, (double) '4', (double) (byte) 10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 0.0f, 0.0d);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) (short) 0, (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, (double) 100L, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getChiSquare();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray8 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 0, 0.0d, (double) 'a', 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker13 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker13);
        java.lang.Class<?> wildcardClass15 = vectorialPointValuePairConvergenceChecker13.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int10 = levenbergMarquardtOptimizer9.getEvaluations();
        double double11 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray13 = new double[] { 0.0f, (byte) 0, '4', (-1L), 100L };
        double[] doubleArray20 = new double[] { (-1), (-1L), ' ', (-1), (-1.0f), (byte) 0 };
        double[] doubleArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer5.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction7, doubleArray13, doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 32.0, -1.0, -1.0, 0.0]");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) (short) 0, (double) (short) 100);
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) (short) 10, (double) 10L, (double) (-1.0f), (double) ' ');
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 1.0d, (double) 0);
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
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray11 = new double[] {};
        double[] doubleArray16 = new double[] { 1, 100L, 10.0d, (byte) 1 };
        double[] doubleArray18 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((int) '#', differentiableMultivariateVectorialFunction10, doubleArray11, doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray14 = new double[] { (byte) 100, (byte) 100 };
        double[] doubleArray16 = new double[] { 1L };
        double[] doubleArray23 = new double[] { (-1.0f), (byte) -1, (short) 0, '#', (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer3.optimize(10, differentiableMultivariateVectorialFunction11, doubleArray14, doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 0.0, 35.0, 1.0, 10.0]");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double7 = levenbergMarquardtOptimizer6.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer6.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int8 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker9 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker14);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction17 = null;
        double[] doubleArray18 = new double[] {};
        double[] doubleArray20 = new double[] { 'a' };
        double[] doubleArray22 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer3.optimize(10, differentiableMultivariateVectorialFunction17, doubleArray18, doubleArray20, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (byte) 0, (double) 100, (double) 10.0f, (double) (short) 0);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 1, (double) (byte) 100);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray16 = new double[] { 1L, 0L, 100.0d, 1.0f, (short) 10, 100L };
        double[] doubleArray19 = new double[] { 0.0f, 100.0d };
        double[] doubleArray22 = new double[] { (byte) 0, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer5.optimize((int) '4', differentiableMultivariateVectorialFunction9, doubleArray16, doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0, 100.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 100.0]");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) '#', (double) (-1L), (double) 1L, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        int int9 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer3.getChiSquare();
        int int11 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1, (double) (short) 10);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1L), (double) 'a');
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { (short) 10, 10L, (-1.0d), 'a' };
        double[] doubleArray19 = new double[] { 1.0d, (short) 10, (short) -1, (short) 100, (byte) 10, (-1.0d) };
        double[] doubleArray23 = new double[] { (-1.0d), 100L, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer3.optimize((int) (short) 100, differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray19, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, -1.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 1.0]");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (-1.0d), 0.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        int int10 = levenbergMarquardtOptimizer5.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray17 = new double[] { (byte) 10, (byte) 100, (-1.0d), (byte) 1, (-1.0d), '4' };
        double[] doubleArray23 = new double[] { (byte) -1, (-1L), ' ', Double.NaN, '4' };
        double[] doubleArray24 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction10, doubleArray17, doubleArray23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, -1.0, 1.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 32.0, NaN, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 0, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 1, (double) '#');
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) 1L, (double) ' ');
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        java.lang.Class<?> wildcardClass10 = vectorialPointValuePairConvergenceChecker8.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (short) 10, (-1.0d));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray10 = new double[] { '4', 100, (short) 10, 0 };
        double[] doubleArray11 = new double[] {};
        double[] doubleArray16 = new double[] { 100.0d, (byte) -1, 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer3.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction5, doubleArray10, doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, -1.0, 0.0, -1.0]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 0, (double) 1.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 0, (double) 1.0f);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray10 = new double[] { (short) 100, (byte) 100, (byte) 10 };
        double[] doubleArray12 = new double[] { '#' };
        double[] doubleArray16 = new double[] { 0L, (-1), 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction6, doubleArray10, doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, -1.0, 100.0]");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray17 = new double[] {};
        double[] doubleArray24 = new double[] { (-1.0f), (byte) 10, 10.0d, (byte) 1, 0, 'a' };
        double[] doubleArray31 = new double[] { 10L, 10L, (short) 10, 100.0f, (-1L), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer5.optimize((int) (short) 0, differentiableMultivariateVectorialFunction16, doubleArray17, doubleArray24, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 10.0, 10.0, 1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 10.0, 100.0, -1.0, 10.0]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (short) -1, (double) 1L, 0.0d, 0.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { 1.0f, Double.NaN, 0.0f, (short) 100 };
        double[] doubleArray13 = null;
        double[] doubleArray17 = new double[] { (byte) -1, (-1.0f), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer5.optimize(100, differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, NaN, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 0.0]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray15 = new double[] { 'a', (byte) 100, (byte) 10, (byte) 10 };
        double[] doubleArray22 = new double[] { ' ', 0.0d, (-1.0f), (short) 0, Double.NaN, (-1.0f) };
        double[] doubleArray24 = new double[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer3.optimize((int) (short) 10, differentiableMultivariateVectorialFunction10, doubleArray15, doubleArray22, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 0.0, -1.0, 0.0, NaN, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0]");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (-1.0f), Double.NaN);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 100, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 0L, (double) (byte) -1);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction22 = null;
        double[] doubleArray27 = new double[] { (short) -1, 10.0f, 1.0d, 'a' };
        double[] doubleArray32 = new double[] { 100.0f, 1.0d, 10L, (short) 100 };
        double[] doubleArray38 = new double[] { (-1.0d), '4', '#', Double.NaN, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair39 = levenbergMarquardtOptimizer3.optimize((int) (short) 10, differentiableMultivariateVectorialFunction22, doubleArray27, doubleArray32, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 10.0, 1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 52.0, 35.0, NaN, 0.0]");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int10 = levenbergMarquardtOptimizer9.getEvaluations();
        int int11 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double16 = levenbergMarquardtOptimizer15.getRMS();
        int int17 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer15.getJacobianEvaluations();
        double double19 = levenbergMarquardtOptimizer15.getChiSquare();
        int int20 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double25 = levenbergMarquardtOptimizer24.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker26 = null;
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker26);
        int int28 = levenbergMarquardtOptimizer24.getEvaluations();
        double double29 = levenbergMarquardtOptimizer24.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double34 = levenbergMarquardtOptimizer33.getRMS();
        int int35 = levenbergMarquardtOptimizer33.getMaxEvaluations();
        int int36 = levenbergMarquardtOptimizer33.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker37);
        java.lang.Class<?> wildcardClass42 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double10 = levenbergMarquardtOptimizer9.getRMS();
        int int11 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        double double14 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double8 = levenbergMarquardtOptimizer7.getRMS();
        int int9 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer7.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        java.lang.Class<?> wildcardClass21 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 1.0f, 0.0d);
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (short) 10, (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray13 = new double[] { 1, 0, (short) 0 };
        double[] doubleArray18 = new double[] { '4', 10L, 1.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize(1, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 10.0, 1.0, 0.0]");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = vectorialPointValuePairConvergenceChecker6.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (double) (byte) 10, 0.0d, (double) (byte) 100, (double) (byte) -1);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 100.0f, (double) (byte) 1, (double) (-1L), 100.0d);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (short) 100, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
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
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, Double.NaN, (double) 0, (-1.0d), (double) (byte) 100);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray14 = new double[] { (-1), (short) 100, ' ', 100.0f, Double.NaN, 1 };
        double[] doubleArray15 = new double[] {};
        double[] doubleArray20 = new double[] { '4', 100, '#', 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer5.optimize((-1), differentiableMultivariateVectorialFunction7, doubleArray14, doubleArray15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 32.0, 100.0, NaN, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 100.0, 35.0, 1.0]");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) 1.0f, (double) 10L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), 0.0d, 0.0d, (double) 0.0f, (double) 100L);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) 0, (double) (-1.0f));
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray13 = new double[] { (short) -1 };
        double[] doubleArray17 = new double[] { 1.0d, (short) -1, 1.0d };
        double[] doubleArray23 = new double[] { '#', 10L, (short) 100, 100.0f, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer3.optimize((int) (short) 10, differentiableMultivariateVectorialFunction11, doubleArray13, doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, 10.0, 100.0, 100.0, 10.0]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 100.0d, (double) 1L, (double) 'a', (double) 1.0f);
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (-1.0d), (double) (byte) 10);
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction27 = null;
        double[] doubleArray32 = new double[] { 1.0d, (short) 10, ' ', (byte) -1 };
        double[] doubleArray33 = new double[] {};
        double[] doubleArray35 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair36 = levenbergMarquardtOptimizer0.optimize(100, differentiableMultivariateVectorialFunction27, doubleArray32, doubleArray33, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker23);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 10.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int25 = levenbergMarquardtOptimizer24.getEvaluations();
        int int26 = levenbergMarquardtOptimizer24.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double32 = levenbergMarquardtOptimizer31.getRMS();
        int int33 = levenbergMarquardtOptimizer31.getMaxEvaluations();
        int int34 = levenbergMarquardtOptimizer31.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker35 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker35);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer47 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double48 = levenbergMarquardtOptimizer47.getRMS();
        int int49 = levenbergMarquardtOptimizer47.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker50 = levenbergMarquardtOptimizer47.getConvergenceChecker();
        levenbergMarquardtOptimizer43.setConvergenceChecker(vectorialPointValuePairConvergenceChecker50);
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialPointValuePairConvergenceChecker50);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker50);
        double double54 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker35);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker50);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) 100.0f, (double) 10);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double7 = levenbergMarquardtOptimizer6.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer6.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray18 = new double[] { (-1.0d), 100L, 10.0d, 10L };
        double[] doubleArray22 = new double[] { 1, 10.0f, 0L };
        double[] doubleArray27 = new double[] { 0L, (byte) 100, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer3.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction13, doubleArray18, doubleArray22, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 100.0, 10.0, 1.0]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, 0.0d, (double) 1.0f);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker20 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker20);
        int int22 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker8);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker18);
        java.lang.Class<?> wildcardClass21 = vectorialPointValuePairConvergenceChecker18.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) '4', (double) '#', (double) (-1), (double) (short) 100);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { 1.0f, (short) 100 };
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer5.optimize((int) (short) 100, differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0]");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray14 = new double[] { ' ', 10.0d, 10L };
        double[] doubleArray20 = new double[] { (-1.0f), 0.0f, ' ', 10.0f, 0.0f };
        double[] doubleArray27 = new double[] { (short) 0, 100.0d, 'a', 0L, (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer5.optimize((int) (byte) 10, differentiableMultivariateVectorialFunction10, doubleArray14, doubleArray20, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0, 32.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 100.0, 97.0, 0.0, -1.0, 1.0]");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray33 = levenbergMarquardtOptimizer5.getCovariances();
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
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker31);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { 100.0f, (byte) 1, (short) 0, 10.0d, (short) 100 };
        double[] doubleArray16 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.optimize((int) (short) 0, differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, 0.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        int int28 = levenbergMarquardtOptimizer5.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 1, (double) ' ', 10.0d, Double.NaN);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        double double13 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
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
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker58);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray62 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (-1.0f), (double) 1L, (double) 0.0f, (double) (short) 10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1L), (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray11 = new double[] { 0.0d, (-1.0f) };
        double[] doubleArray12 = new double[] {};
        double[] doubleArray17 = new double[] { 'a', (-1.0d), (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer5.optimize(100, differentiableMultivariateVectorialFunction8, doubleArray11, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, -1.0, 0.0, 10.0]");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray15 = new double[] { 'a', 0, (-1.0f), (byte) 10, 1.0f, (short) 10 };
        double[] doubleArray17 = new double[] { 10 };
        double[] doubleArray21 = new double[] { ' ', '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer5.optimize(1, differentiableMultivariateVectorialFunction8, doubleArray15, doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 0.0, -1.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 35.0, 0.0]");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getRMS();
        double double8 = levenbergMarquardtOptimizer5.getRMS();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getChiSquare();
        double double2 = levenbergMarquardtOptimizer0.getChiSquare();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        int int81 = levenbergMarquardtOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0.0f, (double) '#', (double) (-1L), (double) 0L, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1, (double) (short) 10);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray12 = new double[] { (-1.0f), Double.NaN, 0 };
        double[] doubleArray18 = new double[] { '4', 10.0f, '4', 1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, NaN, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 10.0, 52.0, 1.0, -1.0]");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) -1, 10.0d, (double) (-1L), (double) 'a');
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) 1, (double) (short) 10);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray12 = new double[] { (byte) 1, 0L, (byte) 1, 'a', (byte) 1 };
        double[] doubleArray14 = new double[] { 'a' };
        double[] doubleArray21 = new double[] { Double.NaN, 10, 0, '4', (-1), 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction6, doubleArray12, doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, 1.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[NaN, 10.0, 0.0, 52.0, -1.0, 0.0]");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, 0.0d, (double) (byte) 0, Double.NaN, (double) (-1.0f));
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray12 = new double[] { 10L, 'a' };
        double[] doubleArray19 = new double[] { 0, (byte) 100, 10L, 0, 1L, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer5.optimize((int) (short) 10, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 100.0, 10.0, 0.0, 1.0, 0.0]");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray13 = new double[] { 100.0f, (-1L), 10.0d, ' ' };
        double[] doubleArray20 = new double[] { (byte) 10, (short) 10, 100.0d, (byte) -1, 1L, (byte) -1 };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction8, doubleArray13, doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, -1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) '4', (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        int int22 = levenbergMarquardtOptimizer3.getEvaluations();
        double double23 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1.0f, (double) (byte) 10, (double) (-1L));
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker50 = levenbergMarquardtOptimizer49.getConvergenceChecker();
        levenbergMarquardtOptimizer45.setConvergenceChecker(vectorialPointValuePairConvergenceChecker50);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer57 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer63 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker64 = levenbergMarquardtOptimizer63.getConvergenceChecker();
        levenbergMarquardtOptimizer57.setConvergenceChecker(vectorialPointValuePairConvergenceChecker64);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker66 = levenbergMarquardtOptimizer57.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer67 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double68 = levenbergMarquardtOptimizer67.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker69 = levenbergMarquardtOptimizer67.getConvergenceChecker();
        levenbergMarquardtOptimizer57.setConvergenceChecker(vectorialPointValuePairConvergenceChecker69);
        levenbergMarquardtOptimizer45.setConvergenceChecker(vectorialPointValuePairConvergenceChecker69);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialPointValuePairConvergenceChecker69);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker69);
        java.lang.Class<?> wildcardClass74 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker18);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker38);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker50);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker64);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker66);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker69);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1), (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 100.0d, (double) 1L, (double) 'a', (double) 1.0f);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray12 = new double[] { 10.0d, (short) 10, '#' };
        double[] doubleArray19 = new double[] { 100.0d, 'a', (-1.0f), 0.0f, 10.0d, 1L };
        double[] doubleArray25 = new double[] { Double.NaN, (byte) 100, 1.0d, (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer5.optimize((-1), differentiableMultivariateVectorialFunction8, doubleArray12, doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 97.0, -1.0, 0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[NaN, 100.0, 1.0, 10.0, 35.0]");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 100.0d, 10.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray12 = new double[] { (-1), Double.NaN, 100, (-1), 10, (byte) 100 };
        double[] doubleArray19 = new double[] { 0.0d, 100L, 0L, (-1L), 10.0d, 100.0f };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) (short) 0, differentiableMultivariateVectorialFunction5, doubleArray12, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, NaN, 100.0, -1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 100.0, 0.0, -1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double7 = levenbergMarquardtOptimizer6.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer6.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker10 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) 100.0f, (double) (-1L), 0.0d, (double) 100.0f);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (-1.0d), (double) 10);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (-1L), (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) 10, 0.0d, (double) (byte) 10, (double) 100L);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 0.0d, (double) 10, (double) 0, (double) 100L);
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray22 = new double[] { (short) -1, 1, (byte) -1, (-1.0d), (-1.0d) };
        double[] doubleArray24 = new double[] { (short) 10 };
        double[] doubleArray25 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer3.optimize((int) '4', differentiableMultivariateVectorialFunction16, doubleArray22, doubleArray24, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 1.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) ' ', (double) (short) 1);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) 1, (double) (short) 100);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) (short) 10, (double) ' ', (double) (-1.0f), 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0, (double) (byte) 1, (double) 10.0f);
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) 100.0f, (double) 100L, (double) 100, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray11 = new double[] { (-1.0d) };
        double[] doubleArray18 = new double[] { 100, (short) -1, (short) 10, '4', (byte) 10, 1 };
        double[] doubleArray20 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer3.optimize((int) (short) 0, differentiableMultivariateVectorialFunction9, doubleArray11, doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, -1.0, 10.0, 52.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) 100L, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray8 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        double double11 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray18 = new double[] { (short) 1, (short) 100, (byte) 0, '#' };
        double[] doubleArray24 = new double[] { (byte) 100, 1.0f, (-1.0f), 0.0d, (short) -1 };
        double[] doubleArray25 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer5.optimize((int) (short) 100, differentiableMultivariateVectorialFunction13, doubleArray18, doubleArray24, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 100.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 1.0, -1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, 1.0d, (double) 1L, (double) (byte) 1, (double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = levenbergMarquardtOptimizer3.guessParametersErrors();
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
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker2 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        java.lang.Class<?> wildcardClass4 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) (byte) 10, (double) ' ', (double) (-1), (double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        double double8 = levenbergMarquardtOptimizer5.getChiSquare();
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, (double) (byte) 100, (double) 0L, (double) 10.0f, (double) (byte) 1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(10.0d, (double) (short) -1, (double) 1, (double) (-1.0f), Double.NaN);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, 1.0d, (double) 0L, 0.0d, (double) (short) 10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray14 = new double[] { 100L, (-1), '4', (-1L), (-1L), 1.0f };
        double[] doubleArray16 = new double[] { '4' };
        double[] doubleArray18 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((int) ' ', differentiableMultivariateVectorialFunction7, doubleArray14, doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 52.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0]");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) (short) 1, (double) 10L, (double) 1L, 0.0d);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = null;
        double[] doubleArray13 = new double[] { ' ', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer5.optimize((int) (byte) 100, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0]");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 10, 10.0d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double2 = levenbergMarquardtOptimizer0.getRMS();
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getChiSquare();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, 0.0d, (double) 10, (double) 0, (double) 100L);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int15 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        double double16 = levenbergMarquardtOptimizer14.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double18 = levenbergMarquardtOptimizer17.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        int int20 = levenbergMarquardtOptimizer17.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker21 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker21);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker24 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker21);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker24);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker7);
        java.lang.Class<?> wildcardClass9 = vectorialPointValuePairConvergenceChecker7.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        java.lang.Class<?> wildcardClass21 = levenbergMarquardtOptimizer3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, 0.0d, (double) (byte) 0, Double.NaN, (double) (-1.0f));
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction24 = null;
        double[] doubleArray28 = new double[] { 100.0f, (byte) 10, 10.0f };
        double[] doubleArray31 = new double[] { 1.0d, (byte) 0 };
        double[] doubleArray35 = new double[] { '#', 100.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair36 = levenbergMarquardtOptimizer5.optimize((int) (short) -1, differentiableMultivariateVectorialFunction24, doubleArray28, doubleArray31, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker20);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 0.0]");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 1.0f, (double) (-1), 1.0d, (double) 100);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray12 = new double[] { 0, 10.0f, 0L, (short) -1, (short) 100 };
        double[] doubleArray15 = new double[] { 0.0f, (byte) 0 };
        double[] doubleArray18 = new double[] { 10.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer3.optimize((int) (short) 10, differentiableMultivariateVectorialFunction6, doubleArray12, doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 10.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 32.0]");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) 100, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 0.0f, (double) (short) 100, 0.0d, (double) 100L);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray14 = new double[] { (short) 1, 0L, (-1.0f), ' ' };
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer5.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, -1.0, 32.0]");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, Double.NaN, (-1.0d));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.lang.Class<?> wildcardClass21 = vectorialPointValuePairConvergenceChecker18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) 1L, (double) ' ');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, (double) 0.0f, (double) '4', (double) (short) 10, 100.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray12 = new double[] { 0.0f, 0.0f, 0.0f, 0.0d };
        double[] doubleArray19 = new double[] { (short) 0, 10L, 10, (-1), (short) 100, (byte) 10 };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer5.optimize((int) 'a', differentiableMultivariateVectorialFunction7, doubleArray12, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, 10.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, (double) (byte) 1, (double) (-1), (double) 100.0f, 0.0d);
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) 1, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker11);
        int int13 = levenbergMarquardtOptimizer5.getEvaluations();
        int int14 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) 100L, (double) (-1L), (double) (short) 10, 10.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10.0f, (double) (byte) 100, Double.NaN, (double) (byte) -1, (double) 10L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray11 = new double[] { '4', 10.0f, (byte) 1 };
        double[] doubleArray16 = new double[] { (-1.0d), 0, (short) 10, 100.0d };
        double[] doubleArray19 = new double[] { 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction7, doubleArray11, doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 10.0]");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction48 = null;
        double[] doubleArray49 = new double[] {};
        double[] doubleArray52 = new double[] { 0, 100L };
        double[] doubleArray53 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair54 = levenbergMarquardtOptimizer3.optimize(100, differentiableMultivariateVectorialFunction48, doubleArray49, doubleArray52, doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker15 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (short) -1, (double) (short) 1, 0.0d, 0.0d);
        int int22 = levenbergMarquardtOptimizer21.getEvaluations();
        double double23 = levenbergMarquardtOptimizer21.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, Double.NaN, (double) 100.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double32 = levenbergMarquardtOptimizer31.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer36 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker43 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer36.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer31.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker43);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer58 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker59 = levenbergMarquardtOptimizer58.getConvergenceChecker();
        levenbergMarquardtOptimizer52.setConvergenceChecker(vectorialPointValuePairConvergenceChecker59);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker61 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker62 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialPointValuePairConvergenceChecker62);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialPointValuePairConvergenceChecker62);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker62);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker43);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker59);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker61);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker62);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(Double.NaN, (double) (-1L), 0.0d, (double) '4', 100.0d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (short) 1, 1.0d, (double) (short) -1, (double) 0);
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        int int7 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction9 = null;
        double[] doubleArray11 = new double[] { (byte) -1 };
        double[] doubleArray15 = new double[] { (short) 10, 100L, (short) 1 };
        double[] doubleArray18 = new double[] { (-1.0d), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer5.optimize((-1), differentiableMultivariateVectorialFunction9, doubleArray11, doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0]");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        int int8 = levenbergMarquardtOptimizer3.getEvaluations();
        double double9 = levenbergMarquardtOptimizer3.getRMS();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, (double) 0L, 0.0d, (double) 10.0f, (double) 0L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100L, 1.0d, (double) 10, Double.NaN, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialPointValuePairConvergenceChecker12);
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray12 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray16 = new double[] { '#', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction10, doubleArray12, doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 10.0]");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (short) 10, (double) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) (byte) 10, (double) 1.0f, (double) '#', 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 100, (-1.0d), Double.NaN);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) 1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1L), (double) 'a');
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) ' ', (double) (-1.0f), (double) 0, (double) 10L, (double) 10L);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) 0.0f, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) 100, (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker4);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, 10.0d, 0.0d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker7 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(1.0d, (double) (short) 0, (double) 1, (double) (byte) 0, (double) 0L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, 0.0d, (double) 'a');
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, (double) (byte) -1, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray12 = new double[] { ' ', 0.0f, 100.0d };
        double[] doubleArray15 = new double[] { 100.0f, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer3.optimize((int) ' ', differentiableMultivariateVectorialFunction7, doubleArray8, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 100.0]");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = levenbergMarquardtOptimizer3.guessParametersErrors();
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
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        int int21 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) (byte) 0, 10.0d, (double) (byte) 1, (double) (byte) 0);
        double double28 = levenbergMarquardtOptimizer27.getChiSquare();
        int int29 = levenbergMarquardtOptimizer27.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker30 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker30);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker30);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100, Double.NaN, (double) 100.0f);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), 0.0d, (double) '4');
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = levenbergMarquardtOptimizer5.guessParametersErrors();
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
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', (double) 0.0f, (double) 10.0f);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double15 = levenbergMarquardtOptimizer14.getRMS();
        int int16 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker17 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker17);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker19 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double21 = levenbergMarquardtOptimizer20.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker22 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker22);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction26 = null;
        double[] doubleArray30 = new double[] { (byte) 0, (short) 10, 'a' };
        double[] doubleArray35 = new double[] { 100, 1L, (byte) 10, 1L };
        double[] doubleArray37 = new double[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair38 = levenbergMarquardtOptimizer3.optimize((int) (byte) -1, differentiableMultivariateVectorialFunction26, doubleArray30, doubleArray35, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker19);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker22);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0]");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 0.0f, (double) (short) 100, 0.0d, (double) 100L);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction7 = null;
        double[] doubleArray10 = new double[] { 0.0d, (short) 100 };
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer5.optimize((int) (short) 0, differentiableMultivariateVectorialFunction7, doubleArray10, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) '4', 0.0d, 10.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray8 = new double[] { 100, 10.0f };
        double[] doubleArray13 = new double[] { (short) -1, (-1L), (short) 10, ' ' };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer3.optimize((-1), differentiableMultivariateVectorialFunction5, doubleArray8, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) -1, (double) 0L, 1.0d);
        double double4 = levenbergMarquardtOptimizer3.getChiSquare();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray8 = new double[] { 1L };
        double[] doubleArray9 = new double[] {};
        double[] doubleArray15 = new double[] { (-1.0f), 1, (short) 1, (short) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer3.optimize((-1), differentiableMultivariateVectorialFunction6, doubleArray8, doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 1.0, 1.0, 100.0, 52.0]");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 100.0f, 100.0d, (double) 1L, (double) 'a', (double) 1.0f);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray15 = new double[] { (byte) 100, (byte) 0, 0.0f, 0, (-1.0d) };
        double[] doubleArray19 = new double[] { (-1), 10.0f, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer5.optimize(0, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 0.0, 0.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 0.0]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        int int6 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass10 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 0, Double.NaN);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 10, (double) (-1L), (double) 'a');
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray9 = new double[] { (-1.0f), (short) 100, 10.0d };
        double[] doubleArray10 = new double[] {};
        double[] doubleArray13 = new double[] { (-1.0d), 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer3.optimize((int) (short) 0, differentiableMultivariateVectorialFunction5, doubleArray9, doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0]");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray23 = new double[] { 0L, (byte) 0, 100L };
        double[] doubleArray26 = new double[] { 0.0f, (-1.0d) };
        double[] doubleArray31 = new double[] { (byte) -1, 1, 100L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer5.optimize((int) (short) 100, differentiableMultivariateVectorialFunction19, doubleArray23, doubleArray26, doubleArray31);
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 1.0, 100.0, 100.0]");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) (byte) -1, Double.NaN, (double) 0.0f, (double) 10.0f);
        int int6 = levenbergMarquardtOptimizer5.getEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getEvaluations();
        int int8 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer5.getRMS();
        double double10 = levenbergMarquardtOptimizer5.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray16 = new double[] { 0.0d, 1.0f, (-1.0d) };
        double[] doubleArray22 = new double[] { (byte) 100, 1L, 0.0d, (-1.0f), 1.0f };
        double[] doubleArray28 = new double[] { (byte) 1, (short) 0, 0.0d, 'a', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer5.optimize((-1), differentiableMultivariateVectorialFunction12, doubleArray16, doubleArray22, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, 0.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 0.0, 0.0, 97.0, -1.0]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(100.0d, (double) 10, (double) (-1.0f), 0.0d, (double) 10L);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (-1L), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer3.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray11 = new double[] { 0.0d, 1.0f };
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer3.optimize((int) (byte) 10, differentiableMultivariateVectorialFunction8, doubleArray11, doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker5 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker5);
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer3.getChiSquare();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer3.getStartPoint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) 10L, (double) 100.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) -1, 10.0d, (double) '#');
        double double27 = levenbergMarquardtOptimizer26.getRMS();
        int int28 = levenbergMarquardtOptimizer26.getJacobianEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker29 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker29);
        int int32 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 10, 0.0d, (double) (byte) 0, Double.NaN, (double) (-1.0f));
        int int6 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        int int7 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass8 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, 1.0d, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 10, (double) '4');
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray7 = new double[] { (short) 1 };
        double[] doubleArray11 = new double[] { (-1.0f), 'a', 0 };
        double[] doubleArray15 = new double[] { '4', (-1L), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer3.optimize(10, differentiableMultivariateVectorialFunction5, doubleArray7, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, -1.0, 32.0]");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), (double) '4', (double) 0.0f);
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 1, (double) (short) 0, (double) (-1));
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        double double5 = levenbergMarquardtOptimizer3.getRMS();
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray14 = new double[] { ' ', 100.0d, (-1) };
        double[] doubleArray15 = new double[] {};
        double[] doubleArray22 = new double[] { 100.0d, 0.0d, (short) 1, (byte) -1, (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer3.optimize((int) (short) -1, differentiableMultivariateVectorialFunction10, doubleArray14, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0, 1.0, -1.0, 100.0, 10.0]");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        int int21 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (-1.0d), (double) (short) -1, 10.0d, (double) 1.0f);
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) (-1), (double) 10);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1.0f), 100.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        int int5 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        int int7 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker8 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = vectorialPointValuePairConvergenceChecker8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 1, (double) 100.0f, Double.NaN, (double) (byte) 10, (double) 'a');
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1L, (double) 0L, (double) (short) -1, (double) (-1L), (double) 10L);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(0.0d, (double) 10, 0.0d, (double) '#', 1.0d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 0L, (double) 0L, (double) (short) 0, (double) 'a', (double) ' ');
        double double6 = levenbergMarquardtOptimizer5.getChiSquare();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, 1.0d, (double) (short) 1, (double) 1L, 0.0d);
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10L, (double) (byte) 100, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = levenbergMarquardtOptimizer3.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (-1L), (double) (-1.0f), (double) (byte) 0);
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray8 = new double[] { 1.0d };
        double[] doubleArray11 = new double[] { 100L, 0.0f };
        double[] doubleArray15 = new double[] { (short) 100, 10.0f, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer3.optimize(0, differentiableMultivariateVectorialFunction6, doubleArray8, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 52.0]");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((-1.0d), 0.0d, (double) 0.0f);
        int int4 = levenbergMarquardtOptimizer3.getMaxEvaluations();
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 100, (double) 100, (double) (byte) 10, (double) 10L, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray6 = levenbergMarquardtOptimizer5.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than, or equal to, the minimum (0): no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) (short) 0, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker4 = null;
        levenbergMarquardtOptimizer3.setConvergenceChecker(vectorialPointValuePairConvergenceChecker4);
        int int6 = levenbergMarquardtOptimizer3.getEvaluations();
        int int7 = levenbergMarquardtOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray8 = levenbergMarquardtOptimizer3.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, (double) 1L, (double) (short) 0);
        int int4 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        java.lang.Class<?> wildcardClass5 = levenbergMarquardtOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 'a', (double) (byte) 1, (double) (byte) 100, (double) 10L, (double) 0);
        int int6 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray9 = new double[] {};
        double[] doubleArray12 = new double[] { (short) 100, 10L };
        double[] doubleArray16 = new double[] { 0, 1.0f, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer5.optimize((int) (byte) 1, differentiableMultivariateVectorialFunction8, doubleArray9, doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0, 1.0]");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair> vectorialPointValuePairConvergenceChecker37 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass38 = levenbergMarquardtOptimizer3.getClass();
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
        org.junit.Assert.assertNotNull(vectorialPointValuePairConvergenceChecker37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 1, 1.0d, (double) (byte) 1, (double) (short) -1, (double) 10);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer((double) 10, (double) (byte) 100, (double) 10.0f);
        int int4 = levenbergMarquardtOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray8 = new double[] { 0L };
        double[] doubleArray9 = null;
        double[] doubleArray16 = new double[] { 1.0d, (byte) 0, 10.0f, (short) 100, (byte) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer3.optimize((int) (byte) 0, differentiableMultivariateVectorialFunction6, doubleArray8, doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0, 10.0, 100.0, -1.0, 0.0]");
    }
}

