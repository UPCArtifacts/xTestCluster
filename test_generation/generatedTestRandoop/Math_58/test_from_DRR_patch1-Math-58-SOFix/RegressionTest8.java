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
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) 'a');
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter22.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter22.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        double[] doubleArray40 = parameterGuesser35.guess();
        double[] doubleArray41 = parameterGuesser35.guess();
        double[] doubleArray42 = parameterGuesser35.guess();
        double[] doubleArray43 = parameterGuesser35.guess();
        double[] doubleArray44 = parameterGuesser35.guess();
        double[] doubleArray45 = parameterGuesser35.guess();
        double[] doubleArray46 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = gaussianFitter1.fit(doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 1L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction5 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer6 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter7 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer6);
        gaussianFitter7.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter7.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter7.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter7.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray18);
        double[] doubleArray20 = parameterGuesser19.guess();
        double[] doubleArray21 = parameterGuesser19.guess();
        double[] doubleArray22 = parameterGuesser19.guess();
        double[] doubleArray23 = parameterGuesser19.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = gaussianFitter1.fit(parametricUnivariateRealFunction5, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 100L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 1L, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 100);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (byte) -1, (double) 100L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 0.0f, (double) 0);
        gaussianFitter1.addObservedPoint(1.0d, (double) 100L, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 0L);
        gaussianFitter1.addObservedPoint((double) 10, (double) 1, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 1.0f, (double) '4');
        java.lang.Class<?> wildcardClass22 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(wildcardClass22);
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
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 10.0f);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction22 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer23 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter24 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer23);
        gaussianFitter24.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter24.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter24.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter24.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        double[] doubleArray43 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = gaussianFitter1.fit((int) (byte) -1, parametricUnivariateRealFunction22, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
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
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10, 1.0d, (double) 'a');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 1, (double) (short) 100);
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) 0);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer29 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter30 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer29);
        gaussianFitter30.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter30.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter30.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = gaussianFitter30.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray41);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray41);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        double[] doubleArray46 = parameterGuesser43.guess();
        double[] doubleArray47 = parameterGuesser43.guess();
        double[] doubleArray48 = parameterGuesser43.guess();
        double[] doubleArray49 = parameterGuesser43.guess();
        double[] doubleArray50 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = gaussianFitter1.fit(doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
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
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 10.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass16 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass11 = weightedObservedPointArray10.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint29);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction31 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer32 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter33 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer32);
        gaussianFitter33.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter33.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter33.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = gaussianFitter33.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray44);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray47 = parameterGuesser46.guess();
        double[] doubleArray48 = parameterGuesser46.guess();
        double[] doubleArray49 = parameterGuesser46.guess();
        double[] doubleArray50 = parameterGuesser46.guess();
        double[] doubleArray51 = parameterGuesser46.guess();
        double[] doubleArray52 = parameterGuesser46.guess();
        double[] doubleArray53 = parameterGuesser46.guess();
        double[] doubleArray54 = parameterGuesser46.guess();
        double[] doubleArray55 = parameterGuesser46.guess();
        double[] doubleArray56 = parameterGuesser46.guess();
        double[] doubleArray57 = parameterGuesser46.guess();
        double[] doubleArray58 = parameterGuesser46.guess();
        double[] doubleArray59 = parameterGuesser46.guess();
        double[] doubleArray60 = parameterGuesser46.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray61 = gaussianFitter1.fit(parametricUnivariateRealFunction31, doubleArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
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
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter22.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter22.addObservedPoint(weightedObservedPoint28);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter22.getObservations();
        gaussianFitter22.addObservedPoint((double) 10.0f, (double) 10.0f);
        gaussianFitter22.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter22.getObservations();
        gaussianFitter22.addObservedPoint((double) 0, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = gaussianFitter22.getObservations();
        gaussianFitter22.addObservedPoint((double) (byte) 100, (double) 1L, (double) 'a');
        gaussianFitter22.addObservedPoint((double) 10, (double) (short) 10, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray50 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = gaussianFitter1.fit(doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 1.0, 3.0325031511631857]");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.addObservedPoint((-1.0d), (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        java.lang.Class<?> wildcardClass24 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) (byte) 100, (double) '4');
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 0.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        gaussianFitter1.addObservedPoint((double) ' ', (double) 100.0f, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) '#', (double) (byte) 1);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (byte) -1, (double) 100L);
        gaussianFitter1.addObservedPoint((double) '4', (double) 0);
        gaussianFitter1.addObservedPoint(0.0d, (double) ' ', (double) 1L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction28 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer29 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter30 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer29);
        gaussianFitter30.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter30.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter30.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = gaussianFitter30.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser42 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray41);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray41);
        double[] doubleArray44 = parameterGuesser43.guess();
        double[] doubleArray45 = parameterGuesser43.guess();
        double[] doubleArray46 = parameterGuesser43.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = gaussianFitter1.fit((-1), parametricUnivariateRealFunction28, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 10, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = parameterGuesser25.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
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
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint(1.0d, 10.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) 100, (double) 100.0f, (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass11 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) ' ', (double) (byte) 0);
        gaussianFitter1.addObservedPoint((-1.0d), (double) 1, 10.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (byte) 0);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint4);
        gaussianFitter1.addObservedPoint(100.0d, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 1L);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) -1, (double) (-1));
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer23 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter24 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer23);
        gaussianFitter24.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter24.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter24.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter24.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit(doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 13.589148804608305]");
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
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint(10.0d, (double) '4');
        gaussianFitter1.addObservedPoint((double) 0, (double) (byte) -1, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        gaussianFitter1.addObservedPoint((double) 0.0f, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0, (double) (-1.0f));
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction32 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer33 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter34 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer33);
        gaussianFitter34.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter34.clearObservations();
        gaussianFitter34.addObservedPoint((double) (byte) -1, (double) (-1));
        gaussianFitter34.addObservedPoint((double) (short) 100, (double) 100L, (double) 100L);
        gaussianFitter34.addObservedPoint(0.0d, 10.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray51 = gaussianFitter34.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser52 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray51);
        double[] doubleArray53 = parameterGuesser52.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = gaussianFitter1.fit(parametricUnivariateRealFunction32, doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 100.0, 42.89075091454496]");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 100L, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 'a');
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 0.0f);
        gaussianFitter1.addObservedPoint(0.0d, 10.0d);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 0, (double) (short) 0);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass21 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint26);
        gaussianFitter1.addObservedPoint((double) '#', (double) (-1), (double) 1.0f);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction33 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer34 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter35 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer34);
        gaussianFitter35.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter35.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint42 = null;
        gaussianFitter35.addObservedPoint(weightedObservedPoint42);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint44 = null;
        gaussianFitter35.addObservedPoint(weightedObservedPoint44);
        gaussianFitter35.addObservedPoint((double) 0L, (double) 0.0f, (double) (short) 1);
        gaussianFitter35.clearObservations();
        gaussianFitter35.addObservedPoint((double) 10, (double) 1L);
        gaussianFitter35.addObservedPoint(0.0d, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray57 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray58 = gaussianFitter35.getObservations();
        gaussianFitter35.addObservedPoint(1.0d, (double) (byte) -1, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray63 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser64 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray63);
        double[] doubleArray65 = parameterGuesser64.guess();
        double[] doubleArray66 = parameterGuesser64.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray67 = gaussianFitter1.fit((-1), parametricUnivariateRealFunction33, doubleArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray57);
        org.junit.Assert.assertNotNull(weightedObservedPointArray58);
        org.junit.Assert.assertNotNull(weightedObservedPointArray63);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, -1.0, 4.671269901584105]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, -1.0, 4.671269901584105]");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 1);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction26 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer27 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter28 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer27);
        gaussianFitter28.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter28.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter28.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = gaussianFitter28.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray39);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray39);
        double[] doubleArray42 = parameterGuesser41.guess();
        double[] doubleArray43 = parameterGuesser41.guess();
        double[] doubleArray44 = parameterGuesser41.guess();
        double[] doubleArray45 = parameterGuesser41.guess();
        double[] doubleArray46 = parameterGuesser41.guess();
        double[] doubleArray47 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = gaussianFitter1.fit(parametricUnivariateRealFunction26, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 13.589148804608305]");
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
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        java.lang.Class<?> wildcardClass19 = weightedObservedPointArray16.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        gaussianFitter1.addObservedPoint((double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction20 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter22.clearObservations();
        gaussianFitter22.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter22.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        gaussianFitter22.addObservedPoint((double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit((int) (byte) 10, parametricUnivariateRealFunction20, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 10.0, 13.164487904464295]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 10.0, 13.164487904464295]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0, 13.164487904464295]");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) 100, 1.0d, (double) 100.0f);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (-1L), 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 100L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 1L, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, 1.0d, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        gaussianFitter1.addObservedPoint((double) (short) 10, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 0, (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (-1L), 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction23 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer24 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter25 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer24);
        gaussianFitter25.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter25.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter25.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter25.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        double[] doubleArray41 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = gaussianFitter1.fit(parametricUnivariateRealFunction23, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f, (double) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 'a');
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
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
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) (byte) 0, (double) (byte) 100);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint(100.0d, (double) 10.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '#', 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        java.lang.Class<?> wildcardClass23 = weightedObservedPointArray22.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
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
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10, 1.0d, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 100);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 0L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 10.0f, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.clearObservations();
        double[] doubleArray23 = new double[] { (-1.0f), ' ', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = gaussianFitter1.fit(doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 32.0, 100.0]");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        gaussianFitter1.addObservedPoint((double) 1.0f, 0.0d, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) ' ', (double) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction24 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer25 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter26 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer25);
        gaussianFitter26.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter26.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter26.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = gaussianFitter26.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray41 = parameterGuesser40.guess();
        double[] doubleArray42 = parameterGuesser40.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit(100, parametricUnivariateRealFunction24, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 13.589148804608305]");
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
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint(10.0d, (double) '4');
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 1L, (double) 1L);
        gaussianFitter1.addObservedPoint((double) 'a', (double) '#');
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (-1L), 1.0d);
        gaussianFitter1.addObservedPoint((double) 1L, (double) '4', (double) (byte) 100);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter21.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter21.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        double[] doubleArray36 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit(parametricUnivariateRealFunction19, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        gaussianFitter1.addObservedPoint((double) (-1), (double) 'a');
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) '#', (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) (-1L), 10.0d, (double) 10);
        gaussianFitter1.addObservedPoint(1.0d, (double) (short) 1, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1), (double) '#');
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) 1);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser13 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray12);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray12);
        double[] doubleArray15 = parameterGuesser14.guess();
        double[] doubleArray16 = parameterGuesser14.guess();
        double[] doubleArray17 = parameterGuesser14.guess();
        java.lang.Class<?> wildcardClass18 = doubleArray17.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 0.0, 42.466090014400955]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 0.0, 42.466090014400955]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 0.0, 42.466090014400955]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser22 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray21);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray21);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser24 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser24 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray23);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray23);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = parameterGuesser25.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
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
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), 1.0d, 0.0d);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter21.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter21.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        double[] doubleArray36 = parameterGuesser33.guess();
        double[] doubleArray37 = parameterGuesser33.guess();
        double[] doubleArray38 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = gaussianFitter1.fit((int) (short) 100, parametricUnivariateRealFunction19, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
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
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        gaussianFitter1.addObservedPoint((double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) 0);
        gaussianFitter1.addObservedPoint((double) 0, (-1.0d));
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) '#');
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        gaussianFitter1.addObservedPoint(100.0d, (double) '#', 100.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) '4', (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 10.0f, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
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
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer10 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter11 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer10);
        gaussianFitter11.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter11.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter11.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter11.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        double[] doubleArray24 = parameterGuesser23.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = gaussianFitter1.fit(doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 0.0, 42.466090014400955]");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        gaussianFitter1.addObservedPoint((double) 1L, (double) 1, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1.0f), (double) 1);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) 10L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) 1L, (double) 0);
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass17 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10, 1.0d, (double) 'a');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 1, (double) (short) 100);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 'a', (double) '4');
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 10, 0.0d, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) 0, (double) (-1L), (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (-1L), (double) 100.0f);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (byte) -1);
        gaussianFitter1.addObservedPoint(10.0d, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 100L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 1L, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 1);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 10, (double) (byte) 100);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (byte) 0, 1.0d);
        gaussianFitter1.addObservedPoint((double) 0, (double) 100.0f, (double) (short) 10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(100.0d, (double) (byte) 10, (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) (byte) -1, (double) 10.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        gaussianFitter1.addObservedPoint(0.0d, (double) 1.0f, (double) 10);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) 10, (double) 100.0f, (double) (byte) 10);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) 0, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) '4');
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) 1, 10.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) 10.0f, 0.0d, 0.0d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        gaussianFitter1.addObservedPoint((double) (short) 10, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 0, (double) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction26 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer27 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter28 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer27);
        gaussianFitter28.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter28.addObservedPoint((double) (short) 10, (double) 0, (double) 10.0f);
        gaussianFitter28.addObservedPoint((double) 1.0f, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray39 = gaussianFitter28.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = gaussianFitter28.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray42 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit(0, parametricUnivariateRealFunction26, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray39);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 0);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 0);
        gaussianFitter1.addObservedPoint((double) 10.0f, 0.0d);
        gaussianFitter1.addObservedPoint(0.0d, (double) '4', (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(10.0d, (double) 0L);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) '4');
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) 1.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        gaussianFitter1.addObservedPoint((double) 'a', (double) 0.0f, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction14 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter16.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter16.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = gaussianFitter1.fit((int) (short) 10, parametricUnivariateRealFunction14, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (-1L), 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) (short) 0);
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        gaussianFitter1.addObservedPoint((double) 'a', (double) 0.0f, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray15);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = parameterGuesser16.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 100.0f);
        gaussianFitter1.addObservedPoint((double) 100L, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(1.0d, (double) 100.0f);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction19 = null;
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = gaussianFitter1.fit(parametricUnivariateRealFunction19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        gaussianFitter1.addObservedPoint((double) 10, (double) 1L);
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (-1));
        gaussianFitter1.addObservedPoint((double) 10, (double) '#', (double) (short) 100);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction35 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer36 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter37 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer36);
        gaussianFitter37.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter37.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter37.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = gaussianFitter37.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray48);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray51 = parameterGuesser50.guess();
        double[] doubleArray52 = parameterGuesser50.guess();
        double[] doubleArray53 = parameterGuesser50.guess();
        double[] doubleArray54 = parameterGuesser50.guess();
        double[] doubleArray55 = parameterGuesser50.guess();
        double[] doubleArray56 = parameterGuesser50.guess();
        double[] doubleArray57 = parameterGuesser50.guess();
        double[] doubleArray58 = parameterGuesser50.guess();
        double[] doubleArray59 = parameterGuesser50.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray60 = gaussianFitter1.fit(10, parametricUnivariateRealFunction35, doubleArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.addObservedPoint((double) 1, (double) 1.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) (-1L));
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint32 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint32);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer34 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter35 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer34);
        gaussianFitter35.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter35.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter35.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray46 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray46);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray46);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray46);
        double[] doubleArray50 = parameterGuesser49.guess();
        double[] doubleArray51 = parameterGuesser49.guess();
        double[] doubleArray52 = parameterGuesser49.guess();
        double[] doubleArray53 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = gaussianFitter1.fit(doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray46);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction20 = null;
        double[] doubleArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = gaussianFitter1.fit(parametricUnivariateRealFunction20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 100, (double) (-1.0f));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) 10L, (double) (short) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((-1.0d), (double) 0L);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction29 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer30 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter31 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer30);
        gaussianFitter31.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter31.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter31.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = gaussianFitter31.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray42);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser44 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray42);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray42);
        double[] doubleArray46 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = gaussianFitter1.fit(parametricUnivariateRealFunction29, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 0.0, 42.466090014400955]");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction17 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer18 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter19 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer18);
        gaussianFitter19.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter19.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter19.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter19.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray33 = parameterGuesser32.guess();
        double[] doubleArray34 = parameterGuesser32.guess();
        double[] doubleArray35 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = gaussianFitter1.fit((-1), parametricUnivariateRealFunction17, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, 0.0d, (double) (short) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1), (double) ' ', (double) (-1));
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) -1, (double) 10.0f, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        gaussianFitter1.addObservedPoint(100.0d, (double) '#', 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (-1.0f), (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint29);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 10L, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction23 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer24 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter25 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer24);
        gaussianFitter25.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter25.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter25.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter25.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        double[] doubleArray43 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = gaussianFitter1.fit(parametricUnivariateRealFunction23, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
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
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (-1L), 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (-1));
        gaussianFitter1.addObservedPoint((double) '4', (double) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        gaussianFitter1.addObservedPoint((double) (-1L), 0.0d, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 100, (double) 1);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter16.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter16.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray32 = parameterGuesser31.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = gaussianFitter1.fit(doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
        gaussianFitter1.addObservedPoint(1.0d, (double) 10L, (-1.0d));
        gaussianFitter1.addObservedPoint((double) 0L, 1.0d, (double) (-1));
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
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
        gaussianFitter1.addObservedPoint((double) 10, (double) 10L);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(10.0d, (double) (short) 1);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer37 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter38 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer37);
        gaussianFitter38.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter38.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter38.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray49 = gaussianFitter38.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray49);
        double[] doubleArray51 = parameterGuesser50.guess();
        double[] doubleArray52 = parameterGuesser50.guess();
        double[] doubleArray53 = parameterGuesser50.guess();
        double[] doubleArray54 = parameterGuesser50.guess();
        double[] doubleArray55 = parameterGuesser50.guess();
        double[] doubleArray56 = parameterGuesser50.guess();
        double[] doubleArray57 = parameterGuesser50.guess();
        double[] doubleArray58 = parameterGuesser50.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray59 = gaussianFitter1.fit(doubleArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        gaussianFitter1.addObservedPoint((double) '4', (double) 1, (double) (-1.0f));
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
        double[] doubleArray42 = parameterGuesser36.guess();
        double[] doubleArray43 = parameterGuesser36.guess();
        double[] doubleArray44 = parameterGuesser36.guess();
        double[] doubleArray45 = parameterGuesser36.guess();
        double[] doubleArray46 = parameterGuesser36.guess();
        double[] doubleArray47 = parameterGuesser36.guess();
        double[] doubleArray48 = parameterGuesser36.guess();
        double[] doubleArray49 = parameterGuesser36.guess();
        double[] doubleArray50 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = gaussianFitter1.fit(parametricUnivariateRealFunction21, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
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
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 13.589148804608305]");
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
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        gaussianFitter1.addObservedPoint((double) 10, (double) 1L);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(1.0d, (double) (byte) -1, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray29);
        double[] doubleArray31 = parameterGuesser30.guess();
        double[] doubleArray32 = parameterGuesser30.guess();
        double[] doubleArray33 = parameterGuesser30.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0, 4.671269901584105]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, -1.0, 4.671269901584105]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, -1.0, 4.671269901584105]");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        gaussianFitter1.addObservedPoint((double) 10, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) '#');
        gaussianFitter1.addObservedPoint((double) 1L, (double) 10, (double) 1);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(10.0d, (double) (-1));
        gaussianFitter1.addObservedPoint((double) 0L, (double) 10, 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) 0, (double) (short) 1, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint31 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint31);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint33 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint33);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint35 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint35);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction38 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer39 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter40 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer39);
        gaussianFitter40.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter40.clearObservations();
        gaussianFitter40.addObservedPoint((double) (byte) -1, (double) (-1));
        gaussianFitter40.addObservedPoint((double) (short) 100, (double) 100L, (double) 100L);
        gaussianFitter40.addObservedPoint(0.0d, 10.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray57 = gaussianFitter40.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser58 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray57);
        double[] doubleArray59 = parameterGuesser58.guess();
        double[] doubleArray60 = parameterGuesser58.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray61 = gaussianFitter1.fit(100, parametricUnivariateRealFunction38, doubleArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 100.0, 42.89075091454496]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0, 100.0, 42.89075091454496]");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        gaussianFitter1.addObservedPoint((double) (-1), (double) ' ', (double) 100);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter22.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter22.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit(doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0L);
        java.lang.Class<?> wildcardClass18 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint((double) '#', (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction25 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer26 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter27 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer26);
        gaussianFitter27.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter27.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter27.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = gaussianFitter27.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser40 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray42 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit(parametricUnivariateRealFunction25, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 100L, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 'a');
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (-1L), 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) 100.0f, 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 0.0f, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10L, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(1.0d, (double) 10.0f, (double) 1.0f);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1L), 100.0d);
        double[] doubleArray34 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = gaussianFitter1.fit(doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 10L, (double) ' ');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        gaussianFitter1.addObservedPoint((double) 'a', (double) 0.0f, (double) (byte) 1);
        gaussianFitter1.addObservedPoint((double) 100, (double) (short) -1, (double) (byte) -1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction20 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter22.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter22.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        double[] doubleArray40 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit(parametricUnivariateRealFunction20, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
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
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        gaussianFitter1.addObservedPoint((double) '#', (double) 1, 0.0d);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction30 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer31 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter32 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer31);
        gaussianFitter32.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter32.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter32.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = gaussianFitter32.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser44 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray43);
        double[] doubleArray45 = parameterGuesser44.guess();
        double[] doubleArray46 = parameterGuesser44.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = gaussianFitter1.fit((int) '4', parametricUnivariateRealFunction30, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 0.0, 42.466090014400955]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 0.0, 42.466090014400955]");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(10.0d, (double) (-1));
        gaussianFitter1.addObservedPoint((double) 0L, (double) 10, 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) 10, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer34 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter35 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer34);
        gaussianFitter35.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter35.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter35.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray46 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray46);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray46);
        double[] doubleArray49 = parameterGuesser48.guess();
        double[] doubleArray50 = parameterGuesser48.guess();
        double[] doubleArray51 = parameterGuesser48.guess();
        double[] doubleArray52 = parameterGuesser48.guess();
        double[] doubleArray53 = parameterGuesser48.guess();
        double[] doubleArray54 = parameterGuesser48.guess();
        double[] doubleArray55 = parameterGuesser48.guess();
        double[] doubleArray56 = parameterGuesser48.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray57 = gaussianFitter1.fit(doubleArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(weightedObservedPointArray46);
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
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 100L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 1L, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 'a', 1.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (byte) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 100.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray14);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) 0, (double) 10.0f);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser14 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray13);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        gaussianFitter1.addObservedPoint((double) (short) 10, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1, (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint25);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer30 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter31 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer30);
        gaussianFitter31.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter31.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter31.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = gaussianFitter31.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray42);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser44 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray42);
        double[] doubleArray45 = parameterGuesser44.guess();
        double[] doubleArray46 = parameterGuesser44.guess();
        double[] doubleArray47 = parameterGuesser44.guess();
        double[] doubleArray48 = parameterGuesser44.guess();
        double[] doubleArray49 = parameterGuesser44.guess();
        double[] doubleArray50 = parameterGuesser44.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = gaussianFitter1.fit(doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
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
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.addObservedPoint(0.0d, (double) (short) 10, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) '#', (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        java.lang.Class<?> wildcardClass22 = weightedObservedPointArray21.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
        gaussianFitter1.addObservedPoint((double) 0, (double) 0L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction23 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer24 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter25 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer24);
        gaussianFitter25.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter25.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter25.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter25.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        double[] doubleArray43 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray44 = gaussianFitter1.fit((int) (short) -1, parametricUnivariateRealFunction23, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
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
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 0, (-1.0d));
        gaussianFitter1.addObservedPoint((double) (byte) -1, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) 0, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) '4');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (-1.0f));
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction32 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer33 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter34 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer33);
        gaussianFitter34.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter34.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter34.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = gaussianFitter34.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray45);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray48 = parameterGuesser47.guess();
        double[] doubleArray49 = parameterGuesser47.guess();
        double[] doubleArray50 = parameterGuesser47.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = gaussianFitter1.fit((-1), parametricUnivariateRealFunction32, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 10, (double) 1.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray24);
        java.lang.Class<?> wildcardClass27 = weightedObservedPointArray24.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, (double) (short) 0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10.0f, (double) (-1L));
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 1L, (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 10.0d, 100.0d);
        gaussianFitter1.addObservedPoint((double) 100L, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, (double) (short) 0);
        gaussianFitter1.addObservedPoint(1.0d, (double) (byte) 100, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) 0, (double) (short) 100);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint6);
        gaussianFitter1.addObservedPoint((double) 10, (-1.0d));
        gaussianFitter1.addObservedPoint(1.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        gaussianFitter1.addObservedPoint(1.0d, (-1.0d), (double) 100L);
        gaussianFitter1.addObservedPoint((double) (short) 100, 0.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) '#');
        gaussianFitter1.addObservedPoint((double) '#', (double) (byte) 0, (double) 10L);
        gaussianFitter1.addObservedPoint(0.0d, (double) (byte) 1, (double) (byte) 0);
        gaussianFitter1.addObservedPoint((double) '#', (double) (byte) 100, (double) '#');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser22 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray21);
        java.lang.Class<?> wildcardClass23 = parameterGuesser22.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
        gaussianFitter1.addObservedPoint((double) ' ', 0.0d, (double) (byte) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser24 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 100, (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(100.0d, (double) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray29 = gaussianFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray29);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (-1L), (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint((double) 100, (double) '#', (double) 100L);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (-1.0f), (double) (-1));
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) 10.0f, (double) 10L);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        gaussianFitter1.addObservedPoint((double) (short) 10, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (short) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        gaussianFitter1.addObservedPoint((double) 1, (double) 10L, 1.0d);
        gaussianFitter1.addObservedPoint((double) 1L, (double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(10.0d, (double) (short) 10, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (byte) 100, 0.0d, (double) 100.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 0L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        gaussianFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) 0L, 0.0d);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction13 = null;
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = gaussianFitter1.fit((int) (short) 10, parametricUnivariateRealFunction13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.addObservedPoint((double) 0L, (double) 0.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) '4');
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction20 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter22.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter22.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray38 = parameterGuesser37.guess();
        double[] doubleArray39 = parameterGuesser37.guess();
        double[] doubleArray40 = parameterGuesser37.guess();
        double[] doubleArray41 = parameterGuesser37.guess();
        double[] doubleArray42 = parameterGuesser37.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray43 = gaussianFitter1.fit(parametricUnivariateRealFunction20, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
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
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 0, 0.0d, (double) (byte) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(10.0d, (double) 1L, (double) 'a');
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        gaussianFitter1.addObservedPoint((double) 100L, (double) ' ', 100.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction18 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer19 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter20 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer19);
        gaussianFitter20.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter20.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter20.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray31 = gaussianFitter20.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray31);
        double[] doubleArray33 = parameterGuesser32.guess();
        double[] doubleArray34 = parameterGuesser32.guess();
        double[] doubleArray35 = parameterGuesser32.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray36 = gaussianFitter1.fit(parametricUnivariateRealFunction18, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray31);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 0.0, 42.466090014400955]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 0.0, 42.466090014400955]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 0.0, 42.466090014400955]");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        gaussianFitter1.addObservedPoint((double) 'a', (double) 100);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) (-1L));
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction33 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer34 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter35 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer34);
        gaussianFitter35.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter35.clearObservations();
        gaussianFitter35.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter35.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        gaussianFitter35.addObservedPoint((double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray51 = gaussianFitter35.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser52 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray51);
        double[] doubleArray53 = parameterGuesser52.guess();
        double[] doubleArray54 = parameterGuesser52.guess();
        double[] doubleArray55 = parameterGuesser52.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray56 = gaussianFitter1.fit(100, parametricUnivariateRealFunction33, doubleArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 10.0, 13.164487904464295]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 10.0, 13.164487904464295]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 10.0, 13.164487904464295]");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction9 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer10 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter11 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer10);
        gaussianFitter11.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter11.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter11.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter11.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        double[] doubleArray24 = parameterGuesser23.guess();
        double[] doubleArray25 = parameterGuesser23.guess();
        double[] doubleArray26 = parameterGuesser23.guess();
        double[] doubleArray27 = parameterGuesser23.guess();
        double[] doubleArray28 = parameterGuesser23.guess();
        double[] doubleArray29 = parameterGuesser23.guess();
        double[] doubleArray30 = parameterGuesser23.guess();
        double[] doubleArray31 = parameterGuesser23.guess();
        double[] doubleArray32 = parameterGuesser23.guess();
        double[] doubleArray33 = parameterGuesser23.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit((int) (byte) -1, parametricUnivariateRealFunction9, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 0.0, 13.589148804608305]");
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
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 0);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint9);
        gaussianFitter1.clearObservations();
        java.lang.Class<?> wildcardClass12 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) 100, (double) 10);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer24 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter25 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer24);
        gaussianFitter25.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter25.clearObservations();
        gaussianFitter25.addObservedPoint((double) (byte) -1, (double) (-1));
        gaussianFitter25.addObservedPoint((double) (short) 100, (double) 100L, (double) 100L);
        gaussianFitter25.addObservedPoint(0.0d, 10.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = gaussianFitter25.getObservations();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 100.0, 42.89075091454496]");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        gaussianFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 'a');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) (short) -1);
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
        double[] doubleArray39 = parameterGuesser35.guess();
        double[] doubleArray40 = parameterGuesser35.guess();
        double[] doubleArray41 = parameterGuesser35.guess();
        double[] doubleArray42 = parameterGuesser35.guess();
        double[] doubleArray43 = parameterGuesser35.guess();
        double[] doubleArray44 = parameterGuesser35.guess();
        double[] doubleArray45 = parameterGuesser35.guess();
        double[] doubleArray46 = parameterGuesser35.guess();
        double[] doubleArray47 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = gaussianFitter1.fit(parametricUnivariateRealFunction21, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer23 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter24 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer23);
        gaussianFitter24.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter24.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter24.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = gaussianFitter24.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray35);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        double[] doubleArray41 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray42 = gaussianFitter1.fit(doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100L, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100L, (double) 1L, (double) '4');
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) (-1));
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 1L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 100L);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) 1L, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser19 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 2 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) 0, (double) '4');
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10L, (double) 1L);
        java.lang.Class<?> wildcardClass15 = gaussianFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 100, (double) 10L, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) 0.0f);
        gaussianFitter1.addObservedPoint((double) '#', 0.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 100.0f);
        gaussianFitter1.addObservedPoint((double) 1.0f, (double) (-1L));
        gaussianFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        gaussianFitter1.addObservedPoint(0.0d, (double) '4', (double) (-1));
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) '4', (double) (byte) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint23);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 0);
        gaussianFitter1.addObservedPoint((double) 10.0f, 0.0d);
        gaussianFitter1.addObservedPoint((double) 0, (double) (-1.0f), (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer14 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter15 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer14);
        gaussianFitter15.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter15.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter15.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter15.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        double[] doubleArray30 = parameterGuesser29.guess();
        double[] doubleArray31 = parameterGuesser29.guess();
        double[] doubleArray32 = parameterGuesser29.guess();
        double[] doubleArray33 = parameterGuesser29.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray34 = gaussianFitter1.fit(doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10, 1.0d, (double) 'a');
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint(0.0d, 0.0d, (double) 1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1, (double) 0L, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 0.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) 0L);
        gaussianFitter1.addObservedPoint((double) 100, (double) (byte) 1);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer30 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter31 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer30);
        gaussianFitter31.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter31.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter31.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray42 = gaussianFitter31.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser43 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray42);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser44 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray42);
        double[] doubleArray45 = parameterGuesser44.guess();
        double[] doubleArray46 = parameterGuesser44.guess();
        double[] doubleArray47 = parameterGuesser44.guess();
        double[] doubleArray48 = parameterGuesser44.guess();
        double[] doubleArray49 = parameterGuesser44.guess();
        double[] doubleArray50 = parameterGuesser44.guess();
        double[] doubleArray51 = parameterGuesser44.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = gaussianFitter1.fit(doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray42);
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
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 100.0f, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) 1L, (double) 1L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((-1.0d), 100.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        gaussianFitter1.addObservedPoint((double) 10, (double) 1.0f, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer10 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter11 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer10);
        gaussianFitter11.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter11.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter11.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = gaussianFitter11.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser23 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray22);
        double[] doubleArray24 = parameterGuesser23.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = gaussianFitter1.fit(doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 0.0, 42.466090014400955]");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) '#');
        gaussianFitter1.addObservedPoint(10.0d, (double) (byte) 0, (double) 1.0f);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction14 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter16.clearObservations();
        gaussianFitter16.addObservedPoint((double) (byte) -1, (double) (-1));
        gaussianFitter16.addObservedPoint((double) (short) 100, (double) 100L, (double) 100L);
        gaussianFitter16.addObservedPoint(0.0d, 10.0d, 0.0d);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray37 = gaussianFitter1.fit((int) '4', parametricUnivariateRealFunction14, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 42.89075091454496]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0, 42.89075091454496]");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        gaussianFitter1.addObservedPoint((double) 100, (double) 10.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray3 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) 100, (double) 0L);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray3);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (byte) 100, (double) 100L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (3)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint((double) 10L, (double) (short) 10, (double) (short) 1);
        gaussianFitter1.addObservedPoint((double) (byte) 1, (double) (-1L), 0.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        gaussianFitter1.addObservedPoint((double) '#', (double) ' ', (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint27);
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) ' ', (double) 1L, (double) (-1.0f));
        gaussianFitter1.addObservedPoint((double) 1, (double) '4');
        gaussianFitter1.addObservedPoint((double) ' ', (double) '4');
        gaussianFitter1.addObservedPoint((double) (short) 10, (double) (byte) 100);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        gaussianFitter1.addObservedPoint(100.0d, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint28);
        gaussianFitter1.addObservedPoint(10.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint33 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint33);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) ' ', (double) (-1L));
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (short) 1, (double) (-1L));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) 10.0f, (double) (short) -1);
        gaussianFitter1.addObservedPoint(0.0d, 1.0d);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) (-1L), (double) 10.0f);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 0);
        gaussianFitter1.addObservedPoint((double) '4', (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction23 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer24 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter25 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer24);
        gaussianFitter25.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        gaussianFitter25.addObservedPoint((double) 0L, (double) 100L);
        gaussianFitter25.addObservedPoint((double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = gaussianFitter25.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = gaussianFitter1.fit(parametricUnivariateRealFunction23, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 0.0, 42.466090014400955]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 0.0, 42.466090014400955]");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        gaussianFitter1.addObservedPoint((double) 10, (double) 10L);
        gaussianFitter1.addObservedPoint((double) (byte) 10, (double) 0);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((-1.0d), (double) (short) 0, (double) (-1));
        gaussianFitter1.addObservedPoint((double) 0L, (double) 100.0f, (double) 10L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint3 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint3);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint5);
        gaussianFitter1.addObservedPoint((double) ' ', (double) 10.0f);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) (byte) 10, (double) (byte) 100);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint17);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) 100L, (double) 100L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser21 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer20 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter21 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer20);
        gaussianFitter21.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter21.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter21.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray32 = gaussianFitter21.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray32);
        double[] doubleArray34 = parameterGuesser33.guess();
        double[] doubleArray35 = parameterGuesser33.guess();
        double[] doubleArray36 = parameterGuesser33.guess();
        double[] doubleArray37 = parameterGuesser33.guess();
        double[] doubleArray38 = parameterGuesser33.guess();
        double[] doubleArray39 = parameterGuesser33.guess();
        double[] doubleArray40 = parameterGuesser33.guess();
        double[] doubleArray41 = parameterGuesser33.guess();
        double[] doubleArray42 = parameterGuesser33.guess();
        double[] doubleArray43 = parameterGuesser33.guess();
        double[] doubleArray44 = parameterGuesser33.guess();
        double[] doubleArray45 = parameterGuesser33.guess();
        double[] doubleArray46 = parameterGuesser33.guess();
        double[] doubleArray47 = parameterGuesser33.guess();
        double[] doubleArray48 = parameterGuesser33.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = gaussianFitter1.fit(doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray32);
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
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint(0.0d, (double) '#');
        gaussianFitter1.addObservedPoint((double) '#', (double) (byte) 0, (double) 10L);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        gaussianFitter1.addObservedPoint((double) 10, (double) (byte) 1);
        gaussianFitter1.addObservedPoint((double) 1, (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint22);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.addObservedPoint(100.0d, (double) 10.0f);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction14 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer15 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter16 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer15);
        gaussianFitter16.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter16.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter16.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray27 = gaussianFitter16.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser28 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray27);
        double[] doubleArray30 = parameterGuesser29.guess();
        double[] doubleArray31 = parameterGuesser29.guess();
        double[] doubleArray32 = parameterGuesser29.guess();
        double[] doubleArray33 = parameterGuesser29.guess();
        double[] doubleArray34 = parameterGuesser29.guess();
        double[] doubleArray35 = parameterGuesser29.guess();
        double[] doubleArray36 = parameterGuesser29.guess();
        double[] doubleArray37 = parameterGuesser29.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = gaussianFitter1.fit(10, parametricUnivariateRealFunction14, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray27);
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
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        gaussianFitter1.clearObservations();
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction17 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer18 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter19 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer18);
        gaussianFitter19.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter19.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter19.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = gaussianFitter19.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser31 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser32 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser33 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray30);
        double[] doubleArray35 = parameterGuesser34.guess();
        double[] doubleArray36 = parameterGuesser34.guess();
        double[] doubleArray37 = parameterGuesser34.guess();
        double[] doubleArray38 = parameterGuesser34.guess();
        double[] doubleArray39 = parameterGuesser34.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = gaussianFitter1.fit(parametricUnivariateRealFunction17, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
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
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) ' ', (double) 1L, (double) (-1.0f));
        gaussianFitter1.addObservedPoint((double) (byte) 0, (double) (-1));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = gaussianFitter1.getObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = gaussianFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = gaussianFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) 10);
        gaussianFitter1.clearObservations();
        gaussianFitter1.addObservedPoint((double) 1L, (double) (-1));
        gaussianFitter1.addObservedPoint((double) 1, 100.0d, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint19);
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer21 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter22 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer21);
        gaussianFitter22.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter22.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter22.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = gaussianFitter22.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser36 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray37 = parameterGuesser36.guess();
        double[] doubleArray38 = parameterGuesser36.guess();
        double[] doubleArray39 = parameterGuesser36.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = gaussianFitter1.fit(doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 13.589148804608305]");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint(0.0d, (double) 0.0f);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) '4', (double) (byte) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint11);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) 10, (double) 0);
        gaussianFitter1.addObservedPoint((double) (short) 1, (double) (short) 10);
        gaussianFitter1.addObservedPoint((double) '#', (double) (short) 0);
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint2);
        gaussianFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint8);
        gaussianFitter1.clearObservations();
        gaussianFitter1.clearObservations();
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        gaussianFitter1.addObservedPoint((double) (short) 10, 0.0d, 0.0d);
        gaussianFitter1.addObservedPoint((double) 100.0f, 0.0d);
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint24);
        gaussianFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter1 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer0);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter1.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = gaussianFitter1.getObservations();
        gaussianFitter1.clearObservations();
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        gaussianFitter1.addObservedPoint(weightedObservedPoint14);
        gaussianFitter1.addObservedPoint(10.0d, (double) 10);
        gaussianFitter1.addObservedPoint((double) ' ', (double) (short) 10, (double) (byte) 1);
        gaussianFitter1.addObservedPoint((double) 10.0f, (double) (short) 0);
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = gaussianFitter1.getObservations();
        gaussianFitter1.addObservedPoint((double) (short) 100, (double) (short) -1);
        org.apache.commons.math.analysis.ParametricUnivariateRealFunction parametricUnivariateRealFunction30 = null;
        org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer31 = null;
        org.apache.commons.math.optimization.fitting.GaussianFitter gaussianFitter32 = new org.apache.commons.math.optimization.fitting.GaussianFitter(differentiableMultivariateVectorialOptimizer31);
        gaussianFitter32.addObservedPoint((double) ' ', (double) (short) -1);
        gaussianFitter32.addObservedPoint((double) (short) 0, (double) 0);
        gaussianFitter32.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray43 = gaussianFitter32.getObservations();
        org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser parameterGuesser44 = new org.apache.commons.math.optimization.fitting.GaussianFitter.ParameterGuesser(weightedObservedPointArray43);
        double[] doubleArray45 = parameterGuesser44.guess();
        double[] doubleArray46 = parameterGuesser44.guess();
        double[] doubleArray47 = parameterGuesser44.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = gaussianFitter1.fit(parametricUnivariateRealFunction30, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
        org.junit.Assert.assertNotNull(weightedObservedPointArray43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 13.589148804608305]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 13.589148804608305]");
    }
}

