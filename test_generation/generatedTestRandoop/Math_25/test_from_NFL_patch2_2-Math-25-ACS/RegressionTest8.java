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
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 1L, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(0.0d, (double) '#');
        harmonicFitter1.addObservedPoint((double) '#', (double) (short) 100);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) (byte) -1, (double) 100);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 10L);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        harmonicFitter1.addObservedPoint((double) 1L, 100.0d, (double) (byte) 100);
        harmonicFitter1.addObservedPoint((double) 10.0f, 0.0d);
        harmonicFitter1.addObservedPoint((double) 'a', (double) 100.0f, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) '4', (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 1L, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(0.0d, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser30 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) '#', (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        harmonicFitter1.addObservedPoint(0.0d, (double) 1.0f, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) 1L, (double) (-1.0f));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) 100, 100.0d, (double) 100);
        harmonicFitter1.addObservedPoint((double) 1, 0.0d, (double) 100L);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric26 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer27 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer27);
        harmonicFitter28.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        harmonicFitter28.addObservedPoint((double) 1L, 100.0d, (double) (byte) 100);
        harmonicFitter28.addObservedPoint((double) 10.0f, 0.0d);
        harmonicFitter28.addObservedPoint((double) 'a', (double) 100.0f, (double) (-1.0f));
        harmonicFitter28.addObservedPoint((double) '4', (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = harmonicFitter28.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray47);
        double[] doubleArray49 = parameterGuesser48.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = harmonicFitter1.fit(parametric26, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[NaN, NaN, NaN]");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 1L, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(0.0d, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint26);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric29 = null;
        double[] doubleArray30 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = harmonicFitter1.fit(parametric29, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 100L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer23 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer23);
        harmonicFitter24.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        harmonicFitter24.addObservedPoint(weightedObservedPoint28);
        harmonicFitter24.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint31 = null;
        harmonicFitter24.addObservedPoint(weightedObservedPoint31);
        harmonicFitter24.clearObservations();
        harmonicFitter24.clearObservations();
        harmonicFitter24.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter24.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter24.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter24.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray49 = harmonicFitter24.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser50 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray49);
        double[] doubleArray51 = parameterGuesser50.guess();
        double[] doubleArray52 = parameterGuesser50.guess();
        double[] doubleArray53 = parameterGuesser50.guess();
        double[] doubleArray54 = parameterGuesser50.guess();
        double[] doubleArray55 = parameterGuesser50.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray56 = harmonicFitter1.fit(doubleArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[45.0, 0.06283185307179587, -1.0674172227015877]");
    }
}

