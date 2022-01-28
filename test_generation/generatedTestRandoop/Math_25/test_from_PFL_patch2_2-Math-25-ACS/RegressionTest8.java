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
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 1L, 1.0d);
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) '4');
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (-1L), 100.0d);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) ' ', (double) (byte) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric25 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer26 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer26);
        harmonicFitter27.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter27.addObservedPoint((double) (short) 1, (double) (-1L));
        harmonicFitter27.addObservedPoint((double) (byte) 1, (double) 1, (double) 100);
        harmonicFitter27.addObservedPoint((double) 'a', (double) '4', (double) (byte) 0);
        harmonicFitter27.addObservedPoint((double) '#', (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray47 = parameterGuesser46.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(parametric25, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[NaN, NaN, NaN]");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) (short) 1);
        harmonicFitter1.addObservedPoint(1.0d, 0.0d, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 10, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer20 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter21 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer20);
        harmonicFitter21.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        harmonicFitter21.addObservedPoint(weightedObservedPoint25);
        harmonicFitter21.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        harmonicFitter21.addObservedPoint(weightedObservedPoint28);
        harmonicFitter21.clearObservations();
        harmonicFitter21.clearObservations();
        harmonicFitter21.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter21.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter21.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter21.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray46 = harmonicFitter21.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser47 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray46);
        double[] doubleArray48 = parameterGuesser47.guess();
        double[] doubleArray49 = parameterGuesser47.guess();
        double[] doubleArray50 = parameterGuesser47.guess();
        double[] doubleArray51 = parameterGuesser47.guess();
        double[] doubleArray52 = parameterGuesser47.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray53 = harmonicFitter1.fit(doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[45.0, 0.06283185307179587, -1.0674172227015877]");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 1L, 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) '#', (double) (byte) 0, (double) 10L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric24 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        harmonicFitter26.addObservedPoint(weightedObservedPoint30);
        harmonicFitter26.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint33 = null;
        harmonicFitter26.addObservedPoint(weightedObservedPoint33);
        harmonicFitter26.clearObservations();
        harmonicFitter26.clearObservations();
        harmonicFitter26.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter26.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter26.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter26.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray51 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser52 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray51);
        double[] doubleArray53 = parameterGuesser52.guess();
        double[] doubleArray54 = parameterGuesser52.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray55 = harmonicFitter1.fit(parametric24, doubleArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[45.0, 0.06283185307179587, -1.0674172227015877]");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 100.0f, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) 100, 100.0d, (double) 100);
        harmonicFitter1.addObservedPoint((double) 1, 0.0d, (double) 100L);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(10.0d, (double) 10);
        harmonicFitter1.addObservedPoint(100.0d, 10.0d);
        harmonicFitter1.addObservedPoint((double) 100.0f, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter1.getObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric37 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer38 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer38);
        harmonicFitter39.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint43 = null;
        harmonicFitter39.addObservedPoint(weightedObservedPoint43);
        harmonicFitter39.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint46 = null;
        harmonicFitter39.addObservedPoint(weightedObservedPoint46);
        harmonicFitter39.clearObservations();
        harmonicFitter39.clearObservations();
        harmonicFitter39.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter39.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter39.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter39.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray64 = harmonicFitter39.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser65 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray64);
        double[] doubleArray66 = parameterGuesser65.guess();
        double[] doubleArray67 = parameterGuesser65.guess();
        double[] doubleArray68 = parameterGuesser65.guess();
        double[] doubleArray69 = parameterGuesser65.guess();
        double[] doubleArray70 = parameterGuesser65.guess();
        double[] doubleArray71 = parameterGuesser65.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray72 = harmonicFitter1.fit(parametric37, doubleArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(weightedObservedPointArray64);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[45.0, 0.06283185307179587, -1.0674172227015877]");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (byte) -1, (double) 100L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
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
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer14 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer14);
        harmonicFitter15.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter15.addObservedPoint(weightedObservedPoint19);
        harmonicFitter15.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter15.addObservedPoint(weightedObservedPoint22);
        harmonicFitter15.clearObservations();
        harmonicFitter15.clearObservations();
        harmonicFitter15.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter15.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter15.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter15.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter15.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser41 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray40);
        double[] doubleArray42 = parameterGuesser41.guess();
        double[] doubleArray43 = parameterGuesser41.guess();
        double[] doubleArray44 = parameterGuesser41.guess();
        double[] doubleArray45 = parameterGuesser41.guess();
        double[] doubleArray46 = parameterGuesser41.guess();
        double[] doubleArray47 = parameterGuesser41.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[45.0, 0.06283185307179587, -1.0674172227015877]");
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
        java.lang.Class<?> wildcardClass33 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 10.0f, (double) 1L);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer12 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer12);
        harmonicFitter13.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter13.addObservedPoint(weightedObservedPoint17);
        harmonicFitter13.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter13.addObservedPoint(weightedObservedPoint20);
        harmonicFitter13.clearObservations();
        harmonicFitter13.clearObservations();
        harmonicFitter13.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter13.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter13.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter13.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter13.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser39 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray38);
        double[] doubleArray40 = parameterGuesser39.guess();
        double[] doubleArray41 = parameterGuesser39.guess();
        double[] doubleArray42 = parameterGuesser39.guess();
        double[] doubleArray43 = parameterGuesser39.guess();
        double[] doubleArray44 = parameterGuesser39.guess();
        double[] doubleArray45 = parameterGuesser39.guess();
        double[] doubleArray46 = parameterGuesser39.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = harmonicFitter1.fit(doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[45.0, 0.06283185307179587, -1.0674172227015877]");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint(0.0d, (double) '#', (double) (byte) 0);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) 10, (double) 0L);
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) (short) 10, (double) (short) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) (-1.0f));
        harmonicFitter1.addObservedPoint(0.0d, (double) (byte) 0, (double) 10L);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter19.addObservedPoint((double) (short) 0, (double) 0);
        harmonicFitter19.addObservedPoint(1.0d, (double) (-1L));
        harmonicFitter19.addObservedPoint((-1.0d), (double) (byte) 0, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray33 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser34 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser35 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray33);
        double[] doubleArray36 = parameterGuesser35.guess();
        double[] doubleArray37 = parameterGuesser35.guess();
        double[] doubleArray38 = parameterGuesser35.guess();
        double[] doubleArray39 = parameterGuesser35.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit(doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[NaN, NaN, NaN]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[NaN, NaN, NaN]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[NaN, NaN, NaN]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[NaN, NaN, NaN]");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        harmonicFitter1.addObservedPoint(0.0d, (double) 1.0f, (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(1.0d, (double) 0.0f);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray7 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) 100L, 0.0d);
        harmonicFitter1.addObservedPoint((double) 'a', 1.0d, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
        org.junit.Assert.assertNotNull(weightedObservedPointArray7);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        harmonicFitter1.addObservedPoint((double) 100.0f, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint21 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint21);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric24 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        harmonicFitter26.addObservedPoint((double) 1L, 100.0d, (double) (byte) 100);
        harmonicFitter26.addObservedPoint((double) 10.0f, 0.0d);
        harmonicFitter26.addObservedPoint((double) 'a', (double) 100.0f, (double) (-1.0f));
        harmonicFitter26.addObservedPoint((double) '4', (double) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray47 = parameterGuesser46.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray48 = harmonicFitter1.fit(parametric24, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[NaN, NaN, NaN]");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint(0.0d, 10.0d, (double) (-1));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint11 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint11);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) 100L, (double) ' ', 100.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer22 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter23 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer22);
        harmonicFitter23.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        harmonicFitter23.addObservedPoint(weightedObservedPoint27);
        harmonicFitter23.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint30 = null;
        harmonicFitter23.addObservedPoint(weightedObservedPoint30);
        harmonicFitter23.clearObservations();
        harmonicFitter23.clearObservations();
        harmonicFitter23.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter23.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter23.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter23.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray48 = harmonicFitter23.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser49 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray48);
        double[] doubleArray50 = parameterGuesser49.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = harmonicFitter1.fit((int) (byte) 10, parametric21, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[45.0, 0.06283185307179587, -1.0674172227015877]");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass12 = weightedObservedPointArray11.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric18 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer19 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer19);
        harmonicFitter20.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint24 = null;
        harmonicFitter20.addObservedPoint(weightedObservedPoint24);
        harmonicFitter20.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint27 = null;
        harmonicFitter20.addObservedPoint(weightedObservedPoint27);
        harmonicFitter20.clearObservations();
        harmonicFitter20.clearObservations();
        harmonicFitter20.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter20.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter20.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter20.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = harmonicFitter20.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser46 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray45);
        double[] doubleArray47 = parameterGuesser46.guess();
        double[] doubleArray48 = parameterGuesser46.guess();
        double[] doubleArray49 = parameterGuesser46.guess();
        double[] doubleArray50 = parameterGuesser46.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray51 = harmonicFitter1.fit(parametric18, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[45.0, 0.06283185307179587, -1.0674172227015877]");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.addObservedPoint(100.0d, (double) (byte) 10, (double) (short) -1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) -1, 0.0d);
        harmonicFitter1.clearObservations();
        java.lang.Class<?> wildcardClass26 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) 0.0f, (double) (short) 1);
        harmonicFitter1.addObservedPoint(0.0d, (double) '4', (double) (-1));
        harmonicFitter1.addObservedPoint((double) (-1L), (double) ' ', (double) 10);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        harmonicFitter1.addObservedPoint((double) (short) 10, 0.0d, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass18 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) 100.0f);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) '#', (double) (byte) 1, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 1L, 1.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0L, (double) 100);
        harmonicFitter1.addObservedPoint((double) 'a', (double) 1);
        harmonicFitter1.addObservedPoint((double) 'a', 0.0d);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(10.0d, (double) (short) 0);
        harmonicFitter1.clearObservations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 1.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(100.0d, 1.0d, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (-1L), (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray24);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray24);
        double[] doubleArray27 = parameterGuesser26.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 0.062209755516629564, 1.5701797332599696]");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (byte) -1, (double) 100L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric26 = null;
        double[] doubleArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = harmonicFitter1.fit((int) (short) 10, parametric26, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        harmonicFitter1.addObservedPoint((double) 0L, (double) 10, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray24);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray24);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray24);
        java.lang.Class<?> wildcardClass28 = weightedObservedPointArray24.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        harmonicFitter1.addObservedPoint((double) 0L, (double) 10, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray24 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (short) -1, 0.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
        org.junit.Assert.assertNotNull(weightedObservedPointArray24);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 'a', (double) 0.0f, 0.0d);
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray10 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(10.0d, (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray14);
        java.lang.Class<?> wildcardClass16 = parameterGuesser15.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray10);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.addObservedPoint(0.0d, 10.0d, 0.0d);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) 'a');
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (short) 1, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray25 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) 0L);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (-1L), (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) (-1.0f));
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (short) -1);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric12 = null;
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = harmonicFitter1.fit(parametric12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1L, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) (short) 1, (double) 1L);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(100.0d, (double) 0, (double) '#');
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (short) 10, (double) (short) 100);
        java.lang.Class<?> wildcardClass29 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint8 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint8);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 1, (double) 100, (double) 100L);
        harmonicFitter1.addObservedPoint((double) (byte) 0, (double) 'a');
        harmonicFitter1.addObservedPoint(0.0d, (double) (short) -1, (double) 1);
        harmonicFitter1.addObservedPoint(100.0d, (-1.0d));
        harmonicFitter1.addObservedPoint((double) (byte) -1, 1.0d, (double) 0.0f);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric31 = null;
        double[] doubleArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = harmonicFitter1.fit(0, parametric31, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) 100, (double) 10L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser13 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 1 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray2 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 'a', (double) (byte) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray2);
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray5 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) 100L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (byte) 10, (double) (short) -1, (double) ' ');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 10, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) 100, (double) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric25 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer26 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter27 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer26);
        harmonicFitter27.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint31 = null;
        harmonicFitter27.addObservedPoint(weightedObservedPoint31);
        harmonicFitter27.clearObservations();
        harmonicFitter27.addObservedPoint((double) 100, (double) (-1.0f));
        harmonicFitter27.addObservedPoint((double) 0.0f, (double) 1.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray40 = harmonicFitter27.getObservations();
        harmonicFitter27.addObservedPoint(100.0d, 1.0d, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray45 = harmonicFitter27.getObservations();
        harmonicFitter27.addObservedPoint((double) (byte) 1, (double) (-1L), (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray50 = harmonicFitter27.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser51 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray50);
        double[] doubleArray52 = parameterGuesser51.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray53 = harmonicFitter1.fit(parametric25, doubleArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertNotNull(weightedObservedPointArray40);
        org.junit.Assert.assertNotNull(weightedObservedPointArray45);
        org.junit.Assert.assertNotNull(weightedObservedPointArray50);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 0.062209755516629564, 1.5701797332599696]");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (byte) 10);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 1L, 1.0d);
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) '4');
        harmonicFitter1.addObservedPoint((double) (short) 100, (double) (-1L), 100.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint20 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint20);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) 0, (double) '#');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100L, (double) 1.0f);
        harmonicFitter1.addObservedPoint(0.0d, (double) (byte) 1, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (byte) 0, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) ' ', 0.0d);
        harmonicFitter1.addObservedPoint((double) 1, (double) (short) 1);
        harmonicFitter1.addObservedPoint((double) '4', (double) (-1L), (double) (short) -1);
        java.lang.Class<?> wildcardClass30 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint((double) (short) 0, (double) 1L, 1.0d);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser15 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: sample contains 0 observed points, at least 4 are required");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        harmonicFitter1.addObservedPoint((double) (byte) 10, 0.0d, 100.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray30 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass31 = weightedObservedPointArray30.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray25);
        org.junit.Assert.assertNotNull(weightedObservedPointArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        harmonicFitter1.addObservedPoint((double) '#', (double) 100L);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric10 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer11 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter12 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer11);
        harmonicFitter12.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter12.addObservedPoint(weightedObservedPoint16);
        harmonicFitter12.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter12.addObservedPoint(weightedObservedPoint19);
        harmonicFitter12.clearObservations();
        harmonicFitter12.clearObservations();
        harmonicFitter12.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter12.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter12.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter12.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray37 = harmonicFitter12.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray37);
        double[] doubleArray39 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = harmonicFitter1.fit(parametric10, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray37);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[45.0, 0.06283185307179587, -1.0674172227015877]");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        harmonicFitter1.addObservedPoint((double) (short) 100, 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        harmonicFitter1.addObservedPoint((double) 1.0f, (double) 0L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray20 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) 1L, (-1.0d));
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric26 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer27 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter28 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer27);
        harmonicFitter28.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint32 = null;
        harmonicFitter28.addObservedPoint(weightedObservedPoint32);
        harmonicFitter28.clearObservations();
        harmonicFitter28.addObservedPoint((double) 100, (double) (-1.0f));
        harmonicFitter28.addObservedPoint((double) 0.0f, (double) 1.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray41 = harmonicFitter28.getObservations();
        harmonicFitter28.addObservedPoint(100.0d, 1.0d, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray46 = harmonicFitter28.getObservations();
        harmonicFitter28.addObservedPoint((double) (byte) 1, (double) (-1L), (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray51 = harmonicFitter28.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser52 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray51);
        double[] doubleArray53 = parameterGuesser52.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray54 = harmonicFitter1.fit((int) 'a', parametric26, doubleArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray20);
        org.junit.Assert.assertNotNull(weightedObservedPointArray41);
        org.junit.Assert.assertNotNull(weightedObservedPointArray46);
        org.junit.Assert.assertNotNull(weightedObservedPointArray51);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 0.062209755516629564, 1.5701797332599696]");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0L, (double) 1, (double) (short) -1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint18 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint18);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric21 = null;
        double[] doubleArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = harmonicFitter1.fit(100, parametric21, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray28 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1L), 10.0d, (double) 10);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray34 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray35 = harmonicFitter1.getObservations();
        java.lang.Class<?> wildcardClass36 = harmonicFitter1.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray28);
        org.junit.Assert.assertNotNull(weightedObservedPointArray34);
        org.junit.Assert.assertNotNull(weightedObservedPointArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint13 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint13);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint15 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint15);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric20 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer21 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter22 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer21);
        harmonicFitter22.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter22.addObservedPoint((double) (short) 0, (double) 0);
        harmonicFitter22.addObservedPoint(1.0d, (double) (-1L));
        harmonicFitter22.addObservedPoint((-1.0d), (double) (byte) 0, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray36 = harmonicFitter22.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser37 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser38 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray36);
        double[] doubleArray39 = parameterGuesser38.guess();
        double[] doubleArray40 = parameterGuesser38.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = harmonicFitter1.fit((int) '#', parametric20, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[NaN, NaN, NaN]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[NaN, NaN, NaN]");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        harmonicFitter1.addObservedPoint((double) 10, (double) 1.0f);
        harmonicFitter1.addObservedPoint((double) (byte) 100, (double) (-1L), 1.0d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 1.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(100.0d, 1.0d, (double) (byte) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(100.0d, 0.0d, (double) '4');
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (byte) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint2 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint2);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint4 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint4);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint6 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint6);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) (byte) 0, (double) 100.0f);
        harmonicFitter1.addObservedPoint((double) 1, (double) (short) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser16 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray15);
        java.lang.Class<?> wildcardClass17 = weightedObservedPointArray15.getClass();
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1L));
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) 1, (double) 100);
        harmonicFitter1.addObservedPoint((double) 'a', (double) '4', (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) '#', (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser20 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray19);
        double[] doubleArray21 = parameterGuesser20.guess();
        double[] doubleArray22 = parameterGuesser20.guess();
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[NaN, NaN, NaN]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[NaN, NaN, NaN]");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray14 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) 'a', (double) 10L);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) ' ', (double) 0.0f);
        org.junit.Assert.assertNotNull(weightedObservedPointArray14);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        harmonicFitter1.addObservedPoint((double) 10.0f, (double) 10L, (double) ' ');
        harmonicFitter1.addObservedPoint((double) 1L, (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (-1L), 0.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint28 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint28);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint7 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint7);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, (double) 10.0f, (double) (short) -1);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        harmonicFitter1.addObservedPoint((double) 'a', (double) 100, (double) 0L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint25 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint25);
        harmonicFitter1.addObservedPoint((double) (-1L), (double) (short) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) (-1.0f));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray11 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray12 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray11);
        org.junit.Assert.assertNotNull(weightedObservedPointArray12);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (-1.0f), (double) (short) 10, (-1.0d));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) (-1L), 0.0d);
        harmonicFitter1.addObservedPoint((double) ' ', (double) 1.0f, (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray23 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser24 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray23);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray23);
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray23);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = parameterGuesser26.guess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray23);
    }
}

