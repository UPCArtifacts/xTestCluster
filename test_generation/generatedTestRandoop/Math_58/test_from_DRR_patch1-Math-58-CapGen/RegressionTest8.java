import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        gaussianFitter1.addObservedPoint((double) 'a', 0.0d);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) 1L, (double) (byte) -1);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 0, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 100, (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction20 = null;
        double[] doubleArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = gaussianFitter1.fit((int) (short) 10, parametricUnivariateRealFunction20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f, (double) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass23 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), 100.0d, (double) 10.0f);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) -1, 0.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 10L, (-1.0d));
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass26 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction10 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer11 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter12 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer11);
        gaussianFitter12.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter12.clearObservations();
        gaussianFitter12.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter12.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        gaussianFitter12.addObservedPoint((double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter12.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray30 = parameterGuesser29.guess();
        double[] doubleArray31 = parameterGuesser29.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = gaussianFitter1.fit((int) (short) 0, parametricUnivariateRealFunction10, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 10.0, 13.164487904464295]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0, 13.164487904464295]");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, 100.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass29 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) 100.0f);
        java.lang.Class<?> wildcardClass15 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 10.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser18 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray17);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray17);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) (short) 100, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter21.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter21.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = gaussianFitter1.fit(parametricUnivariateRealFunction19, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 0.0, 42.466090014400955]");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) '#');
        gaussianFitter1.addObservedPoint((double) '#', (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 0.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) ' ', 1.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        java.lang.Class<?> wildcardClass23 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 0.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 0.0f, 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(1.0d, (double) (short) 10, 1.0d);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction25 = null;
        double[] doubleArray31 = new double[] { 'a', 10.0f, (-1.0f), (short) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = gaussianFitter1.fit(parametricUnivariateRealFunction25, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 10.0, -1.0, 100.0, 1.0]");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) (short) -1, (double) 1.0f);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction17 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer18 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter19 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer18);
        gaussianFitter19.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter19.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter19.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter19.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray32 = parameterGuesser31.guess();
        double[] doubleArray33 = parameterGuesser31.guess();
        double[] doubleArray34 = parameterGuesser31.guess();
        double[] doubleArray35 = parameterGuesser31.guess();
        double[] doubleArray36 = parameterGuesser31.guess();
        double[] doubleArray37 = parameterGuesser31.guess();
        double[] doubleArray38 = parameterGuesser31.guess();
        double[] doubleArray39 = parameterGuesser31.guess();
        double[] doubleArray40 = parameterGuesser31.guess();
        double[] doubleArray41 = parameterGuesser31.guess();
        double[] doubleArray42 = parameterGuesser31.guess();
        double[] doubleArray43 = parameterGuesser31.guess();
        double[] doubleArray44 = parameterGuesser31.guess();
        double[] doubleArray45 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray46 = gaussianFitter1.fit((int) 'a', parametricUnivariateRealFunction17, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction17 = null;
        double[] doubleArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = gaussianFitter1.fit(100, parametricUnivariateRealFunction17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass13 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) (short) 100, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction23 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer24 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter25 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer24);
        gaussianFitter25.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter25.clearObservations();
        gaussianFitter25.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter25.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        gaussianFitter25.addObservedPoint((double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = gaussianFitter25.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray41);
        double[] doubleArray43 = parameterGuesser42.guess();
        double[] doubleArray44 = parameterGuesser42.guess();
        double[] doubleArray45 = parameterGuesser42.guess();
        double[] doubleArray46 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = gaussianFitter1.fit((int) '#', parametricUnivariateRealFunction23, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 10.0, 13.164487904464295]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 10.0, 13.164487904464295]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 10.0, 13.164487904464295]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 10.0, 13.164487904464295]");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 0.0f, (double) 0);
        gaussianFitter1.addObservedPoint(1.0d, (double) 100L, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 0L);
        gaussianFitter1.addObservedPoint((double) 10, (double) 1, (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (-1L), 1.0d);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 0.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (byte) -1);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint(1.0d, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 10, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 'a');
        java.lang.Class<?> wildcardClass30 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', 100.0d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass20 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) 100, (double) 0L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) (-1L));
        gaussianFitter1.addObservedPoint(0.0d, (double) ' ');
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer17 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter18 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer17);
        gaussianFitter18.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter18.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter18.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter18.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        double[] doubleArray34 = parameterGuesser30.guess();
        double[] doubleArray35 = parameterGuesser30.guess();
        double[] doubleArray36 = parameterGuesser30.guess();
        double[] doubleArray37 = parameterGuesser30.guess();
        double[] doubleArray38 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = gaussianFitter1.fit(doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) 0, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(1.0d, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (-1.0f), 100.0d, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) -1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 100L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 100.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer31 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter32 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer31);
        gaussianFitter32.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter32.clearObservations();
        gaussianFitter32.addObservedPoint((double) (byte) -1, (double) (-1));
        gaussianFitter32.addObservedPoint((double) (short) 100, (double) 100L, (double) 100L);
        gaussianFitter32.addObservedPoint(0.0d, 10.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray49 = gaussianFitter32.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray49);
        double[] doubleArray51 = parameterGuesser50.guess();
        double[] doubleArray52 = parameterGuesser50.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray53 = gaussianFitter1.fit(doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 100.0, 42.89075091454496]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0, 42.89075091454496]");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1, 100.0d, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 100, (double) 1);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, 0.0d, (double) (short) 100);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint(10.0d, (double) '4');
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 1L, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) '#');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10, (double) (short) 100);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer30 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter31 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer30);
        gaussianFitter31.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter31.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter31.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = gaussianFitter31.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray42);
        double[] doubleArray44 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray45 = gaussianFitter1.fit(doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) 100);
        gaussianFitter1.addObservedPoint(0.0d, (-1.0d), (double) 'a');
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, 100.0d, (double) (byte) 100);
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 10);
        gaussianFitter1.addObservedPoint(100.0d, (double) (short) 10, (double) (short) 100);
        gaussianFitter1.addObservedPoint(0.0d, 10.0d);
        gaussianFitter1.addObservedPoint(1.0d, (double) 10L, (double) (byte) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint(10.0d, (double) '4');
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 1L, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 100, (double) (-1));
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 100.0f, (double) (short) 100);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction32 = null;
        double[] doubleArray33 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit((int) (short) 10, parametricUnivariateRealFunction32, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) (short) 100, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) 0, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 0);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) 0, (double) '4', 0.0d);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) '#');
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 0.0f, (double) 0);
        gaussianFitter1.addObservedPoint(1.0d, (double) 100L, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, 100.0d, (double) '4');
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction18 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer19 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter20 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer19);
        gaussianFitter20.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter20.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter20.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = gaussianFitter1.fit(parametricUnivariateRealFunction18, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) 100, (double) 0L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 0.0f, (double) (short) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(10.0d, (double) 100L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (byte) -1, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction16 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer17 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter18 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer17);
        gaussianFitter18.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter18.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter18.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter18.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray33 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit(parametricUnivariateRealFunction16, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 0.0, 42.466090014400955]");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction13 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer14 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter15 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer14);
        gaussianFitter15.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter15.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter15.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter15.getObservations();
        gaussianFitter15.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter15.addObservedPoint(weightedObservedPoint28);
        gaussianFitter15.addObservedPoint((double) (short) 10, (double) 10L, (-1.0d));
        gaussianFitter15.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter15.getObservations();
        gaussianFitter15.addObservedPoint((double) 100.0f, (double) (-1.0f));
        gaussianFitter15.addObservedPoint((double) (-1), (double) 'a');
        gaussianFitter15.addObservedPoint((double) (byte) 10, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray45);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray48 = parameterGuesser47.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = gaussianFitter1.fit(parametricUnivariateRealFunction13, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[97.0, -1.0, 42.89075091454496]");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 10L, (-1.0d));
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f, (double) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.addObservedPoint((double) 100.0f, 100.0d, (double) (byte) 100);
        gaussianFitter1.addObservedPoint(0.0d, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 0.0f, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        gaussianFitter1.addObservedPoint((double) 0, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction13 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer14 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter15 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer14);
        gaussianFitter15.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter15.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter15.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        double[] doubleArray29 = parameterGuesser28.guess();
        double[] doubleArray30 = parameterGuesser28.guess();
        double[] doubleArray31 = parameterGuesser28.guess();
        double[] doubleArray32 = parameterGuesser28.guess();
        double[] doubleArray33 = parameterGuesser28.guess();
        double[] doubleArray34 = parameterGuesser28.guess();
        double[] doubleArray35 = parameterGuesser28.guess();
        double[] doubleArray36 = parameterGuesser28.guess();
        double[] doubleArray37 = parameterGuesser28.guess();
        double[] doubleArray38 = parameterGuesser28.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = gaussianFitter1.fit(parametricUnivariateRealFunction13, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 10L, (-1.0d));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) '#');
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (byte) 100);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction28 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer29 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter30 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer29);
        gaussianFitter30.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint34 = null;
        gaussianFitter30.addObservedPoint(weightedObservedPoint34);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint36 = null;
        gaussianFitter30.addObservedPoint(weightedObservedPoint36);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter30.getObservations();
        gaussianFitter30.addObservedPoint((double) 10.0f, (double) 10.0f);
        gaussianFitter30.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = gaussianFitter30.getObservations();
        gaussianFitter30.addObservedPoint((double) 0, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = gaussianFitter30.getObservations();
        gaussianFitter30.addObservedPoint((double) (byte) 100, (double) 1L, (double) 'a');
        gaussianFitter30.addObservedPoint((double) 10, (double) (short) 10, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray56 = gaussianFitter30.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser57 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray56);
        double[] doubleArray58 = parameterGuesser57.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray59 = gaussianFitter1.fit((int) (byte) 100, parametricUnivariateRealFunction28, doubleArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(weightedObservedPointArray56);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[97.0, 1.0, 3.0325031511631857]");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction11 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer12 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter13 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer12);
        gaussianFitter13.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter13.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter13.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter13.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        double[] doubleArray27 = parameterGuesser26.guess();
        double[] doubleArray28 = parameterGuesser26.guess();
        double[] doubleArray29 = parameterGuesser26.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = gaussianFitter1.fit(parametricUnivariateRealFunction11, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 0.0, 42.466090014400955]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 0.0, 42.466090014400955]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 0.0, 42.466090014400955]");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f, (double) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 10.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter21.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter21.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray37 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = gaussianFitter1.fit((int) 'a', parametricUnivariateRealFunction19, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) 0, (double) (-1L), (double) (byte) -1);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction17 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer18 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter19 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer18);
        gaussianFitter19.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter19.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter19.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter19.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = gaussianFitter1.fit(0, parametricUnivariateRealFunction17, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 0.0, 42.466090014400955]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 0.0, 42.466090014400955]");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) (-1), (double) 0.0f, 100.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction21 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer22 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter23 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer22);
        gaussianFitter23.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter23.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter23.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter23.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        double[] doubleArray40 = parameterGuesser36.guess();
        double[] doubleArray41 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = gaussianFitter1.fit((int) (byte) 10, parametricUnivariateRealFunction21, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray18);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray18);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray18);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser22 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray18);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = parameterGuesser22.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((-1.0d), 100.0d, (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser17 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray16);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser18 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray16);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = parameterGuesser18.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 100.0f);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 0.0f, (-1.0d), (double) (short) -1);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 100, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint((double) '4', (double) ' ');
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction23 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer24 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter25 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer24);
        gaussianFitter25.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter25.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter25.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter25.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray40 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit(parametricUnivariateRealFunction23, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 0.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) ' ', 1.0d);
        gaussianFitter1.addObservedPoint(100.0d, (double) '4');
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 100, (double) 10L);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1L, 100.0d, (double) (byte) 100);
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 10);
        gaussianFitter1.addObservedPoint(100.0d, (double) (short) 10, (double) (short) 100);
        gaussianFitter1.addObservedPoint(0.0d, 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction38 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer39 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter40 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer39);
        gaussianFitter40.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter40.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter40.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray51 = gaussianFitter40.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser52 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray51);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser53 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray51);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser54 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray51);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser55 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray51);
        double[] doubleArray56 = parameterGuesser55.guess();
        double[] doubleArray57 = parameterGuesser55.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray58 = gaussianFitter1.fit(1, parametricUnivariateRealFunction38, doubleArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray51);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f, (double) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 0.0f, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(1.0d, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) 'a', 0.0d);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (-1L), (double) (-1L));
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, 0.0d);
        gaussianFitter1.addObservedPoint((double) 10, (double) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction21 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer22 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter23 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer22);
        gaussianFitter23.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter23.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter23.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = gaussianFitter23.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = gaussianFitter1.fit(parametricUnivariateRealFunction21, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        gaussianFitter1.addObservedPoint((double) 10, (double) (short) 1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction20 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter22.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter22.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        double[] doubleArray39 = parameterGuesser34.guess();
        double[] doubleArray40 = parameterGuesser34.guess();
        double[] doubleArray41 = parameterGuesser34.guess();
        double[] doubleArray42 = parameterGuesser34.guess();
        double[] doubleArray43 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = gaussianFitter1.fit(parametricUnivariateRealFunction20, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) (-1));
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1L, 0.0d);
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 0L, (double) 10.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint32 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint32);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 100.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint(1.0d, (double) (-1L));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '4', (double) 0L, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint(10.0d, (double) '4');
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 1L, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) 0, (double) (short) 100);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer28 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter29 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer28);
        gaussianFitter29.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter29.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter29.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = gaussianFitter29.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray40);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray43 = parameterGuesser42.guess();
        double[] doubleArray44 = parameterGuesser42.guess();
        double[] doubleArray45 = parameterGuesser42.guess();
        double[] doubleArray46 = parameterGuesser42.guess();
        double[] doubleArray47 = parameterGuesser42.guess();
        double[] doubleArray48 = parameterGuesser42.guess();
        double[] doubleArray49 = parameterGuesser42.guess();
        double[] doubleArray50 = parameterGuesser42.guess();
        double[] doubleArray51 = parameterGuesser42.guess();
        double[] doubleArray52 = parameterGuesser42.guess();
        double[] doubleArray53 = parameterGuesser42.guess();
        double[] doubleArray54 = parameterGuesser42.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray55 = gaussianFitter1.fit(doubleArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) 10, (double) 10.0f);
        gaussianFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray7 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f, (double) 10);
        gaussianFitter1.addObservedPoint((-1.0d), (double) (byte) 0, (-1.0d));
        java.lang.Class<?> wildcardClass16 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 10L, (-1.0d));
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 10.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 100);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction9 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer10 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter11 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer10);
        gaussianFitter11.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter11.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter11.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter11.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        double[] doubleArray24 = parameterGuesser23.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = gaussianFitter1.fit((int) (short) 0, parametricUnivariateRealFunction9, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) -1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass28 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 0L);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction15 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer16 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter17 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer16);
        gaussianFitter17.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter17.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter17.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter17.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
        double[] doubleArray30 = parameterGuesser29.guess();
        double[] doubleArray31 = parameterGuesser29.guess();
        double[] doubleArray32 = parameterGuesser29.guess();
        double[] doubleArray33 = parameterGuesser29.guess();
        double[] doubleArray34 = parameterGuesser29.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = gaussianFitter1.fit((-1), parametricUnivariateRealFunction15, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 'a', (double) (byte) -1, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint26);
        gaussianFitter1.addObservedPoint((double) (short) 1, (-1.0d));
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser13 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray12);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray12);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray12);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray12);
        double[] doubleArray17 = parameterGuesser16.guess();
        double[] doubleArray18 = parameterGuesser16.guess();
        double[] doubleArray19 = parameterGuesser16.guess();
        double[] doubleArray20 = parameterGuesser16.guess();
        double[] doubleArray21 = parameterGuesser16.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 13.589148804608305]");
    }
}

