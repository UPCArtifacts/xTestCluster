import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        double double2 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxIterations(100);
        double double10 = levenbergMarquardtOptimizer7.getChiSquare();
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) 2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxIterations(100);
        double double22 = levenbergMarquardtOptimizer19.getRMS();
        double double23 = levenbergMarquardtOptimizer19.getRMS();
        double double24 = levenbergMarquardtOptimizer19.getRMS();
        int int25 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        int int26 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker32);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setMaxIterations(100);
        double double37 = levenbergMarquardtOptimizer34.getRMS();
        levenbergMarquardtOptimizer34.setCostRelativeTolerance((double) (-1L));
        double double40 = levenbergMarquardtOptimizer34.getRMS();
        int int41 = levenbergMarquardtOptimizer34.getJacobianEvaluations();
        double double42 = levenbergMarquardtOptimizer34.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        int int50 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int51 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer52.setMaxIterations(100);
        double double55 = levenbergMarquardtOptimizer52.getRMS();
        levenbergMarquardtOptimizer52.setCostRelativeTolerance((double) (-1L));
        int int58 = levenbergMarquardtOptimizer52.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker59 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker59);
        int int61 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction62 = null;
        double[] doubleArray69 = new double[] { (byte) 1, (short) -1, 100.0d, '4', (-1), (-1.0d) };
        double[] doubleArray72 = new double[] { 0L, 10.0f };
        double[] doubleArray73 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair74 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction62, doubleArray69, doubleArray72, doubleArray73);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, -1.0, 100.0, 52.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass11 = vectorialConvergenceChecker10.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setMaxIterations(100);
        double double7 = levenbergMarquardtOptimizer4.getRMS();
        double double8 = levenbergMarquardtOptimizer4.getRMS();
        double double9 = levenbergMarquardtOptimizer4.getRMS();
        int int10 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer4.getJacobianEvaluations();
        levenbergMarquardtOptimizer4.setParRelativeTolerance(0.0d);
        double double14 = levenbergMarquardtOptimizer4.getChiSquare();
        levenbergMarquardtOptimizer4.setCostRelativeTolerance((double) (-1.0f));
        int int17 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer18.setMaxIterations(100);
        double double21 = levenbergMarquardtOptimizer18.getRMS();
        levenbergMarquardtOptimizer18.setCostRelativeTolerance((double) (-1L));
        int int24 = levenbergMarquardtOptimizer18.getMaxEvaluations();
        int int25 = levenbergMarquardtOptimizer18.getIterations();
        int int26 = levenbergMarquardtOptimizer18.getJacobianEvaluations();
        levenbergMarquardtOptimizer18.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer18.setOrthoTolerance((double) (short) 0);
        int int31 = levenbergMarquardtOptimizer18.getIterations();
        levenbergMarquardtOptimizer18.setInitialStepBoundFactor((double) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setMaxIterations(100);
        double double37 = levenbergMarquardtOptimizer34.getRMS();
        double double38 = levenbergMarquardtOptimizer34.getRMS();
        double double39 = levenbergMarquardtOptimizer34.getRMS();
        int int40 = levenbergMarquardtOptimizer34.getMaxEvaluations();
        int int41 = levenbergMarquardtOptimizer34.getJacobianEvaluations();
        levenbergMarquardtOptimizer34.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer44.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker47 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialConvergenceChecker47);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer49 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer49.setMaxIterations(100);
        double double52 = levenbergMarquardtOptimizer49.getRMS();
        levenbergMarquardtOptimizer49.setCostRelativeTolerance((double) (-1L));
        double double55 = levenbergMarquardtOptimizer49.getRMS();
        int int56 = levenbergMarquardtOptimizer49.getJacobianEvaluations();
        double double57 = levenbergMarquardtOptimizer49.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer49.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker47);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker58);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxIterations(100);
        levenbergMarquardtOptimizer5.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxIterations(100);
        double double14 = levenbergMarquardtOptimizer11.getRMS();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (-1L));
        double double17 = levenbergMarquardtOptimizer11.getRMS();
        int int18 = levenbergMarquardtOptimizer11.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer25.setMaxIterations(100);
        double double28 = levenbergMarquardtOptimizer25.getRMS();
        double double29 = levenbergMarquardtOptimizer25.getRMS();
        double double30 = levenbergMarquardtOptimizer25.getRMS();
        int int31 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer25.getJacobianEvaluations();
        levenbergMarquardtOptimizer25.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker38);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setMaxIterations(100);
        double double43 = levenbergMarquardtOptimizer40.getRMS();
        levenbergMarquardtOptimizer40.setCostRelativeTolerance((double) (-1L));
        double double46 = levenbergMarquardtOptimizer40.getRMS();
        int int47 = levenbergMarquardtOptimizer40.getJacobianEvaluations();
        double double48 = levenbergMarquardtOptimizer40.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker49);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer52.setMaxIterations(100);
        double double55 = levenbergMarquardtOptimizer52.getRMS();
        levenbergMarquardtOptimizer52.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker66 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker58);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker66);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) ' ');
        int int13 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer10.getMaxIterations();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        int int24 = levenbergMarquardtOptimizer0.getIterations();
        int int25 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxIterations(100);
        double double19 = levenbergMarquardtOptimizer16.getRMS();
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) (-1L));
        double double22 = levenbergMarquardtOptimizer16.getRMS();
        levenbergMarquardtOptimizer16.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer16.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setMaxIterations(100);
        double double32 = levenbergMarquardtOptimizer29.getRMS();
        double double33 = levenbergMarquardtOptimizer29.getRMS();
        int int34 = levenbergMarquardtOptimizer29.getMaxIterations();
        int int35 = levenbergMarquardtOptimizer29.getMaxIterations();
        double double36 = levenbergMarquardtOptimizer29.getChiSquare();
        levenbergMarquardtOptimizer29.setInitialStepBoundFactor((double) 100.0f);
        int int39 = levenbergMarquardtOptimizer29.getMaxEvaluations();
        levenbergMarquardtOptimizer29.setInitialStepBoundFactor((double) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker42);
        double double45 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction12 = null;
        double[] doubleArray19 = new double[] { 1L, '#', 97, 'a', 100, 35 };
        double[] doubleArray24 = new double[] { (short) 0, 1.0f, 2147483647, 35 };
        double[] doubleArray29 = new double[] { (short) 1, (byte) 10, 1L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction12, doubleArray19, doubleArray24, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 35.0, 97.0, 97.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0, 2.147483647E9, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0, 1.0, 0.0]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getChiSquare();
        levenbergMarquardtOptimizer6.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        levenbergMarquardtOptimizer12.setMaxIterations((int) (short) 10);
        int int17 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) 10.0f);
        double double20 = levenbergMarquardtOptimizer12.getRMS();
        int int21 = levenbergMarquardtOptimizer12.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxIterations(100);
        double double25 = levenbergMarquardtOptimizer22.getRMS();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (-1L));
        int int28 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        int int29 = levenbergMarquardtOptimizer22.getIterations();
        int int30 = levenbergMarquardtOptimizer22.getJacobianEvaluations();
        levenbergMarquardtOptimizer22.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (short) -1);
        int int35 = levenbergMarquardtOptimizer22.getJacobianEvaluations();
        double double36 = levenbergMarquardtOptimizer22.getRMS();
        int int37 = levenbergMarquardtOptimizer22.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker38);
        int int41 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker21);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setMaxIterations(100);
        double double18 = levenbergMarquardtOptimizer15.getChiSquare();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer15.setCostRelativeTolerance((double) (short) -1);
        int int25 = levenbergMarquardtOptimizer15.getIterations();
        int int26 = levenbergMarquardtOptimizer15.getIterations();
        int int27 = levenbergMarquardtOptimizer15.getMaxIterations();
        int int28 = levenbergMarquardtOptimizer15.getEvaluations();
        int int29 = levenbergMarquardtOptimizer15.getMaxIterations();
        double double30 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker31);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker31);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setParRelativeTolerance((double) ' ');
        int int19 = levenbergMarquardtOptimizer16.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker20);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        int int23 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int24 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double25 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1000 + "'", int23 == 1000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxIterations(100);
        levenbergMarquardtOptimizer8.setMaxIterations((int) (short) 10);
        int int13 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) 10.0f);
        double double16 = levenbergMarquardtOptimizer8.getRMS();
        double double17 = levenbergMarquardtOptimizer8.getChiSquare();
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer8.setMaxEvaluations((int) (byte) 0);
        int int22 = levenbergMarquardtOptimizer8.getMaxIterations();
        levenbergMarquardtOptimizer8.setOrthoTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker25);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction16 = null;
        double[] doubleArray21 = new double[] { '#', 10.0f, 10L, 1 };
        double[] doubleArray26 = new double[] { 1.0d, (-1L), 100.0f, ' ' };
        double[] doubleArray28 = new double[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction16, doubleArray21, doubleArray26, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 10.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, -1.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0]");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getChiSquare();
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) (-1));
        double double15 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        levenbergMarquardtOptimizer9.setMaxIterations((int) (short) 10);
        int int14 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxIterations(100);
        double double20 = levenbergMarquardtOptimizer17.getRMS();
        double double21 = levenbergMarquardtOptimizer17.getRMS();
        double double22 = levenbergMarquardtOptimizer17.getRMS();
        int int23 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        int int24 = levenbergMarquardtOptimizer17.getJacobianEvaluations();
        levenbergMarquardtOptimizer17.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker30);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setMaxIterations(100);
        double double35 = levenbergMarquardtOptimizer32.getRMS();
        levenbergMarquardtOptimizer32.setCostRelativeTolerance((double) (-1L));
        double double38 = levenbergMarquardtOptimizer32.getRMS();
        int int39 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        double double40 = levenbergMarquardtOptimizer32.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker41 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker41);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker41);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer44.setMaxIterations(100);
        double double47 = levenbergMarquardtOptimizer44.getRMS();
        levenbergMarquardtOptimizer44.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker50 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker50);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker50);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker41);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker50);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) ' ');
        int int13 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxIterations(100);
        levenbergMarquardtOptimizer16.setMaxIterations((int) (short) 10);
        int int21 = levenbergMarquardtOptimizer16.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        int int24 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setMaxIterations(100);
        double double18 = levenbergMarquardtOptimizer15.getChiSquare();
        double double19 = levenbergMarquardtOptimizer15.getChiSquare();
        int int20 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer15.setMaxEvaluations((int) (short) 1);
        levenbergMarquardtOptimizer15.setCostRelativeTolerance((double) (-1));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxIterations(100);
        levenbergMarquardtOptimizer28.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer28.setParRelativeTolerance((double) (short) -1);
        int int35 = levenbergMarquardtOptimizer28.getMaxEvaluations();
        levenbergMarquardtOptimizer28.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer28.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer28.setOrthoTolerance(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker42);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) ' ');
        int int13 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer10.getMaxIterations();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        int int24 = levenbergMarquardtOptimizer0.getIterations();
        int int25 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getRMS();
        levenbergMarquardtOptimizer6.setCostRelativeTolerance((double) (-1L));
        double double12 = levenbergMarquardtOptimizer6.getRMS();
        int int13 = levenbergMarquardtOptimizer6.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxIterations(100);
        double double23 = levenbergMarquardtOptimizer20.getRMS();
        double double24 = levenbergMarquardtOptimizer20.getRMS();
        double double25 = levenbergMarquardtOptimizer20.getRMS();
        int int26 = levenbergMarquardtOptimizer20.getMaxEvaluations();
        int int27 = levenbergMarquardtOptimizer20.getJacobianEvaluations();
        levenbergMarquardtOptimizer20.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer30.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker33 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker33);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setMaxIterations(100);
        double double38 = levenbergMarquardtOptimizer35.getRMS();
        levenbergMarquardtOptimizer35.setCostRelativeTolerance((double) (-1L));
        double double41 = levenbergMarquardtOptimizer35.getRMS();
        int int42 = levenbergMarquardtOptimizer35.getJacobianEvaluations();
        double double43 = levenbergMarquardtOptimizer35.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker44 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker44);
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialConvergenceChecker44);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer47 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer47.setMaxIterations(100);
        double double50 = levenbergMarquardtOptimizer47.getRMS();
        levenbergMarquardtOptimizer47.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker53 = levenbergMarquardtOptimizer47.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialConvergenceChecker53);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker53);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer56 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer56.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker59 = null;
        levenbergMarquardtOptimizer56.setConvergenceChecker(vectorialConvergenceChecker59);
        int int61 = levenbergMarquardtOptimizer56.getJacobianEvaluations();
        levenbergMarquardtOptimizer56.setCostRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer56.setCostRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer56.setOrthoTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer68 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer68.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker71 = levenbergMarquardtOptimizer68.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer72 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer72.setParRelativeTolerance((double) ' ');
        int int75 = levenbergMarquardtOptimizer72.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker76 = levenbergMarquardtOptimizer72.getConvergenceChecker();
        levenbergMarquardtOptimizer68.setConvergenceChecker(vectorialConvergenceChecker76);
        levenbergMarquardtOptimizer56.setConvergenceChecker(vectorialConvergenceChecker76);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker76);
        double double80 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker33);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker44);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker53);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker76);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getRMS();
        double double10 = levenbergMarquardtOptimizer6.getRMS();
        double double11 = levenbergMarquardtOptimizer6.getRMS();
        double double12 = levenbergMarquardtOptimizer6.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1000 + "'", int16 == 1000);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray12 = new double[] { 100.0d, (byte) 1, (byte) 1 };
        double[] doubleArray18 = new double[] { 35, (byte) 10, 10.0d, 10L, 35 };
        double[] doubleArray24 = new double[] { 97, 0.0f, (-1.0f), 1000, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray12, doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 5");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, 10.0, 10.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 0.0, -1.0, 1000.0, 1.0]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getRMS();
        double double10 = levenbergMarquardtOptimizer6.getRMS();
        double double11 = levenbergMarquardtOptimizer6.getRMS();
        double double12 = levenbergMarquardtOptimizer6.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        levenbergMarquardtOptimizer10.setMaxIterations((int) (short) 10);
        int int15 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        int int22 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int23 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double24 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray15 = new double[] { 1L, 100L, 100 };
        double[] doubleArray18 = new double[] { 10.0f, 1.0d };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray15, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getChiSquare();
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) 2147483647);
        double double17 = levenbergMarquardtOptimizer9.getChiSquare();
        double double18 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxIterations(100);
        levenbergMarquardtOptimizer19.setMaxIterations((int) (short) 10);
        int int24 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker27);
        int int30 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxIterations(100);
        double double10 = levenbergMarquardtOptimizer7.getChiSquare();
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) (-1));
        int int13 = levenbergMarquardtOptimizer7.getEvaluations();
        int int14 = levenbergMarquardtOptimizer7.getMaxIterations();
        double double15 = levenbergMarquardtOptimizer7.getRMS();
        int int16 = levenbergMarquardtOptimizer7.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxIterations(100);
        double double17 = levenbergMarquardtOptimizer14.getRMS();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance((double) (-1L));
        int int20 = levenbergMarquardtOptimizer14.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer14.getIterations();
        int int22 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        levenbergMarquardtOptimizer14.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer14.setOrthoTolerance((double) (short) 0);
        int int27 = levenbergMarquardtOptimizer14.getIterations();
        levenbergMarquardtOptimizer14.setInitialStepBoundFactor((double) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer30.setMaxIterations(100);
        double double33 = levenbergMarquardtOptimizer30.getRMS();
        double double34 = levenbergMarquardtOptimizer30.getRMS();
        double double35 = levenbergMarquardtOptimizer30.getRMS();
        int int36 = levenbergMarquardtOptimizer30.getMaxEvaluations();
        int int37 = levenbergMarquardtOptimizer30.getJacobianEvaluations();
        levenbergMarquardtOptimizer30.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker43);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer45.setMaxIterations(100);
        double double48 = levenbergMarquardtOptimizer45.getRMS();
        levenbergMarquardtOptimizer45.setCostRelativeTolerance((double) (-1L));
        double double51 = levenbergMarquardtOptimizer45.getRMS();
        int int52 = levenbergMarquardtOptimizer45.getJacobianEvaluations();
        double double53 = levenbergMarquardtOptimizer45.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker54 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker54);
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker54);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker54);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction58 = null;
        double[] doubleArray61 = new double[] { 1, (byte) 10 };
        double[] doubleArray64 = new double[] { (byte) 100, (short) 1 };
        double[] doubleArray70 = new double[] { (short) 100, '#', (short) 1, 1.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair71 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction58, doubleArray61, doubleArray64, doubleArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker54);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0, 35.0, 1.0, 1.0, 35.0]");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 32);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 97);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(32);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxIterations(100);
        double double22 = levenbergMarquardtOptimizer19.getRMS();
        double double23 = levenbergMarquardtOptimizer19.getRMS();
        double double24 = levenbergMarquardtOptimizer19.getRMS();
        int int25 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        int int26 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        levenbergMarquardtOptimizer19.setParRelativeTolerance(0.0d);
        double double29 = levenbergMarquardtOptimizer19.getChiSquare();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer19.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker34 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialConvergenceChecker34);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker34);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker34);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        double double2 = levenbergMarquardtOptimizer0.getRMS();
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getRMS();
        double double10 = levenbergMarquardtOptimizer6.getRMS();
        double double11 = levenbergMarquardtOptimizer6.getRMS();
        double double12 = levenbergMarquardtOptimizer6.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(vectorialConvergenceChecker20);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (-1L));
        int int18 = levenbergMarquardtOptimizer12.getEvaluations();
        levenbergMarquardtOptimizer12.setMaxIterations((-1));
        int int21 = levenbergMarquardtOptimizer12.getEvaluations();
        levenbergMarquardtOptimizer12.setMaxIterations((int) (short) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer24.setMaxIterations(100);
        double double27 = levenbergMarquardtOptimizer24.getChiSquare();
        double double28 = levenbergMarquardtOptimizer24.getChiSquare();
        int int29 = levenbergMarquardtOptimizer24.getMaxEvaluations();
        int int30 = levenbergMarquardtOptimizer24.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker31);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker31);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker31);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer3.setMaxIterations(100);
        double double6 = levenbergMarquardtOptimizer3.getRMS();
        double double7 = levenbergMarquardtOptimizer3.getRMS();
        double double8 = levenbergMarquardtOptimizer3.getRMS();
        int int9 = levenbergMarquardtOptimizer3.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        levenbergMarquardtOptimizer3.setParRelativeTolerance(0.0d);
        double double13 = levenbergMarquardtOptimizer3.getChiSquare();
        levenbergMarquardtOptimizer3.setCostRelativeTolerance((double) (-1.0f));
        int int16 = levenbergMarquardtOptimizer3.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer3.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (-1L));
        double double18 = levenbergMarquardtOptimizer12.getRMS();
        int int19 = levenbergMarquardtOptimizer12.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        int int25 = levenbergMarquardtOptimizer0.getEvaluations();
        double double26 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setMaxIterations(100);
        double double30 = levenbergMarquardtOptimizer27.getRMS();
        double double31 = levenbergMarquardtOptimizer27.getRMS();
        double double32 = levenbergMarquardtOptimizer27.getRMS();
        int int33 = levenbergMarquardtOptimizer27.getMaxEvaluations();
        int int34 = levenbergMarquardtOptimizer27.getJacobianEvaluations();
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker40);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer42.setMaxIterations(100);
        double double45 = levenbergMarquardtOptimizer42.getRMS();
        levenbergMarquardtOptimizer42.setCostRelativeTolerance((double) (-1L));
        double double48 = levenbergMarquardtOptimizer42.getRMS();
        int int49 = levenbergMarquardtOptimizer42.getJacobianEvaluations();
        double double50 = levenbergMarquardtOptimizer42.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker51 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker51);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker53 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker53);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer55 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer55.setMaxIterations(100);
        double double58 = levenbergMarquardtOptimizer55.getChiSquare();
        levenbergMarquardtOptimizer55.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer55.setOrthoTolerance((double) 2147483647);
        double double63 = levenbergMarquardtOptimizer55.getChiSquare();
        double double64 = levenbergMarquardtOptimizer55.getChiSquare();
        levenbergMarquardtOptimizer55.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer67 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer67.setMaxIterations(100);
        double double70 = levenbergMarquardtOptimizer67.getRMS();
        levenbergMarquardtOptimizer67.setCostRelativeTolerance((double) (-1L));
        int int73 = levenbergMarquardtOptimizer67.getEvaluations();
        levenbergMarquardtOptimizer67.setMaxIterations((-1));
        int int76 = levenbergMarquardtOptimizer67.getEvaluations();
        levenbergMarquardtOptimizer67.setMaxIterations((int) (short) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer79 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer79.setMaxIterations(100);
        double double82 = levenbergMarquardtOptimizer79.getChiSquare();
        double double83 = levenbergMarquardtOptimizer79.getChiSquare();
        int int84 = levenbergMarquardtOptimizer79.getMaxEvaluations();
        int int85 = levenbergMarquardtOptimizer79.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker86 = levenbergMarquardtOptimizer79.getConvergenceChecker();
        levenbergMarquardtOptimizer67.setConvergenceChecker(vectorialConvergenceChecker86);
        levenbergMarquardtOptimizer55.setConvergenceChecker(vectorialConvergenceChecker86);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker86);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker40);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker51);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker53);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2147483647 + "'", int84 == 2147483647);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker86);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        java.lang.Class<?> wildcardClass20 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setMaxIterations(100);
        double double7 = levenbergMarquardtOptimizer4.getRMS();
        double double8 = levenbergMarquardtOptimizer4.getRMS();
        double double9 = levenbergMarquardtOptimizer4.getRMS();
        int int10 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer4.getJacobianEvaluations();
        levenbergMarquardtOptimizer4.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker17);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxIterations(100);
        double double22 = levenbergMarquardtOptimizer19.getRMS();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) (-1L));
        double double25 = levenbergMarquardtOptimizer19.getRMS();
        int int26 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        double double27 = levenbergMarquardtOptimizer19.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker28);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker28);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer31.setMaxIterations(100);
        double double34 = levenbergMarquardtOptimizer31.getRMS();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker37 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker37);
        int int39 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int40 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction41 = null;
        double[] doubleArray43 = new double[] { 1.0d };
        double[] doubleArray48 = new double[] { (short) -1, 1, 10L, 52 };
        double[] doubleArray52 = new double[] { 10.0d, (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair53 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction41, doubleArray43, doubleArray48, doubleArray52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker28);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1000 + "'", int39 == 1000);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1000 + "'", int40 == 1000);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 1.0, 10.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 0.0, 100.0]");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getRMS();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (-1L));
        double double15 = levenbergMarquardtOptimizer9.getRMS();
        int int16 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        double double17 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) ' ');
        int int22 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        int int28 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setMaxIterations(100);
        double double32 = levenbergMarquardtOptimizer29.getChiSquare();
        levenbergMarquardtOptimizer29.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer29.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer29.setCostRelativeTolerance((double) (short) -1);
        double double39 = levenbergMarquardtOptimizer29.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker40);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double43 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker40);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setMaxIterations(100);
        int int18 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        levenbergMarquardtOptimizer15.setMaxIterations(0);
        int int21 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setMaxEvaluations(1);
        int int25 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        int int26 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker27);
        java.lang.Class<?> wildcardClass29 = vectorialConvergenceChecker27.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getRMS();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (-1L));
        int int15 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        levenbergMarquardtOptimizer9.setParRelativeTolerance((double) 100.0f);
        int int18 = levenbergMarquardtOptimizer9.getEvaluations();
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxIterations(100);
        double double24 = levenbergMarquardtOptimizer21.getRMS();
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) (-1L));
        double double27 = levenbergMarquardtOptimizer21.getRMS();
        int int28 = levenbergMarquardtOptimizer21.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setInitialStepBoundFactor((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 97);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxIterations(100);
        double double11 = levenbergMarquardtOptimizer8.getRMS();
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) (-1L));
        int int14 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer8.getIterations();
        int int16 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        levenbergMarquardtOptimizer8.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer8.setOrthoTolerance((double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxIterations(100);
        double double24 = levenbergMarquardtOptimizer21.getRMS();
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) (-1L));
        double double27 = levenbergMarquardtOptimizer21.getRMS();
        int int28 = levenbergMarquardtOptimizer21.getJacobianEvaluations();
        double double29 = levenbergMarquardtOptimizer21.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer31.setParRelativeTolerance((double) ' ');
        int int34 = levenbergMarquardtOptimizer31.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker35);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction39 = null;
        double[] doubleArray41 = new double[] { 100L };
        double[] doubleArray42 = null;
        double[] doubleArray49 = new double[] { 10L, 0, (short) -1, (byte) -1, 0.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair50 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction39, doubleArray41, doubleArray42, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker35);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 0.0, -1.0, -1.0, 0.0, -1.0]");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(32);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction18 = null;
        double[] doubleArray20 = new double[] { (short) -1 };
        double[] doubleArray22 = new double[] { 0.0d };
        double[] doubleArray25 = new double[] { (-1), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction18, doubleArray20, doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0]");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxIterations(100);
        double double23 = levenbergMarquardtOptimizer20.getRMS();
        double double24 = levenbergMarquardtOptimizer20.getRMS();
        int int25 = levenbergMarquardtOptimizer20.getMaxIterations();
        int int26 = levenbergMarquardtOptimizer20.getMaxIterations();
        double double27 = levenbergMarquardtOptimizer20.getChiSquare();
        levenbergMarquardtOptimizer20.setInitialStepBoundFactor((double) 100.0f);
        int int30 = levenbergMarquardtOptimizer20.getJacobianEvaluations();
        int int31 = levenbergMarquardtOptimizer20.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setMaxIterations(100);
        levenbergMarquardtOptimizer32.setMaxIterations((int) (short) 10);
        int int37 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        levenbergMarquardtOptimizer32.setParRelativeTolerance((double) 10.0f);
        double double40 = levenbergMarquardtOptimizer32.getRMS();
        int int41 = levenbergMarquardtOptimizer32.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer42.setMaxIterations(100);
        double double45 = levenbergMarquardtOptimizer42.getRMS();
        levenbergMarquardtOptimizer42.setCostRelativeTolerance((double) (-1L));
        int int48 = levenbergMarquardtOptimizer42.getMaxEvaluations();
        int int49 = levenbergMarquardtOptimizer42.getIterations();
        int int50 = levenbergMarquardtOptimizer42.getJacobianEvaluations();
        levenbergMarquardtOptimizer42.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer42.setCostRelativeTolerance((double) (short) -1);
        int int55 = levenbergMarquardtOptimizer42.getJacobianEvaluations();
        double double56 = levenbergMarquardtOptimizer42.getRMS();
        int int57 = levenbergMarquardtOptimizer42.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray62 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker58);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxIterations(100);
        levenbergMarquardtOptimizer5.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxIterations(100);
        double double14 = levenbergMarquardtOptimizer11.getRMS();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (-1L));
        double double17 = levenbergMarquardtOptimizer11.getRMS();
        int int18 = levenbergMarquardtOptimizer11.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer25.setMaxIterations(100);
        double double28 = levenbergMarquardtOptimizer25.getRMS();
        double double29 = levenbergMarquardtOptimizer25.getRMS();
        double double30 = levenbergMarquardtOptimizer25.getRMS();
        int int31 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer25.getJacobianEvaluations();
        levenbergMarquardtOptimizer25.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker38);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setMaxIterations(100);
        double double43 = levenbergMarquardtOptimizer40.getRMS();
        levenbergMarquardtOptimizer40.setCostRelativeTolerance((double) (-1L));
        double double46 = levenbergMarquardtOptimizer40.getRMS();
        int int47 = levenbergMarquardtOptimizer40.getJacobianEvaluations();
        double double48 = levenbergMarquardtOptimizer40.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker49);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer52.setMaxIterations(100);
        double double55 = levenbergMarquardtOptimizer52.getRMS();
        levenbergMarquardtOptimizer52.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        double double64 = levenbergMarquardtOptimizer0.getChiSquare();
        double double65 = levenbergMarquardtOptimizer0.getRMS();
        int int66 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker58);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double6 = levenbergMarquardtOptimizer5.getRMS();
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor((double) (byte) -1);
        int int9 = levenbergMarquardtOptimizer5.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer5.getIterations();
        levenbergMarquardtOptimizer5.setMaxEvaluations(2147483647);
        double double13 = levenbergMarquardtOptimizer5.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(32);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setMaxIterations(100);
        double double16 = levenbergMarquardtOptimizer13.getRMS();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (-1L));
        int int19 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) 100.0f);
        int int22 = levenbergMarquardtOptimizer13.getEvaluations();
        levenbergMarquardtOptimizer13.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        double double27 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker25);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray14 = new double[] { 0L, (byte) 10 };
        double[] doubleArray16 = new double[] { 97 };
        double[] doubleArray18 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray14, doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 2 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0]");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer5.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        levenbergMarquardtOptimizer10.setMaxIterations((int) (short) 10);
        int int15 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxIterations(100);
        double double19 = levenbergMarquardtOptimizer16.getRMS();
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) (-1L));
        double double22 = levenbergMarquardtOptimizer16.getRMS();
        int int23 = levenbergMarquardtOptimizer16.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker24);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer30.setMaxIterations(100);
        double double33 = levenbergMarquardtOptimizer30.getRMS();
        double double34 = levenbergMarquardtOptimizer30.getRMS();
        double double35 = levenbergMarquardtOptimizer30.getRMS();
        int int36 = levenbergMarquardtOptimizer30.getMaxEvaluations();
        int int37 = levenbergMarquardtOptimizer30.getJacobianEvaluations();
        levenbergMarquardtOptimizer30.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker43);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer45.setMaxIterations(100);
        double double48 = levenbergMarquardtOptimizer45.getRMS();
        levenbergMarquardtOptimizer45.setCostRelativeTolerance((double) (-1L));
        double double51 = levenbergMarquardtOptimizer45.getRMS();
        int int52 = levenbergMarquardtOptimizer45.getJacobianEvaluations();
        double double53 = levenbergMarquardtOptimizer45.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker54 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker54);
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker54);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer57 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer57.setMaxIterations(100);
        double double60 = levenbergMarquardtOptimizer57.getRMS();
        levenbergMarquardtOptimizer57.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker63 = levenbergMarquardtOptimizer57.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker63);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker63);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker63);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer67 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer67.setMaxIterations(100);
        double double70 = levenbergMarquardtOptimizer67.getChiSquare();
        levenbergMarquardtOptimizer67.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer67.setOrthoTolerance((double) 2147483647);
        double double75 = levenbergMarquardtOptimizer67.getChiSquare();
        levenbergMarquardtOptimizer67.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer67.setOrthoTolerance((double) (byte) -1);
        double double80 = levenbergMarquardtOptimizer67.getChiSquare();
        double double81 = levenbergMarquardtOptimizer67.getRMS();
        levenbergMarquardtOptimizer67.setOrthoTolerance(0.0d);
        int int84 = levenbergMarquardtOptimizer67.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker85 = levenbergMarquardtOptimizer67.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker85);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker85);
        int int88 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker54);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker63);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxIterations(100);
        double double20 = levenbergMarquardtOptimizer17.getChiSquare();
        levenbergMarquardtOptimizer17.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer17.setOrthoTolerance((double) 2147483647);
        double double25 = levenbergMarquardtOptimizer17.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker26);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker26);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        java.lang.Class<?> wildcardClass18 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        double double13 = levenbergMarquardtOptimizer10.getRMS();
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) (-1L));
        int int16 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer10.getIterations();
        int int18 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        levenbergMarquardtOptimizer10.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) (short) -1);
        int int23 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        double double24 = levenbergMarquardtOptimizer10.getRMS();
        int int25 = levenbergMarquardtOptimizer10.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker26);
        int int28 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer18.setMaxIterations(100);
        double double21 = levenbergMarquardtOptimizer18.getRMS();
        double double22 = levenbergMarquardtOptimizer18.getRMS();
        int int23 = levenbergMarquardtOptimizer18.getMaxIterations();
        int int24 = levenbergMarquardtOptimizer18.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer25.setMaxIterations(100);
        int int28 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        levenbergMarquardtOptimizer25.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialConvergenceChecker31);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker31);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker31);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass14 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxIterations(100);
        double double19 = levenbergMarquardtOptimizer16.getRMS();
        double double20 = levenbergMarquardtOptimizer16.getRMS();
        double double21 = levenbergMarquardtOptimizer16.getRMS();
        int int22 = levenbergMarquardtOptimizer16.getMaxEvaluations();
        int int23 = levenbergMarquardtOptimizer16.getJacobianEvaluations();
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer16.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10L);
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxIterations(100);
        int int20 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        levenbergMarquardtOptimizer17.setMaxIterations(0);
        int int23 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setMaxEvaluations(1);
        int int27 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        double double28 = levenbergMarquardtOptimizer17.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setMaxIterations(100);
        double double7 = levenbergMarquardtOptimizer4.getRMS();
        double double8 = levenbergMarquardtOptimizer4.getRMS();
        double double9 = levenbergMarquardtOptimizer4.getRMS();
        int int10 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer4.getJacobianEvaluations();
        levenbergMarquardtOptimizer4.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker17);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxIterations(100);
        double double22 = levenbergMarquardtOptimizer19.getRMS();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) (-1L));
        double double25 = levenbergMarquardtOptimizer19.getRMS();
        int int26 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        double double27 = levenbergMarquardtOptimizer19.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker28);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker28);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer31.setMaxIterations(100);
        double double34 = levenbergMarquardtOptimizer31.getRMS();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker37 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker37);
        java.lang.Class<?> wildcardClass39 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker28);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setMaxIterations(100);
        double double7 = levenbergMarquardtOptimizer4.getRMS();
        double double8 = levenbergMarquardtOptimizer4.getRMS();
        double double9 = levenbergMarquardtOptimizer4.getRMS();
        int int10 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer4.getJacobianEvaluations();
        levenbergMarquardtOptimizer4.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker17);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxIterations(100);
        double double22 = levenbergMarquardtOptimizer19.getRMS();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) (-1L));
        double double25 = levenbergMarquardtOptimizer19.getRMS();
        int int26 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        double double27 = levenbergMarquardtOptimizer19.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker28);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker28);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        int int33 = levenbergMarquardtOptimizer0.getEvaluations();
        int int34 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxIterations(100);
        levenbergMarquardtOptimizer5.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxIterations(100);
        double double14 = levenbergMarquardtOptimizer11.getRMS();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (-1L));
        double double17 = levenbergMarquardtOptimizer11.getRMS();
        int int18 = levenbergMarquardtOptimizer11.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer25.setMaxIterations(100);
        double double28 = levenbergMarquardtOptimizer25.getRMS();
        double double29 = levenbergMarquardtOptimizer25.getRMS();
        double double30 = levenbergMarquardtOptimizer25.getRMS();
        int int31 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer25.getJacobianEvaluations();
        levenbergMarquardtOptimizer25.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker38);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setMaxIterations(100);
        double double43 = levenbergMarquardtOptimizer40.getRMS();
        levenbergMarquardtOptimizer40.setCostRelativeTolerance((double) (-1L));
        double double46 = levenbergMarquardtOptimizer40.getRMS();
        int int47 = levenbergMarquardtOptimizer40.getJacobianEvaluations();
        double double48 = levenbergMarquardtOptimizer40.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker49);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer52.setMaxIterations(100);
        double double55 = levenbergMarquardtOptimizer52.getRMS();
        levenbergMarquardtOptimizer52.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int64 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker58);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setMaxIterations(100);
        double double18 = levenbergMarquardtOptimizer15.getRMS();
        levenbergMarquardtOptimizer15.setCostRelativeTolerance((double) (-1L));
        int int21 = levenbergMarquardtOptimizer15.getEvaluations();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) 0.0f);
        int int24 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        int int25 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        int int26 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        levenbergMarquardtOptimizer15.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer15.setParRelativeTolerance((double) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker31);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker31);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setMaxIterations(100);
        double double16 = levenbergMarquardtOptimizer13.getChiSquare();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) 2147483647);
        double double21 = levenbergMarquardtOptimizer13.getChiSquare();
        double double22 = levenbergMarquardtOptimizer13.getChiSquare();
        double double23 = levenbergMarquardtOptimizer13.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction28 = null;
        double[] doubleArray34 = new double[] { 52, 100.0f, 1.0d, (byte) 0, 1 };
        double[] doubleArray38 = new double[] { ' ', 100.0d, (short) -1 };
        double[] doubleArray41 = new double[] { 1000, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair42 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction28, doubleArray34, doubleArray38, doubleArray41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 5 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[52.0, 100.0, 1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1000.0, 0.0]");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxIterations(100);
        double double14 = levenbergMarquardtOptimizer11.getRMS();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (-1L));
        double double17 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer18.setParRelativeTolerance((double) ' ');
        int int21 = levenbergMarquardtOptimizer18.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        int int23 = levenbergMarquardtOptimizer18.getJacobianEvaluations();
        levenbergMarquardtOptimizer18.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer18.setMaxIterations(10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        levenbergMarquardtOptimizer9.setMaxIterations((int) (short) 10);
        int int14 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction5 = null;
        double[] doubleArray7 = new double[] { (short) 0 };
        double[] doubleArray9 = new double[] { 1 };
        double[] doubleArray15 = new double[] { (byte) 100, 0, '4', 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction5, doubleArray7, doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 0.0, 52.0, 10.0, 100.0]");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getChiSquare();
        levenbergMarquardtOptimizer6.setOrthoTolerance((double) (-1));
        double double12 = levenbergMarquardtOptimizer6.getRMS();
        double double13 = levenbergMarquardtOptimizer6.getChiSquare();
        int int14 = levenbergMarquardtOptimizer6.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) ' ');
        int int13 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer10.getMaxIterations();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        int int24 = levenbergMarquardtOptimizer0.getIterations();
        double double25 = levenbergMarquardtOptimizer0.getChiSquare();
        double double26 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        double double13 = levenbergMarquardtOptimizer10.getRMS();
        double double14 = levenbergMarquardtOptimizer10.getRMS();
        double double15 = levenbergMarquardtOptimizer10.getRMS();
        int int16 = levenbergMarquardtOptimizer10.getIterations();
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) (byte) 100);
        int int19 = levenbergMarquardtOptimizer10.getEvaluations();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) '4');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxIterations(100);
        levenbergMarquardtOptimizer22.setMaxIterations((int) (short) 10);
        int int27 = levenbergMarquardtOptimizer22.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setMaxIterations(100);
        double double31 = levenbergMarquardtOptimizer28.getRMS();
        levenbergMarquardtOptimizer28.setCostRelativeTolerance((double) (-1L));
        double double34 = levenbergMarquardtOptimizer28.getRMS();
        int int35 = levenbergMarquardtOptimizer28.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker36);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1000 + "'", int7 == 1000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction19 = null;
        double[] doubleArray23 = new double[] { (byte) 10, (short) 100, 1000 };
        double[] doubleArray24 = new double[] {};
        double[] doubleArray26 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction19, doubleArray23, doubleArray24, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 3 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0, 1000.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0]");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 35);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        levenbergMarquardtOptimizer10.setMaxIterations((int) (short) 10);
        int int15 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxIterations(100);
        double double19 = levenbergMarquardtOptimizer16.getRMS();
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) (-1L));
        double double22 = levenbergMarquardtOptimizer16.getRMS();
        int int23 = levenbergMarquardtOptimizer16.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        int int27 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int28 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker33 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker33);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxIterations(100);
        double double17 = levenbergMarquardtOptimizer14.getRMS();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance((double) (-1L));
        int int20 = levenbergMarquardtOptimizer14.getMaxEvaluations();
        int int21 = levenbergMarquardtOptimizer14.getIterations();
        int int22 = levenbergMarquardtOptimizer14.getJacobianEvaluations();
        levenbergMarquardtOptimizer14.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer14.setOrthoTolerance((double) (short) 0);
        int int27 = levenbergMarquardtOptimizer14.getIterations();
        levenbergMarquardtOptimizer14.setInitialStepBoundFactor((double) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer30.setMaxIterations(100);
        double double33 = levenbergMarquardtOptimizer30.getRMS();
        double double34 = levenbergMarquardtOptimizer30.getRMS();
        double double35 = levenbergMarquardtOptimizer30.getRMS();
        int int36 = levenbergMarquardtOptimizer30.getMaxEvaluations();
        int int37 = levenbergMarquardtOptimizer30.getJacobianEvaluations();
        levenbergMarquardtOptimizer30.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker43);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer45.setMaxIterations(100);
        double double48 = levenbergMarquardtOptimizer45.getRMS();
        levenbergMarquardtOptimizer45.setCostRelativeTolerance((double) (-1L));
        double double51 = levenbergMarquardtOptimizer45.getRMS();
        int int52 = levenbergMarquardtOptimizer45.getJacobianEvaluations();
        double double53 = levenbergMarquardtOptimizer45.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker54 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker54);
        levenbergMarquardtOptimizer14.setConvergenceChecker(vectorialConvergenceChecker54);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker54);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        double double60 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker54);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getRMS();
        levenbergMarquardtOptimizer6.setCostRelativeTolerance((double) (-1L));
        double double12 = levenbergMarquardtOptimizer6.getRMS();
        int int13 = levenbergMarquardtOptimizer6.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer18.setMaxIterations(100);
        double double21 = levenbergMarquardtOptimizer18.getChiSquare();
        levenbergMarquardtOptimizer18.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer18.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer18.setCostRelativeTolerance((double) (short) -1);
        double double28 = levenbergMarquardtOptimizer18.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction15 = null;
        double[] doubleArray17 = new double[] { 1 };
        double[] doubleArray18 = new double[] {};
        double[] doubleArray21 = new double[] { 0.0f, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction15, doubleArray17, doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 0");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 10.0]");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getRMS();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (-1L));
        double double15 = levenbergMarquardtOptimizer9.getRMS();
        int int16 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        double double17 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) ' ');
        int int22 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        java.lang.Class<?> wildcardClass21 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxIterations(100);
        levenbergMarquardtOptimizer17.setMaxIterations((int) (short) 10);
        int int22 = levenbergMarquardtOptimizer17.getJacobianEvaluations();
        levenbergMarquardtOptimizer17.setParRelativeTolerance((double) 10.0f);
        double double25 = levenbergMarquardtOptimizer17.getRMS();
        int int26 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        double double27 = levenbergMarquardtOptimizer17.getRMS();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setParRelativeTolerance((double) ' ');
        int int10 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        levenbergMarquardtOptimizer7.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer7.setMaxIterations(10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        java.lang.Class<?> wildcardClass20 = vectorialConvergenceChecker18.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer18.setMaxIterations(100);
        double double21 = levenbergMarquardtOptimizer18.getRMS();
        levenbergMarquardtOptimizer18.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer18.setParRelativeTolerance((double) 10.0f);
        int int26 = levenbergMarquardtOptimizer18.getMaxIterations();
        levenbergMarquardtOptimizer18.setMaxEvaluations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setMaxIterations(100);
        double double32 = levenbergMarquardtOptimizer29.getRMS();
        levenbergMarquardtOptimizer29.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer29.setMaxIterations((int) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setMaxIterations(100);
        int int40 = levenbergMarquardtOptimizer37.getMaxEvaluations();
        levenbergMarquardtOptimizer37.setMaxIterations(0);
        levenbergMarquardtOptimizer37.setOrthoTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer37.setInitialStepBoundFactor((double) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker47 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialConvergenceChecker47);
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialConvergenceChecker47);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker47);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer51.setMaxIterations(100);
        levenbergMarquardtOptimizer51.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer51.setMaxIterations(10);
        double double58 = levenbergMarquardtOptimizer51.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker59 = levenbergMarquardtOptimizer51.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker59);
        int int61 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker47);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setParRelativeTolerance((double) ' ');
        int int18 = levenbergMarquardtOptimizer15.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker19);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        java.lang.Class<?> wildcardClass22 = vectorialConvergenceChecker19.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setMaxIterations(100);
        levenbergMarquardtOptimizer8.setMaxIterations((int) (short) 10);
        int int13 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction14 = null;
        double[] doubleArray16 = new double[] { 1.0d };
        double[] doubleArray21 = new double[] { (-1.0d), (short) 1, 10.0f, (byte) 100 };
        double[] doubleArray24 = new double[] { 100L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction14, doubleArray16, doubleArray21, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 4");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, -1.0]");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxIterations(100);
        levenbergMarquardtOptimizer5.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxIterations(100);
        double double14 = levenbergMarquardtOptimizer11.getRMS();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (-1L));
        double double17 = levenbergMarquardtOptimizer11.getRMS();
        int int18 = levenbergMarquardtOptimizer11.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer25.setMaxIterations(100);
        double double28 = levenbergMarquardtOptimizer25.getRMS();
        double double29 = levenbergMarquardtOptimizer25.getRMS();
        double double30 = levenbergMarquardtOptimizer25.getRMS();
        int int31 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer25.getJacobianEvaluations();
        levenbergMarquardtOptimizer25.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker38);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setMaxIterations(100);
        double double43 = levenbergMarquardtOptimizer40.getRMS();
        levenbergMarquardtOptimizer40.setCostRelativeTolerance((double) (-1L));
        double double46 = levenbergMarquardtOptimizer40.getRMS();
        int int47 = levenbergMarquardtOptimizer40.getJacobianEvaluations();
        double double48 = levenbergMarquardtOptimizer40.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker49);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer52.setMaxIterations(100);
        double double55 = levenbergMarquardtOptimizer52.getRMS();
        levenbergMarquardtOptimizer52.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int64 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 35);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker58);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxIterations(100);
        levenbergMarquardtOptimizer5.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxIterations(100);
        double double14 = levenbergMarquardtOptimizer11.getRMS();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (-1L));
        double double17 = levenbergMarquardtOptimizer11.getRMS();
        int int18 = levenbergMarquardtOptimizer11.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer25.setMaxIterations(100);
        double double28 = levenbergMarquardtOptimizer25.getRMS();
        double double29 = levenbergMarquardtOptimizer25.getRMS();
        double double30 = levenbergMarquardtOptimizer25.getRMS();
        int int31 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer25.getJacobianEvaluations();
        levenbergMarquardtOptimizer25.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker38);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setMaxIterations(100);
        double double43 = levenbergMarquardtOptimizer40.getRMS();
        levenbergMarquardtOptimizer40.setCostRelativeTolerance((double) (-1L));
        double double46 = levenbergMarquardtOptimizer40.getRMS();
        int int47 = levenbergMarquardtOptimizer40.getJacobianEvaluations();
        double double48 = levenbergMarquardtOptimizer40.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker49);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer52.setMaxIterations(100);
        double double55 = levenbergMarquardtOptimizer52.getRMS();
        levenbergMarquardtOptimizer52.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        java.lang.Class<?> wildcardClass66 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker58);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxIterations(100);
        levenbergMarquardtOptimizer5.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxIterations(100);
        double double14 = levenbergMarquardtOptimizer11.getRMS();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (-1L));
        double double17 = levenbergMarquardtOptimizer11.getRMS();
        int int18 = levenbergMarquardtOptimizer11.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer25.setMaxIterations(100);
        double double28 = levenbergMarquardtOptimizer25.getRMS();
        double double29 = levenbergMarquardtOptimizer25.getRMS();
        double double30 = levenbergMarquardtOptimizer25.getRMS();
        int int31 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer25.getJacobianEvaluations();
        levenbergMarquardtOptimizer25.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker38);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setMaxIterations(100);
        double double43 = levenbergMarquardtOptimizer40.getRMS();
        levenbergMarquardtOptimizer40.setCostRelativeTolerance((double) (-1L));
        double double46 = levenbergMarquardtOptimizer40.getRMS();
        int int47 = levenbergMarquardtOptimizer40.getJacobianEvaluations();
        double double48 = levenbergMarquardtOptimizer40.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker49);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer52.setMaxIterations(100);
        double double55 = levenbergMarquardtOptimizer52.getRMS();
        levenbergMarquardtOptimizer52.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        int int62 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int63 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int64 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1000 + "'", int64 == 1000);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer18.setMaxIterations(100);
        double double21 = levenbergMarquardtOptimizer18.getChiSquare();
        levenbergMarquardtOptimizer18.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer18.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer18.setCostRelativeTolerance((double) (short) -1);
        int int28 = levenbergMarquardtOptimizer18.getIterations();
        int int29 = levenbergMarquardtOptimizer18.getIterations();
        int int30 = levenbergMarquardtOptimizer18.getMaxIterations();
        int int31 = levenbergMarquardtOptimizer18.getEvaluations();
        int int32 = levenbergMarquardtOptimizer18.getMaxIterations();
        double double33 = levenbergMarquardtOptimizer18.getRMS();
        levenbergMarquardtOptimizer18.setInitialStepBoundFactor((double) 2147483647);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker36);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 32);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker4);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        levenbergMarquardtOptimizer9.setMaxIterations((int) (short) 10);
        int int14 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 52);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getChiSquare();
        levenbergMarquardtOptimizer6.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int22 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker26);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        double double32 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker26);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getRMS();
        double double10 = levenbergMarquardtOptimizer6.getRMS();
        double double11 = levenbergMarquardtOptimizer6.getRMS();
        double double12 = levenbergMarquardtOptimizer6.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxIterations(100);
        double double23 = levenbergMarquardtOptimizer20.getChiSquare();
        levenbergMarquardtOptimizer20.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer20.setCostRelativeTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        double double30 = levenbergMarquardtOptimizer20.getRMS();
        double double31 = levenbergMarquardtOptimizer20.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setParRelativeTolerance((double) ' ');
        int int35 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        int int37 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        levenbergMarquardtOptimizer32.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer32.setMaxIterations(10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker43);
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray46 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker28);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker42);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setMaxEvaluations((int) '#');
        int int18 = levenbergMarquardtOptimizer12.getMaxIterations();
        int int19 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxIterations(100);
        double double23 = levenbergMarquardtOptimizer20.getChiSquare();
        levenbergMarquardtOptimizer20.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer20.setCostRelativeTolerance((double) (byte) -1);
        int int28 = levenbergMarquardtOptimizer20.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setMaxIterations(100);
        double double32 = levenbergMarquardtOptimizer29.getRMS();
        levenbergMarquardtOptimizer29.setCostRelativeTolerance((double) (-1L));
        double double35 = levenbergMarquardtOptimizer29.getRMS();
        int int36 = levenbergMarquardtOptimizer29.getJacobianEvaluations();
        double double37 = levenbergMarquardtOptimizer29.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer39.setParRelativeTolerance((double) ' ');
        int int42 = levenbergMarquardtOptimizer39.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker43);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker47 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker47);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker47);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1.0f));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction6 = null;
        double[] doubleArray11 = new double[] { (-1L), 32, (byte) 1, (-1) };
        double[] doubleArray18 = new double[] { 52, 35, 10L, 0, 32, (short) -1 };
        double[] doubleArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction6, doubleArray11, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 32.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 35.0, 10.0, 0.0, 32.0, -1.0]");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass12 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        levenbergMarquardtOptimizer12.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) (short) -1);
        int int19 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer12.setOrthoTolerance(1.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setParRelativeTolerance((double) ' ');
        int int29 = levenbergMarquardtOptimizer26.getIterations();
        int int30 = levenbergMarquardtOptimizer26.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer31.setMaxIterations(100);
        double double34 = levenbergMarquardtOptimizer31.getRMS();
        double double35 = levenbergMarquardtOptimizer31.getRMS();
        double double36 = levenbergMarquardtOptimizer31.getRMS();
        int int37 = levenbergMarquardtOptimizer31.getMaxEvaluations();
        int int38 = levenbergMarquardtOptimizer31.getJacobianEvaluations();
        levenbergMarquardtOptimizer31.setParRelativeTolerance(0.0d);
        double double41 = levenbergMarquardtOptimizer31.getChiSquare();
        levenbergMarquardtOptimizer31.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker46 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker46);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker46);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker46);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker46);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (-1L));
        double double18 = levenbergMarquardtOptimizer12.getRMS();
        int int19 = levenbergMarquardtOptimizer12.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        int int25 = levenbergMarquardtOptimizer0.getEvaluations();
        double double26 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setMaxIterations(100);
        double double30 = levenbergMarquardtOptimizer27.getRMS();
        double double31 = levenbergMarquardtOptimizer27.getRMS();
        double double32 = levenbergMarquardtOptimizer27.getRMS();
        int int33 = levenbergMarquardtOptimizer27.getMaxEvaluations();
        int int34 = levenbergMarquardtOptimizer27.getJacobianEvaluations();
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer37 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer37.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer37.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker40);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer42.setMaxIterations(100);
        double double45 = levenbergMarquardtOptimizer42.getRMS();
        levenbergMarquardtOptimizer42.setCostRelativeTolerance((double) (-1L));
        double double48 = levenbergMarquardtOptimizer42.getRMS();
        int int49 = levenbergMarquardtOptimizer42.getJacobianEvaluations();
        double double50 = levenbergMarquardtOptimizer42.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker51 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker51);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker53 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker53);
        int int55 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker40);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker51);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxIterations(100);
        levenbergMarquardtOptimizer17.setMaxIterations((int) (short) 10);
        int int22 = levenbergMarquardtOptimizer17.getJacobianEvaluations();
        levenbergMarquardtOptimizer17.setParRelativeTolerance((double) 10.0f);
        double double25 = levenbergMarquardtOptimizer17.getRMS();
        int int26 = levenbergMarquardtOptimizer17.getIterations();
        double double27 = levenbergMarquardtOptimizer17.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker28);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker28);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(35);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getChiSquare();
        double double13 = levenbergMarquardtOptimizer9.getChiSquare();
        int int14 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker16);
        int int18 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        double double29 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        double double16 = levenbergMarquardtOptimizer12.getRMS();
        double double17 = levenbergMarquardtOptimizer12.getRMS();
        int int18 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int19 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker25);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setMaxIterations(100);
        double double30 = levenbergMarquardtOptimizer27.getRMS();
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) (-1L));
        double double33 = levenbergMarquardtOptimizer27.getRMS();
        int int34 = levenbergMarquardtOptimizer27.getJacobianEvaluations();
        double double35 = levenbergMarquardtOptimizer27.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        int int40 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        double double43 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker25);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        levenbergMarquardtOptimizer10.setMaxIterations((int) (short) 10);
        int int15 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxIterations(100);
        double double19 = levenbergMarquardtOptimizer16.getRMS();
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) (-1L));
        double double22 = levenbergMarquardtOptimizer16.getRMS();
        int int23 = levenbergMarquardtOptimizer16.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker31);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray15 = new double[] { 10.0d, (short) 0, 0L, (-1.0d) };
        double[] doubleArray22 = new double[] { 10, '#', 100.0d, 10.0f, (-1.0d), 0.0f };
        double[] doubleArray25 = new double[] { (-1.0f), '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray15, doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 0.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 35.0, 100.0, 10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 35.0]");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setMaxEvaluations((int) '#');
        int int18 = levenbergMarquardtOptimizer12.getMaxIterations();
        int int19 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxIterations(100);
        levenbergMarquardtOptimizer20.setMaxIterations((int) (short) 10);
        int int25 = levenbergMarquardtOptimizer20.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker26);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker28);
        int int30 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker26);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        java.lang.Class<?> wildcardClass13 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setMaxIterations(100);
        int int7 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        double double13 = levenbergMarquardtOptimizer10.getChiSquare();
        levenbergMarquardtOptimizer10.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker19);
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker19);
        levenbergMarquardtOptimizer4.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer4.setInitialStepBoundFactor((double) 'a');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setMaxIterations(100);
        double double29 = levenbergMarquardtOptimizer26.getChiSquare();
        double double30 = levenbergMarquardtOptimizer26.getChiSquare();
        int int31 = levenbergMarquardtOptimizer26.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        int int35 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction36 = null;
        double[] doubleArray38 = new double[] { (-1.0f) };
        double[] doubleArray45 = new double[] { (-1), (short) 0, 97, 97, 0, (byte) 10 };
        double[] doubleArray47 = new double[] { 35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair48 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction36, doubleArray38, doubleArray45, doubleArray47);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 1 != 6");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0, 97.0, 97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[35.0]");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1000 + "'", int16 == 1000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setMaxIterations(100);
        double double7 = levenbergMarquardtOptimizer4.getRMS();
        double double8 = levenbergMarquardtOptimizer4.getRMS();
        double double9 = levenbergMarquardtOptimizer4.getRMS();
        int int10 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer4.getJacobianEvaluations();
        levenbergMarquardtOptimizer4.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker17);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxIterations(100);
        double double22 = levenbergMarquardtOptimizer19.getRMS();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) (-1L));
        double double25 = levenbergMarquardtOptimizer19.getRMS();
        int int26 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        double double27 = levenbergMarquardtOptimizer19.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setConvergenceChecker(vectorialConvergenceChecker28);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker28);
        int int31 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer0.getIterations();
        int int33 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int34 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1000 + "'", int33 == 1000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1000 + "'", int34 == 1000);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getRMS();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (-1L));
        double double15 = levenbergMarquardtOptimizer9.getRMS();
        int int16 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        double double17 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) ' ');
        int int22 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        double double28 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setParRelativeTolerance((double) ' ');
        int int13 = levenbergMarquardtOptimizer10.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        java.lang.Class<?> wildcardClass20 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100.0f);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1000);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setMaxIterations(100);
        double double10 = levenbergMarquardtOptimizer7.getChiSquare();
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) 2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxIterations(100);
        double double22 = levenbergMarquardtOptimizer19.getRMS();
        double double23 = levenbergMarquardtOptimizer19.getRMS();
        double double24 = levenbergMarquardtOptimizer19.getRMS();
        int int25 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        int int26 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker32);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setMaxIterations(100);
        double double37 = levenbergMarquardtOptimizer34.getRMS();
        levenbergMarquardtOptimizer34.setCostRelativeTolerance((double) (-1L));
        double double40 = levenbergMarquardtOptimizer34.getRMS();
        int int41 = levenbergMarquardtOptimizer34.getJacobianEvaluations();
        double double42 = levenbergMarquardtOptimizer34.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer0.setMaxEvaluations(52);
        int int50 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int51 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer52.setMaxIterations(100);
        double double55 = levenbergMarquardtOptimizer52.getRMS();
        levenbergMarquardtOptimizer52.setCostRelativeTolerance((double) (-1L));
        int int58 = levenbergMarquardtOptimizer52.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker59 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker59);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer61 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer61.setMaxIterations(100);
        double double64 = levenbergMarquardtOptimizer61.getChiSquare();
        levenbergMarquardtOptimizer61.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer61.setOrthoTolerance((double) 2147483647);
        double double69 = levenbergMarquardtOptimizer61.getChiSquare();
        levenbergMarquardtOptimizer61.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer61.setOrthoTolerance((double) (byte) -1);
        double double74 = levenbergMarquardtOptimizer61.getChiSquare();
        levenbergMarquardtOptimizer61.setMaxEvaluations((int) (short) 1);
        double double77 = levenbergMarquardtOptimizer61.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker78 = levenbergMarquardtOptimizer61.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker78);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker59);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker78);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getChiSquare();
        double double13 = levenbergMarquardtOptimizer9.getChiSquare();
        int int14 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer9.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = null;
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker16);
        int int18 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        int int26 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction27 = null;
        double[] doubleArray34 = new double[] { (-1), (-1), ' ', 10.0f, (short) 1, (short) 0 };
        double[] doubleArray37 = new double[] { (byte) 1, 'a' };
        double[] doubleArray40 = new double[] { 32, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair41 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction27, doubleArray34, doubleArray37, doubleArray40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 6 != 2");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 32.0, 10.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[32.0, 100.0]");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        double double13 = levenbergMarquardtOptimizer10.getRMS();
        double double14 = levenbergMarquardtOptimizer10.getRMS();
        double double15 = levenbergMarquardtOptimizer10.getRMS();
        double double16 = levenbergMarquardtOptimizer10.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker17);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction8 = null;
        double[] doubleArray12 = new double[] { 1.0d, 0, (short) -1 };
        double[] doubleArray16 = new double[] { 10L, 1L, 97 };
        double[] doubleArray20 = new double[] { 1.0d, Double.NaN, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction8, doubleArray12, doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, NaN, 1.0]");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 52);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setMaxIterations(100);
        double double18 = levenbergMarquardtOptimizer15.getChiSquare();
        levenbergMarquardtOptimizer15.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer15.setMaxIterations(1000);
        int int28 = levenbergMarquardtOptimizer15.getIterations();
        double double29 = levenbergMarquardtOptimizer15.getChiSquare();
        double double30 = levenbergMarquardtOptimizer15.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker31);
        int int33 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxIterations(100);
        levenbergMarquardtOptimizer17.setMaxIterations((int) (short) 10);
        int int22 = levenbergMarquardtOptimizer17.getJacobianEvaluations();
        levenbergMarquardtOptimizer17.setParRelativeTolerance((double) 10.0f);
        double double25 = levenbergMarquardtOptimizer17.getRMS();
        int int26 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        double double27 = levenbergMarquardtOptimizer17.getRMS();
        levenbergMarquardtOptimizer17.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        int int32 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getChiSquare();
        levenbergMarquardtOptimizer6.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int22 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker26);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int34 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getRMS();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (-1L));
        double double15 = levenbergMarquardtOptimizer9.getRMS();
        int int16 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        double double17 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) ' ');
        int int22 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer12.setOrthoTolerance((double) 2147483647);
        double double20 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        int int27 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        double double22 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 32);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 97);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxIterations(100);
        double double23 = levenbergMarquardtOptimizer20.getRMS();
        double double24 = levenbergMarquardtOptimizer20.getRMS();
        int int25 = levenbergMarquardtOptimizer20.getMaxIterations();
        int int26 = levenbergMarquardtOptimizer20.getMaxIterations();
        double double27 = levenbergMarquardtOptimizer20.getChiSquare();
        levenbergMarquardtOptimizer20.setInitialStepBoundFactor((double) 100.0f);
        int int30 = levenbergMarquardtOptimizer20.getJacobianEvaluations();
        int int31 = levenbergMarquardtOptimizer20.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setMaxIterations(100);
        levenbergMarquardtOptimizer32.setMaxIterations((int) (short) 10);
        int int37 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        levenbergMarquardtOptimizer32.setParRelativeTolerance((double) 10.0f);
        double double40 = levenbergMarquardtOptimizer32.getRMS();
        int int41 = levenbergMarquardtOptimizer32.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer42 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer42.setMaxIterations(100);
        double double45 = levenbergMarquardtOptimizer42.getRMS();
        levenbergMarquardtOptimizer42.setCostRelativeTolerance((double) (-1L));
        int int48 = levenbergMarquardtOptimizer42.getMaxEvaluations();
        int int49 = levenbergMarquardtOptimizer42.getIterations();
        int int50 = levenbergMarquardtOptimizer42.getJacobianEvaluations();
        levenbergMarquardtOptimizer42.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer42.setCostRelativeTolerance((double) (short) -1);
        int int55 = levenbergMarquardtOptimizer42.getJacobianEvaluations();
        double double56 = levenbergMarquardtOptimizer42.getRMS();
        int int57 = levenbergMarquardtOptimizer42.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer42.getConvergenceChecker();
        levenbergMarquardtOptimizer32.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        java.lang.Class<?> wildcardClass62 = vectorialConvergenceChecker58.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker58);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setMaxIterations(100);
        double double16 = levenbergMarquardtOptimizer13.getRMS();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (-1L));
        double double19 = levenbergMarquardtOptimizer13.getRMS();
        int int20 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        double double21 = levenbergMarquardtOptimizer13.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setParRelativeTolerance((double) ' ');
        int int26 = levenbergMarquardtOptimizer23.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker27);
        int int30 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        java.lang.Class<?> wildcardClass33 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getChiSquare();
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) 2147483647);
        double double17 = levenbergMarquardtOptimizer9.getChiSquare();
        levenbergMarquardtOptimizer9.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) 100);
        double double22 = levenbergMarquardtOptimizer9.getChiSquare();
        double double23 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setMaxIterations(100);
        double double30 = levenbergMarquardtOptimizer27.getChiSquare();
        levenbergMarquardtOptimizer27.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer27.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) (short) -1);
        int int37 = levenbergMarquardtOptimizer27.getIterations();
        int int38 = levenbergMarquardtOptimizer27.getIterations();
        int int39 = levenbergMarquardtOptimizer27.getMaxIterations();
        int int40 = levenbergMarquardtOptimizer27.getEvaluations();
        int int41 = levenbergMarquardtOptimizer27.getMaxIterations();
        double double42 = levenbergMarquardtOptimizer27.getRMS();
        levenbergMarquardtOptimizer27.setInitialStepBoundFactor((double) 2147483647);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker45 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker45);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker45);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer12.setOrthoTolerance((double) 2147483647);
        double double20 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer12.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) 0);
        int int27 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance(0.0d);
        int int30 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int31 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer33.setMaxIterations(100);
        double double36 = levenbergMarquardtOptimizer33.getRMS();
        levenbergMarquardtOptimizer33.setCostRelativeTolerance((double) (-1L));
        int int39 = levenbergMarquardtOptimizer33.getMaxEvaluations();
        int int40 = levenbergMarquardtOptimizer33.getIterations();
        int int41 = levenbergMarquardtOptimizer33.getJacobianEvaluations();
        levenbergMarquardtOptimizer33.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer33.setCostRelativeTolerance((double) (short) -1);
        int int46 = levenbergMarquardtOptimizer33.getJacobianEvaluations();
        double double47 = levenbergMarquardtOptimizer33.getRMS();
        int int48 = levenbergMarquardtOptimizer33.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker50 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker50);
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) 10);
        levenbergMarquardtOptimizer12.setMaxEvaluations(100);
        double double56 = levenbergMarquardtOptimizer12.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer57 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer57.setMaxIterations(100);
        levenbergMarquardtOptimizer57.setMaxIterations((int) (short) 10);
        int int62 = levenbergMarquardtOptimizer57.getJacobianEvaluations();
        levenbergMarquardtOptimizer57.setParRelativeTolerance((double) 10.0f);
        double double65 = levenbergMarquardtOptimizer57.getRMS();
        levenbergMarquardtOptimizer57.setMaxIterations((int) (byte) 10);
        levenbergMarquardtOptimizer57.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker70 = levenbergMarquardtOptimizer57.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker70);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker70);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker32);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker50);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker70);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setParRelativeTolerance((double) ' ');
        int int7 = levenbergMarquardtOptimizer4.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker8);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxIterations(100);
        double double17 = levenbergMarquardtOptimizer14.getRMS();
        levenbergMarquardtOptimizer14.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass18 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction22 = null;
        double[] doubleArray23 = null;
        double[] doubleArray25 = new double[] { 0 };
        double[] doubleArray26 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction22, doubleArray23, doubleArray25, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getChiSquare();
        double double16 = levenbergMarquardtOptimizer12.getChiSquare();
        int int17 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setMaxIterations(100);
        int int23 = levenbergMarquardtOptimizer20.getMaxEvaluations();
        levenbergMarquardtOptimizer20.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer26.setMaxIterations(100);
        double double29 = levenbergMarquardtOptimizer26.getChiSquare();
        levenbergMarquardtOptimizer26.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer20.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer20.setInitialStepBoundFactor((double) 'a');
        int int42 = levenbergMarquardtOptimizer20.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer43.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker46 = levenbergMarquardtOptimizer43.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker46);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker46);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker46);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        int int52 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 97);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxIterations(100);
        double double17 = levenbergMarquardtOptimizer14.getChiSquare();
        levenbergMarquardtOptimizer14.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer14.setOrthoTolerance((double) 2147483647);
        double double22 = levenbergMarquardtOptimizer14.getChiSquare();
        double double23 = levenbergMarquardtOptimizer14.getChiSquare();
        double double24 = levenbergMarquardtOptimizer14.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker25);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker26);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getChiSquare();
        levenbergMarquardtOptimizer6.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int22 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker26);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker26);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(35);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxIterations(100);
        double double24 = levenbergMarquardtOptimizer21.getRMS();
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) (-1L));
        int int27 = levenbergMarquardtOptimizer21.getMaxEvaluations();
        int int28 = levenbergMarquardtOptimizer21.getIterations();
        int int29 = levenbergMarquardtOptimizer21.getJacobianEvaluations();
        levenbergMarquardtOptimizer21.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) (short) -1);
        int int34 = levenbergMarquardtOptimizer21.getJacobianEvaluations();
        double double35 = levenbergMarquardtOptimizer21.getRMS();
        int int36 = levenbergMarquardtOptimizer21.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker37 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker37);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getChiSquare();
        levenbergMarquardtOptimizer6.setOrthoTolerance((double) (-1));
        double double12 = levenbergMarquardtOptimizer6.getRMS();
        double double13 = levenbergMarquardtOptimizer6.getChiSquare();
        int int14 = levenbergMarquardtOptimizer6.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 35);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        double double16 = levenbergMarquardtOptimizer12.getRMS();
        double double17 = levenbergMarquardtOptimizer12.getRMS();
        int int18 = levenbergMarquardtOptimizer12.getIterations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (byte) 100);
        double double21 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setMaxIterations(100);
        double double25 = levenbergMarquardtOptimizer22.getChiSquare();
        levenbergMarquardtOptimizer22.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer22.setMaxEvaluations(0);
        double double30 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker31);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer33.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        int int37 = levenbergMarquardtOptimizer33.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer38 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer38.setMaxIterations(100);
        levenbergMarquardtOptimizer38.setMaxIterations((int) (short) 10);
        int int43 = levenbergMarquardtOptimizer38.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer44.setMaxIterations(100);
        double double47 = levenbergMarquardtOptimizer44.getRMS();
        levenbergMarquardtOptimizer44.setCostRelativeTolerance((double) (-1L));
        double double50 = levenbergMarquardtOptimizer44.getRMS();
        int int51 = levenbergMarquardtOptimizer44.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker52 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer38.setConvergenceChecker(vectorialConvergenceChecker52);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer54 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer54.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker57 = levenbergMarquardtOptimizer54.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer58 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer58.setMaxIterations(100);
        double double61 = levenbergMarquardtOptimizer58.getRMS();
        double double62 = levenbergMarquardtOptimizer58.getRMS();
        double double63 = levenbergMarquardtOptimizer58.getRMS();
        int int64 = levenbergMarquardtOptimizer58.getMaxEvaluations();
        int int65 = levenbergMarquardtOptimizer58.getJacobianEvaluations();
        levenbergMarquardtOptimizer58.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer68 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer68.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker71 = levenbergMarquardtOptimizer68.getConvergenceChecker();
        levenbergMarquardtOptimizer58.setConvergenceChecker(vectorialConvergenceChecker71);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer73 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer73.setMaxIterations(100);
        double double76 = levenbergMarquardtOptimizer73.getRMS();
        levenbergMarquardtOptimizer73.setCostRelativeTolerance((double) (-1L));
        double double79 = levenbergMarquardtOptimizer73.getRMS();
        int int80 = levenbergMarquardtOptimizer73.getJacobianEvaluations();
        double double81 = levenbergMarquardtOptimizer73.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker82 = levenbergMarquardtOptimizer73.getConvergenceChecker();
        levenbergMarquardtOptimizer58.setConvergenceChecker(vectorialConvergenceChecker82);
        levenbergMarquardtOptimizer54.setConvergenceChecker(vectorialConvergenceChecker82);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer85 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer85.setMaxIterations(100);
        double double88 = levenbergMarquardtOptimizer85.getRMS();
        levenbergMarquardtOptimizer85.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker91 = levenbergMarquardtOptimizer85.getConvergenceChecker();
        levenbergMarquardtOptimizer54.setConvergenceChecker(vectorialConvergenceChecker91);
        levenbergMarquardtOptimizer38.setConvergenceChecker(vectorialConvergenceChecker91);
        levenbergMarquardtOptimizer33.setConvergenceChecker(vectorialConvergenceChecker91);
        levenbergMarquardtOptimizer33.setMaxIterations((int) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker97 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker97);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker31);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker52);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker57);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker71);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker82);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker91);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker97);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1000 + "'", int10 == 1000);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker6);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setMaxIterations(100);
        double double16 = levenbergMarquardtOptimizer13.getRMS();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (-1L));
        double double19 = levenbergMarquardtOptimizer13.getRMS();
        int int20 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        double double21 = levenbergMarquardtOptimizer13.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer23 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer23.setParRelativeTolerance((double) ' ');
        int int26 = levenbergMarquardtOptimizer23.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer23.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker27);
        int int30 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int33 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        double double36 = levenbergMarquardtOptimizer0.getRMS();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxIterations(100);
        double double19 = levenbergMarquardtOptimizer16.getRMS();
        double double20 = levenbergMarquardtOptimizer16.getRMS();
        double double21 = levenbergMarquardtOptimizer16.getRMS();
        int int22 = levenbergMarquardtOptimizer16.getMaxEvaluations();
        int int23 = levenbergMarquardtOptimizer16.getJacobianEvaluations();
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer16.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        int int32 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        int int19 = levenbergMarquardtOptimizer0.getEvaluations();
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 'a');
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxIterations(100);
        levenbergMarquardtOptimizer5.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setMaxIterations(100);
        double double14 = levenbergMarquardtOptimizer11.getRMS();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (-1L));
        double double17 = levenbergMarquardtOptimizer11.getRMS();
        int int18 = levenbergMarquardtOptimizer11.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker19);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer25.setMaxIterations(100);
        double double28 = levenbergMarquardtOptimizer25.getRMS();
        double double29 = levenbergMarquardtOptimizer25.getRMS();
        double double30 = levenbergMarquardtOptimizer25.getRMS();
        int int31 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer25.getJacobianEvaluations();
        levenbergMarquardtOptimizer25.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker38);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setMaxIterations(100);
        double double43 = levenbergMarquardtOptimizer40.getRMS();
        levenbergMarquardtOptimizer40.setCostRelativeTolerance((double) (-1L));
        double double46 = levenbergMarquardtOptimizer40.getRMS();
        int int47 = levenbergMarquardtOptimizer40.getJacobianEvaluations();
        double double48 = levenbergMarquardtOptimizer40.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker49 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker49);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker49);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer52 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer52.setMaxIterations(100);
        double double55 = levenbergMarquardtOptimizer52.getRMS();
        levenbergMarquardtOptimizer52.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer52.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker58);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer62 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer62.setMaxIterations(100);
        double double65 = levenbergMarquardtOptimizer62.getChiSquare();
        levenbergMarquardtOptimizer62.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer62.setOrthoTolerance((double) 2147483647);
        double double70 = levenbergMarquardtOptimizer62.getChiSquare();
        levenbergMarquardtOptimizer62.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer62.setOrthoTolerance((double) (byte) -1);
        double double75 = levenbergMarquardtOptimizer62.getChiSquare();
        double double76 = levenbergMarquardtOptimizer62.getRMS();
        levenbergMarquardtOptimizer62.setOrthoTolerance(0.0d);
        int int79 = levenbergMarquardtOptimizer62.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker80 = levenbergMarquardtOptimizer62.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker80);
        int int82 = levenbergMarquardtOptimizer0.getIterations();
        int int83 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker19);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker38);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker49);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker58);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (-1L));
        double double18 = levenbergMarquardtOptimizer12.getRMS();
        int int19 = levenbergMarquardtOptimizer12.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        int int27 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getChiSquare();
        levenbergMarquardtOptimizer12.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (byte) -1);
        int int20 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxIterations(100);
        double double24 = levenbergMarquardtOptimizer21.getRMS();
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) (-1L));
        double double27 = levenbergMarquardtOptimizer21.getRMS();
        int int28 = levenbergMarquardtOptimizer21.getJacobianEvaluations();
        double double29 = levenbergMarquardtOptimizer21.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer31.setParRelativeTolerance((double) ' ');
        int int34 = levenbergMarquardtOptimizer31.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer12.setMaxEvaluations((int) '#');
        int int40 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer41.setMaxIterations(100);
        double double44 = levenbergMarquardtOptimizer41.getChiSquare();
        levenbergMarquardtOptimizer41.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer41.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer41.setCostRelativeTolerance((double) (short) -1);
        double double51 = levenbergMarquardtOptimizer41.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker52 = levenbergMarquardtOptimizer41.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker52);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker52);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        java.lang.Class<?> wildcardClass17 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker14);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getRMS();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (-1L));
        double double15 = levenbergMarquardtOptimizer9.getRMS();
        int int16 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        double double17 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) ' ');
        int int22 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        int int30 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = levenbergMarquardtOptimizer0.guessParametersErrors();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: no degrees of freedom (0 measurements, 0 parameters)");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction13 = null;
        double[] doubleArray14 = new double[] {};
        double[] doubleArray18 = new double[] { (byte) 1, 10L, 0L };
        double[] doubleArray23 = new double[] { 100.0f, 10.0d, 2147483647, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction13, doubleArray14, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 0 != 3");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 10.0, 2.147483647E9, 0.0]");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setMaxIterations(100);
        double double16 = levenbergMarquardtOptimizer13.getChiSquare();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) 2147483647);
        double double21 = levenbergMarquardtOptimizer13.getChiSquare();
        double double22 = levenbergMarquardtOptimizer13.getChiSquare();
        double double23 = levenbergMarquardtOptimizer13.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double28 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getChiSquare();
        levenbergMarquardtOptimizer6.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker15);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker15);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer17.setMaxIterations(100);
        double double20 = levenbergMarquardtOptimizer17.getRMS();
        levenbergMarquardtOptimizer17.setCostRelativeTolerance((double) (-1L));
        int int23 = levenbergMarquardtOptimizer17.getMaxEvaluations();
        levenbergMarquardtOptimizer17.setParRelativeTolerance((double) 100.0f);
        int int26 = levenbergMarquardtOptimizer17.getEvaluations();
        levenbergMarquardtOptimizer17.setOrthoTolerance((double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setMaxIterations(100);
        double double32 = levenbergMarquardtOptimizer29.getRMS();
        levenbergMarquardtOptimizer29.setOrthoTolerance((double) 1000);
        levenbergMarquardtOptimizer29.setMaxIterations((int) (short) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker37 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setConvergenceChecker(vectorialConvergenceChecker37);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker37);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setMaxIterations(100);
        double double15 = levenbergMarquardtOptimizer12.getRMS();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (-1L));
        double double18 = levenbergMarquardtOptimizer12.getRMS();
        int int19 = levenbergMarquardtOptimizer12.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        int int25 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        int int28 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker20);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        // The following exception was thrown during execution in test generation
        try {
            double[][] doubleArray7 = levenbergMarquardtOptimizer0.getCovariances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxEvaluations(35);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction10 = null;
        double[] doubleArray13 = new double[] { (-1), (short) 0 };
        double[] doubleArray15 = new double[] { 0 };
        double[] doubleArray22 = new double[] { Double.NaN, (short) -1, 100L, (byte) 100, 100.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction10, doubleArray13, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 2 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[NaN, -1.0, 100.0, 100.0, 100.0, 0.0]");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer5.setMaxIterations(100);
        levenbergMarquardtOptimizer5.setMaxIterations((int) (short) 10);
        int int10 = levenbergMarquardtOptimizer5.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker11);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 35);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        java.lang.Class<?> wildcardClass16 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker7);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setMaxIterations(100);
        double double17 = levenbergMarquardtOptimizer14.getRMS();
        double double18 = levenbergMarquardtOptimizer14.getRMS();
        double double19 = levenbergMarquardtOptimizer14.getRMS();
        int int20 = levenbergMarquardtOptimizer14.getIterations();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance((double) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        int int25 = levenbergMarquardtOptimizer0.getIterations();
        int int26 = levenbergMarquardtOptimizer0.getIterations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setMaxIterations(100);
        double double12 = levenbergMarquardtOptimizer9.getRMS();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (-1L));
        double double15 = levenbergMarquardtOptimizer9.getRMS();
        int int16 = levenbergMarquardtOptimizer9.getJacobianEvaluations();
        double double17 = levenbergMarquardtOptimizer9.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) ' ');
        int int22 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        double double30 = levenbergMarquardtOptimizer0.getChiSquare();
        int int31 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 32);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setMaxIterations(100);
        levenbergMarquardtOptimizer15.setMaxIterations((int) (short) 10);
        int int20 = levenbergMarquardtOptimizer15.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setMaxIterations(100);
        double double24 = levenbergMarquardtOptimizer21.getRMS();
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) (-1L));
        double double27 = levenbergMarquardtOptimizer21.getRMS();
        int int28 = levenbergMarquardtOptimizer21.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker29);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer31.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker34 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer35.setMaxIterations(100);
        double double38 = levenbergMarquardtOptimizer35.getRMS();
        double double39 = levenbergMarquardtOptimizer35.getRMS();
        double double40 = levenbergMarquardtOptimizer35.getRMS();
        int int41 = levenbergMarquardtOptimizer35.getMaxEvaluations();
        int int42 = levenbergMarquardtOptimizer35.getJacobianEvaluations();
        levenbergMarquardtOptimizer35.setCostRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer45 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer45.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker48 = levenbergMarquardtOptimizer45.getConvergenceChecker();
        levenbergMarquardtOptimizer35.setConvergenceChecker(vectorialConvergenceChecker48);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer50 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer50.setMaxIterations(100);
        double double53 = levenbergMarquardtOptimizer50.getRMS();
        levenbergMarquardtOptimizer50.setCostRelativeTolerance((double) (-1L));
        double double56 = levenbergMarquardtOptimizer50.getRMS();
        int int57 = levenbergMarquardtOptimizer50.getJacobianEvaluations();
        double double58 = levenbergMarquardtOptimizer50.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker59 = levenbergMarquardtOptimizer50.getConvergenceChecker();
        levenbergMarquardtOptimizer35.setConvergenceChecker(vectorialConvergenceChecker59);
        levenbergMarquardtOptimizer31.setConvergenceChecker(vectorialConvergenceChecker59);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer62 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer62.setMaxIterations(100);
        double double65 = levenbergMarquardtOptimizer62.getRMS();
        levenbergMarquardtOptimizer62.setOrthoTolerance((double) 1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker68 = levenbergMarquardtOptimizer62.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setConvergenceChecker(vectorialConvergenceChecker68);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker68);
        levenbergMarquardtOptimizer15.setParRelativeTolerance((double) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker73 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker73);
        java.lang.Class<?> wildcardClass75 = vectorialConvergenceChecker73.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker29);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker34);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker48);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker59);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker68);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker73);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker3 = null;
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker3);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        java.lang.Class<?> wildcardClass7 = levenbergMarquardtOptimizer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer6.setMaxIterations(100);
        double double9 = levenbergMarquardtOptimizer6.getChiSquare();
        double double10 = levenbergMarquardtOptimizer6.getChiSquare();
        int int11 = levenbergMarquardtOptimizer6.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setParRelativeTolerance((double) (-1L));
        levenbergMarquardtOptimizer6.setMaxEvaluations((int) (short) 1);
        levenbergMarquardtOptimizer6.setCostRelativeTolerance((double) (-1));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setMaxIterations(100);
        levenbergMarquardtOptimizer19.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (short) -1);
        int int26 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        levenbergMarquardtOptimizer19.setOrthoTolerance(100.0d);
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer19.setOrthoTolerance(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker33 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setConvergenceChecker(vectorialConvergenceChecker33);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker33);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker33);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setMaxIterations(100);
        double double19 = levenbergMarquardtOptimizer16.getRMS();
        double double20 = levenbergMarquardtOptimizer16.getRMS();
        double double21 = levenbergMarquardtOptimizer16.getRMS();
        int int22 = levenbergMarquardtOptimizer16.getMaxEvaluations();
        int int23 = levenbergMarquardtOptimizer16.getJacobianEvaluations();
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer16.setParRelativeTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) 1L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        int int32 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        int int35 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction differentiableMultivariateVectorialFunction11 = null;
        double[] doubleArray16 = new double[] { 10.0d, (byte) 0, (-1.0d), 1.0d };
        double[] doubleArray18 = new double[] { (byte) 1 };
        double[] doubleArray23 = new double[] { (short) 1, 32, 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.optimize(differentiableMultivariateVectorialFunction11, doubleArray16, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: dimension mismatch 4 != 1");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 0.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 32.0, 0.0, 0.0]");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double13 = levenbergMarquardtOptimizer12.getRMS();
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) (byte) -1);
        int int16 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer12.getIterations();
        levenbergMarquardtOptimizer12.setMaxEvaluations(2147483647);
        double double20 = levenbergMarquardtOptimizer12.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        double double23 = levenbergMarquardtOptimizer0.getRMS();
        int int24 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(vectorialConvergenceChecker21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        double double3 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }
}

