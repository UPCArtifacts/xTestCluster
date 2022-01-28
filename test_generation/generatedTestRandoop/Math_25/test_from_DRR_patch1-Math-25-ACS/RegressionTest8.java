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

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) 1.0f);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint16 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint16);
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint10 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint10);
        harmonicFitter1.addObservedPoint((double) (-1), (double) (byte) 0, (double) 100L);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) ' ', (double) 100, 0.0d);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0, (double) (byte) -1, (double) 100.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray26 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (-1), (double) (-1), (double) (short) -1);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray26);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) (-1.0f), 1.0d);
        harmonicFitter1.addObservedPoint((double) 10.0f, (double) 10L, (double) ' ');
        harmonicFitter1.addObservedPoint((double) 1L, (double) (byte) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray21 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray22 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 100, 0.0d, (double) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric27 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer28 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter29 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer28);
        harmonicFitter29.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter29.addObservedPoint((double) (short) 1, (double) (-1L));
        harmonicFitter29.addObservedPoint((double) (byte) 1, (double) 1, (double) 100);
        harmonicFitter29.addObservedPoint((double) 'a', (double) '4', (double) (byte) 0);
        harmonicFitter29.addObservedPoint((double) '#', (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray47 = harmonicFitter29.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser48 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray47);
        double[] doubleArray49 = parameterGuesser48.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = harmonicFitter1.fit(parametric27, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray21);
        org.junit.Assert.assertNotNull(weightedObservedPointArray22);
        org.junit.Assert.assertNotNull(weightedObservedPointArray47);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[NaN, NaN, NaN]");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer18 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter19 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer18);
        harmonicFitter19.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        harmonicFitter19.addObservedPoint(weightedObservedPoint23);
        harmonicFitter19.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint26 = null;
        harmonicFitter19.addObservedPoint(weightedObservedPoint26);
        harmonicFitter19.clearObservations();
        harmonicFitter19.clearObservations();
        harmonicFitter19.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter19.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter19.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter19.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = harmonicFitter19.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray46 = parameterGuesser45.guess();
        double[] doubleArray47 = parameterGuesser45.guess();
        double[] doubleArray48 = parameterGuesser45.guess();
        double[] doubleArray49 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray50 = harmonicFitter1.fit(doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray5);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[45.0, 0.06283185307179587, -1.0674172227015877]");
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
        harmonicFitter1.addObservedPoint((double) 100, 100.0d, (double) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint22 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint22);
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(1.0d, (double) 0L, 10.0d);
        harmonicFitter1.addObservedPoint(10.0d, (double) (byte) -1, (double) '4');
        harmonicFitter1.addObservedPoint((double) 10.0f, 0.0d, (double) 0);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray38 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray38);
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
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 100L, (double) 1.0f);
        harmonicFitter1.addObservedPoint(0.0d, (double) (byte) 1, (double) (byte) 0);
        harmonicFitter1.addObservedPoint((double) 100.0f, (double) (byte) 0, (double) (-1.0f));
        harmonicFitter1.addObservedPoint((double) (-1L), (double) 10);
        org.apache.commons.math3.analysis.function.HarmonicOscillator.Parametric parametric23 = null;
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer24 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter25 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer24);
        harmonicFitter25.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        harmonicFitter25.addObservedPoint(weightedObservedPoint29);
        harmonicFitter25.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint32 = null;
        harmonicFitter25.addObservedPoint(weightedObservedPoint32);
        harmonicFitter25.clearObservations();
        harmonicFitter25.clearObservations();
        harmonicFitter25.addObservedPoint(0.0d, (double) (byte) 0, 0.0d);
        harmonicFitter25.addObservedPoint(0.0d, (double) 'a', (double) '4');
        harmonicFitter25.addObservedPoint((double) ' ', (double) (short) 10);
        harmonicFitter25.addObservedPoint(100.0d, (double) (byte) 100);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray50 = harmonicFitter25.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser51 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray50);
        double[] doubleArray52 = parameterGuesser51.guess();
        double[] doubleArray53 = parameterGuesser51.guess();
        double[] doubleArray54 = parameterGuesser51.guess();
        double[] doubleArray55 = parameterGuesser51.guess();
        double[] doubleArray56 = parameterGuesser51.guess();
        double[] doubleArray57 = parameterGuesser51.guess();
        double[] doubleArray58 = parameterGuesser51.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray59 = harmonicFitter1.fit(parametric23, doubleArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray50);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[45.0, 0.06283185307179587, -1.0674172227015877]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[45.0, 0.06283185307179587, -1.0674172227015877]");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        harmonicFitter1.addObservedPoint(0.0d, (double) 1.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray18 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray19 = harmonicFitter1.getObservations();
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray18);
        org.junit.Assert.assertNotNull(weightedObservedPointArray19);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) (-1L));
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray8 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) '#', (double) '4');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray13 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray16 = harmonicFitter1.getObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray17 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) -1, 10.0d);
        org.junit.Assert.assertNotNull(weightedObservedPointArray8);
        org.junit.Assert.assertNotNull(weightedObservedPointArray13);
        org.junit.Assert.assertNotNull(weightedObservedPointArray16);
        org.junit.Assert.assertNotNull(weightedObservedPointArray17);
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
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray9 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint(10.0d, 0.0d, (double) (short) 10);
        harmonicFitter1.addObservedPoint((double) 10.0f, (double) (-1.0f), (double) 1L);
        harmonicFitter1.addObservedPoint((double) 100L, (double) (-1));
        harmonicFitter1.addObservedPoint(1.0d, 10.0d, 1.0d);
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer25 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter26 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer25);
        harmonicFitter26.addObservedPoint((double) ' ', (double) (short) -1);
        harmonicFitter26.addObservedPoint((double) (short) 1, (double) (-1L));
        harmonicFitter26.addObservedPoint((double) (byte) 1, (double) 1, (double) 100);
        harmonicFitter26.addObservedPoint((double) 'a', (double) '4', (double) (byte) 0);
        harmonicFitter26.addObservedPoint((double) '#', (double) 1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray44 = harmonicFitter26.getObservations();
        org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser parameterGuesser45 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser(weightedObservedPointArray44);
        double[] doubleArray46 = parameterGuesser45.guess();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray47 = harmonicFitter1.fit(doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray9);
        org.junit.Assert.assertNotNull(weightedObservedPointArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[NaN, NaN, NaN]");
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
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint9 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint9);
        harmonicFitter1.addObservedPoint((double) 100, (double) 100.0f, (double) 'a');
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray15 = harmonicFitter1.getObservations();
        harmonicFitter1.addObservedPoint((double) (short) 10, (double) 0.0f);
        harmonicFitter1.addObservedPoint(100.0d, (double) (short) 1, (double) 0L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint23 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint23);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) 1, (double) 1L);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint29 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint29);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray15);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) 0.0f, (double) (short) 100, (double) (short) 10);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint[] weightedObservedPointArray6 = harmonicFitter1.getObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) 0L, (double) 1, (double) (short) -1);
        harmonicFitter1.addObservedPoint((double) (-1.0f), 10.0d, 100.0d);
        harmonicFitter1.addObservedPoint(1.0d, 1.0d);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint19 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint19);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = harmonicFitter1.fit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(weightedObservedPointArray6);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer differentiableMultivariateVectorOptimizer0 = null;
        org.apache.commons.math3.optimization.fitting.HarmonicFitter harmonicFitter1 = new org.apache.commons.math3.optimization.fitting.HarmonicFitter(differentiableMultivariateVectorOptimizer0);
        harmonicFitter1.addObservedPoint((double) ' ', (double) (short) -1);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint5 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint5);
        harmonicFitter1.addObservedPoint((double) (short) 1, (double) 100.0f);
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint(0.0d, (double) 100, 0.0d);
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
        harmonicFitter1.clearObservations();
        harmonicFitter1.clearObservations();
        harmonicFitter1.addObservedPoint((double) (byte) 1, (double) 0.0f);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint12 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint12);
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint14 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint14);
        harmonicFitter1.clearObservations();
        org.apache.commons.math3.optimization.fitting.WeightedObservedPoint weightedObservedPoint17 = null;
        harmonicFitter1.addObservedPoint(weightedObservedPoint17);
        harmonicFitter1.addObservedPoint((double) (byte) -1, (double) 0L, (double) (short) 0);
        harmonicFitter1.addObservedPoint((double) '4', (double) 0.0f);
        harmonicFitter1.clearObservations();
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
}

