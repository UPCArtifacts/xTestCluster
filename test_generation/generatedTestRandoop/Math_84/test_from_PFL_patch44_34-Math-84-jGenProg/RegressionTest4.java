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
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        double[] doubleArray2 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray2);
        int int4 = multiDirectional0.getMaxEvaluations();
        int int5 = multiDirectional0.getIterations();
        double[] doubleArray11 = new double[] { (byte) -1, 1.0f, 100.0d, 100.0f, (short) -1 };
        multiDirectional0.setStartConfiguration(doubleArray11);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        int int15 = multiDirectional13.getIterations();
        int int16 = multiDirectional13.getMaxEvaluations();
        int int17 = multiDirectional13.getMaxEvaluations();
        multiDirectional13.setMaxIterations((-1));
        int int20 = multiDirectional13.getIterations();
        int int21 = multiDirectional13.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional13.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        int int25 = multiDirectional23.getIterations();
        int int26 = multiDirectional23.getMaxEvaluations();
        int int27 = multiDirectional23.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxIterations();
        double[] doubleArray30 = new double[] {};
        multiDirectional28.setStartConfiguration(doubleArray30);
        multiDirectional23.setStartConfiguration(doubleArray30);
        multiDirectional13.setStartConfiguration(doubleArray30);
        multiDirectional0.setStartConfiguration(doubleArray30);
        multiDirectional0.setMaxEvaluations((int) '#');
        multiDirectional0.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) '4', (double) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int43 = multiDirectional42.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker44 = null;
        multiDirectional42.setConvergenceChecker(realConvergenceChecker44);
        multiDirectional42.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int49 = multiDirectional48.getMaxIterations();
        double[] doubleArray50 = new double[] {};
        multiDirectional48.setStartConfiguration(doubleArray50);
        int int52 = multiDirectional48.getMaxEvaluations();
        int int53 = multiDirectional48.getMaxIterations();
        int int54 = multiDirectional48.getMaxIterations();
        multiDirectional48.setMaxIterations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int58 = multiDirectional57.getMaxEvaluations();
        int int59 = multiDirectional57.getIterations();
        int int60 = multiDirectional57.getMaxEvaluations();
        int int61 = multiDirectional57.getMaxEvaluations();
        multiDirectional57.setMaxIterations((-1));
        int int64 = multiDirectional57.getMaxIterations();
        int int65 = multiDirectional57.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int67 = multiDirectional66.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker68 = null;
        multiDirectional66.setConvergenceChecker(realConvergenceChecker68);
        multiDirectional66.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional74 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker75 = multiDirectional74.getConvergenceChecker();
        multiDirectional66.setConvergenceChecker(realConvergenceChecker75);
        multiDirectional57.setConvergenceChecker(realConvergenceChecker75);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional80 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional81 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int82 = multiDirectional81.getMaxIterations();
        double[] doubleArray83 = new double[] {};
        multiDirectional81.setStartConfiguration(doubleArray83);
        int int85 = multiDirectional81.getMaxEvaluations();
        int int86 = multiDirectional81.getIterations();
        int int87 = multiDirectional81.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker88 = multiDirectional81.getConvergenceChecker();
        multiDirectional80.setConvergenceChecker(realConvergenceChecker88);
        double[] doubleArray90 = new double[] {};
        double[][] doubleArray91 = new double[][] { doubleArray90 };
        multiDirectional80.setStartConfiguration(doubleArray91);
        multiDirectional57.setStartConfiguration(doubleArray91);
        multiDirectional48.setStartConfiguration(doubleArray91);
        multiDirectional42.setStartConfiguration(doubleArray91);
        multiDirectional41.setStartConfiguration(doubleArray91);
        multiDirectional0.setStartConfiguration(doubleArray91);
        int int98 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker75);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2147483647 + "'", int82 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2147483647 + "'", int85 == 2147483647);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2147483647 + "'", int87 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker88);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        double[] doubleArray2 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray2);
        int int4 = multiDirectional0.getMaxEvaluations();
        int int5 = multiDirectional0.getMaxIterations();
        int int6 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations(32);
        multiDirectional0.setMaxEvaluations((-1));
        multiDirectional0.setMaxEvaluations(0);
        int int13 = multiDirectional0.getIterations();
        int int14 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional0.getConvergenceChecker();
        int int16 = multiDirectional0.getEvaluations();
        int int17 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxIterations();
        double[] doubleArray7 = new double[] {};
        multiDirectional5.setStartConfiguration(doubleArray7);
        multiDirectional0.setStartConfiguration(doubleArray7);
        int int10 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 52, (double) 97);
        java.lang.Class<?> wildcardClass3 = multiDirectional2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        multiDirectional2.setMaxEvaluations(2147483647);
        multiDirectional2.setMaxEvaluations((int) '#');
        int int7 = multiDirectional2.getIterations();
        int int8 = multiDirectional2.getEvaluations();
        int int9 = multiDirectional2.getEvaluations();
        int int10 = multiDirectional2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker10);
        int int12 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations(2147483647);
        int int15 = multiDirectional0.getIterations();
        int int16 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 35, (double) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional2.getConvergenceChecker();
        java.lang.Class<?> wildcardClass4 = realConvergenceChecker3.getClass();
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = multiDirectional0.getConvergenceChecker();
        int int6 = multiDirectional0.getIterations();
        int int7 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations(0);
        int int10 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker4);
        double[] doubleArray8 = new double[] { 1.0d, 2147483647 };
        multiDirectional0.setStartConfiguration(doubleArray8);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations((int) (byte) 100);
        multiDirectional0.setMaxIterations(35);
        multiDirectional0.setMaxIterations(100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker10);
        org.junit.Assert.assertNull(realConvergenceChecker17);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker4);
        double[] doubleArray7 = new double[] { 100.0d };
        multiDirectional0.setStartConfiguration(doubleArray7);
        int int9 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker10);
        int int12 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        multiDirectional13.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = null;
        multiDirectional13.setConvergenceChecker(realConvergenceChecker17);
        double[] doubleArray21 = new double[] { 1.0d, 2147483647 };
        multiDirectional13.setStartConfiguration(doubleArray21);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional13.getConvergenceChecker();
        multiDirectional13.setMaxEvaluations((int) (byte) 100);
        multiDirectional13.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional13.getConvergenceChecker();
        int int29 = multiDirectional13.getEvaluations();
        int int30 = multiDirectional13.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int32 = multiDirectional31.getMaxEvaluations();
        int int33 = multiDirectional31.getIterations();
        int int34 = multiDirectional31.getMaxEvaluations();
        int int35 = multiDirectional31.getMaxEvaluations();
        multiDirectional31.setMaxIterations((-1));
        int int38 = multiDirectional31.getMaxIterations();
        int int39 = multiDirectional31.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int41 = multiDirectional40.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = null;
        multiDirectional40.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional40.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker49 = multiDirectional48.getConvergenceChecker();
        multiDirectional40.setConvergenceChecker(realConvergenceChecker49);
        multiDirectional31.setConvergenceChecker(realConvergenceChecker49);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional54 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int56 = multiDirectional55.getMaxIterations();
        double[] doubleArray57 = new double[] {};
        multiDirectional55.setStartConfiguration(doubleArray57);
        int int59 = multiDirectional55.getMaxEvaluations();
        int int60 = multiDirectional55.getIterations();
        int int61 = multiDirectional55.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional55.getConvergenceChecker();
        multiDirectional54.setConvergenceChecker(realConvergenceChecker62);
        double[] doubleArray64 = new double[] {};
        double[][] doubleArray65 = new double[][] { doubleArray64 };
        multiDirectional54.setStartConfiguration(doubleArray65);
        multiDirectional31.setStartConfiguration(doubleArray65);
        multiDirectional13.setStartConfiguration(doubleArray65);
        multiDirectional0.setStartConfiguration(doubleArray65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker23);
        org.junit.Assert.assertNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertNotNull(doubleArray65);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getIterations();
        int int8 = multiDirectional0.getMaxIterations();
        int int9 = multiDirectional0.getMaxIterations();
        int int10 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int15 = multiDirectional14.getMaxIterations();
        double[] doubleArray16 = new double[] {};
        multiDirectional14.setStartConfiguration(doubleArray16);
        int int18 = multiDirectional14.getMaxEvaluations();
        int int19 = multiDirectional14.getIterations();
        int int20 = multiDirectional14.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = multiDirectional14.getConvergenceChecker();
        multiDirectional13.setConvergenceChecker(realConvergenceChecker21);
        double[] doubleArray23 = new double[] {};
        double[][] doubleArray24 = new double[][] { doubleArray23 };
        multiDirectional13.setStartConfiguration(doubleArray24);
        multiDirectional0.setStartConfiguration(doubleArray24);
        java.lang.Class<?> wildcardClass27 = doubleArray24.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) ' ');
        multiDirectional2.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        int int7 = multiDirectional5.getIterations();
        int int8 = multiDirectional5.getMaxEvaluations();
        int int9 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxIterations((-1));
        int int12 = multiDirectional5.getIterations();
        int int13 = multiDirectional5.getEvaluations();
        int int14 = multiDirectional5.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getMaxEvaluations();
        multiDirectional15.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = null;
        multiDirectional15.setConvergenceChecker(realConvergenceChecker19);
        double[] doubleArray23 = new double[] { 1.0d, 2147483647 };
        multiDirectional15.setStartConfiguration(doubleArray23);
        int int25 = multiDirectional15.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int27 = multiDirectional26.getMaxIterations();
        double[] doubleArray28 = new double[] {};
        multiDirectional26.setStartConfiguration(doubleArray28);
        multiDirectional15.setStartConfiguration(doubleArray28);
        multiDirectional5.setStartConfiguration(doubleArray28);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        int int34 = multiDirectional32.getIterations();
        int int35 = multiDirectional32.getMaxEvaluations();
        int int36 = multiDirectional32.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int38 = multiDirectional37.getMaxIterations();
        double[] doubleArray39 = new double[] {};
        multiDirectional37.setStartConfiguration(doubleArray39);
        multiDirectional32.setStartConfiguration(doubleArray39);
        multiDirectional5.setStartConfiguration(doubleArray39);
        multiDirectional2.setStartConfiguration(doubleArray39);
        int int44 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        multiDirectional2.setMaxEvaluations(2147483647);
        multiDirectional2.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional2.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional12.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker13);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = null;
        multiDirectional15.setConvergenceChecker(realConvergenceChecker17);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getMaxEvaluations();
        multiDirectional19.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = null;
        multiDirectional19.setConvergenceChecker(realConvergenceChecker23);
        double[] doubleArray27 = new double[] { 1.0d, 2147483647 };
        multiDirectional19.setStartConfiguration(doubleArray27);
        int int29 = multiDirectional19.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int31 = multiDirectional30.getMaxIterations();
        double[] doubleArray32 = new double[] {};
        multiDirectional30.setStartConfiguration(doubleArray32);
        multiDirectional19.setStartConfiguration(doubleArray32);
        multiDirectional15.setStartConfiguration(doubleArray32);
        multiDirectional0.setStartConfiguration(doubleArray32);
        int int37 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxIterations((int) '#');
        int int40 = multiDirectional0.getIterations();
        multiDirectional0.setMaxEvaluations((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker4);
        double[] doubleArray7 = new double[] { 100.0d };
        multiDirectional0.setStartConfiguration(doubleArray7);
        int int9 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        multiDirectional10.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = null;
        multiDirectional10.setConvergenceChecker(realConvergenceChecker14);
        double[] doubleArray17 = new double[] { 100.0d };
        multiDirectional10.setStartConfiguration(doubleArray17);
        int int19 = multiDirectional10.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker20 = null;
        multiDirectional10.setConvergenceChecker(realConvergenceChecker20);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int23 = multiDirectional22.getMaxEvaluations();
        multiDirectional22.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = null;
        multiDirectional22.setConvergenceChecker(realConvergenceChecker26);
        double[] doubleArray29 = new double[] { 100.0d };
        multiDirectional22.setStartConfiguration(doubleArray29);
        int int31 = multiDirectional22.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int35 = multiDirectional34.getMaxEvaluations();
        int int36 = multiDirectional34.getIterations();
        int int37 = multiDirectional34.getMaxEvaluations();
        int int38 = multiDirectional34.getMaxEvaluations();
        multiDirectional34.setMaxIterations((-1));
        int int41 = multiDirectional34.getMaxIterations();
        multiDirectional34.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker47 = multiDirectional46.getConvergenceChecker();
        multiDirectional34.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional32.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional22.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional22.setMaxIterations(100);
        multiDirectional22.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1.0f, (double) '4');
        multiDirectional57.setMaxIterations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional62 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional65 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int67 = multiDirectional66.getMaxIterations();
        double[] doubleArray68 = new double[] {};
        multiDirectional66.setStartConfiguration(doubleArray68);
        int int70 = multiDirectional66.getMaxEvaluations();
        int int71 = multiDirectional66.getIterations();
        int int72 = multiDirectional66.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker73 = multiDirectional66.getConvergenceChecker();
        multiDirectional65.setConvergenceChecker(realConvergenceChecker73);
        double[] doubleArray75 = new double[] {};
        double[][] doubleArray76 = new double[][] { doubleArray75 };
        multiDirectional65.setStartConfiguration(doubleArray76);
        multiDirectional62.setStartConfiguration(doubleArray76);
        multiDirectional57.setStartConfiguration(doubleArray76);
        multiDirectional22.setStartConfiguration(doubleArray76);
        multiDirectional10.setStartConfiguration(doubleArray76);
        multiDirectional0.setStartConfiguration(doubleArray76);
        java.lang.Class<?> wildcardClass83 = doubleArray76.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2147483647 + "'", int70 == 2147483647);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2147483647 + "'", int72 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker73);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) -1, (double) (-1L));
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        int int11 = multiDirectional9.getIterations();
        int int12 = multiDirectional9.getMaxEvaluations();
        int int13 = multiDirectional9.getMaxEvaluations();
        multiDirectional9.setMaxIterations((-1));
        int int16 = multiDirectional9.getMaxIterations();
        multiDirectional9.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional21.getConvergenceChecker();
        multiDirectional9.setConvergenceChecker(realConvergenceChecker22);
        multiDirectional7.setConvergenceChecker(realConvergenceChecker22);
        multiDirectional6.setConvergenceChecker(realConvergenceChecker22);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker22);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxEvaluations();
        int int30 = multiDirectional28.getIterations();
        int int31 = multiDirectional28.getMaxEvaluations();
        int int32 = multiDirectional28.getMaxEvaluations();
        multiDirectional28.setMaxIterations((-1));
        int int35 = multiDirectional28.getIterations();
        int int36 = multiDirectional28.getMaxIterations();
        multiDirectional28.setMaxEvaluations(100);
        int int39 = multiDirectional28.getMaxEvaluations();
        int int40 = multiDirectional28.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker41 = multiDirectional28.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker41);
        int int43 = multiDirectional0.getMaxEvaluations();
        int int44 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) '4', (double) (byte) 100);
        int int3 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        double[] doubleArray2 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray2);
        int int4 = multiDirectional0.getMaxEvaluations();
        int int5 = multiDirectional0.getIterations();
        double[] doubleArray11 = new double[] { (byte) -1, 1.0f, 100.0d, 100.0f, (short) -1 };
        multiDirectional0.setStartConfiguration(doubleArray11);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        int int15 = multiDirectional13.getIterations();
        int int16 = multiDirectional13.getMaxEvaluations();
        int int17 = multiDirectional13.getMaxEvaluations();
        multiDirectional13.setMaxIterations((-1));
        int int20 = multiDirectional13.getIterations();
        int int21 = multiDirectional13.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional13.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        int int25 = multiDirectional23.getIterations();
        int int26 = multiDirectional23.getMaxEvaluations();
        int int27 = multiDirectional23.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxIterations();
        double[] doubleArray30 = new double[] {};
        multiDirectional28.setStartConfiguration(doubleArray30);
        multiDirectional23.setStartConfiguration(doubleArray30);
        multiDirectional13.setStartConfiguration(doubleArray30);
        multiDirectional0.setStartConfiguration(doubleArray30);
        multiDirectional0.setMaxEvaluations((int) '#');
        int int37 = multiDirectional0.getMaxEvaluations();
        int int38 = multiDirectional0.getEvaluations();
        int int39 = multiDirectional0.getEvaluations();
        int int40 = multiDirectional0.getEvaluations();
        int int41 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker2 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker2);
        multiDirectional0.setMaxEvaluations((int) ' ');
        int int6 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker8 = multiDirectional0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(realConvergenceChecker7);
        org.junit.Assert.assertNull(realConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) -1, 0.0d);
        multiDirectional2.setMaxEvaluations((int) (byte) 1);
        multiDirectional2.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getMaxEvaluations();
        multiDirectional7.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = null;
        multiDirectional7.setConvergenceChecker(realConvergenceChecker11);
        double[] doubleArray15 = new double[] { 1.0d, 2147483647 };
        multiDirectional7.setStartConfiguration(doubleArray15);
        multiDirectional7.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) 0);
        int int22 = multiDirectional21.getEvaluations();
        int int23 = multiDirectional21.getMaxEvaluations();
        multiDirectional21.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int27 = multiDirectional26.getMaxEvaluations();
        int int28 = multiDirectional26.getIterations();
        int int29 = multiDirectional26.getMaxEvaluations();
        int int30 = multiDirectional26.getMaxEvaluations();
        multiDirectional26.setMaxIterations((-1));
        int int33 = multiDirectional26.getMaxIterations();
        int int34 = multiDirectional26.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int36 = multiDirectional35.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = null;
        multiDirectional35.setConvergenceChecker(realConvergenceChecker37);
        multiDirectional35.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker44 = multiDirectional43.getConvergenceChecker();
        multiDirectional35.setConvergenceChecker(realConvergenceChecker44);
        multiDirectional26.setConvergenceChecker(realConvergenceChecker44);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int51 = multiDirectional50.getMaxIterations();
        double[] doubleArray52 = new double[] {};
        multiDirectional50.setStartConfiguration(doubleArray52);
        int int54 = multiDirectional50.getMaxEvaluations();
        int int55 = multiDirectional50.getIterations();
        int int56 = multiDirectional50.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker57 = multiDirectional50.getConvergenceChecker();
        multiDirectional49.setConvergenceChecker(realConvergenceChecker57);
        double[] doubleArray59 = new double[] {};
        double[][] doubleArray60 = new double[][] { doubleArray59 };
        multiDirectional49.setStartConfiguration(doubleArray60);
        multiDirectional26.setStartConfiguration(doubleArray60);
        multiDirectional21.setStartConfiguration(doubleArray60);
        multiDirectional7.setStartConfiguration(doubleArray60);
        multiDirectional2.setStartConfiguration(doubleArray60);
        multiDirectional2.setMaxEvaluations((int) ' ');
        int int68 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker57);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 32 + "'", int68 == 32);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(1.0d, (double) (byte) 10);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) '#', (double) (short) 10);
        int int3 = multiDirectional2.getIterations();
        int int4 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        int int7 = multiDirectional5.getIterations();
        int int8 = multiDirectional5.getMaxEvaluations();
        int int9 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxIterations((-1));
        int int12 = multiDirectional5.getIterations();
        multiDirectional5.setMaxIterations((int) '#');
        multiDirectional5.setMaxEvaluations(0);
        multiDirectional5.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional21.getConvergenceChecker();
        multiDirectional5.setConvergenceChecker(realConvergenceChecker22);
        int int24 = multiDirectional5.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int26 = multiDirectional25.getMaxEvaluations();
        int int27 = multiDirectional25.getMaxEvaluations();
        int int28 = multiDirectional25.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getMaxEvaluations();
        multiDirectional29.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = null;
        multiDirectional29.setConvergenceChecker(realConvergenceChecker33);
        double[] doubleArray36 = new double[] { 100.0d };
        multiDirectional29.setStartConfiguration(doubleArray36);
        multiDirectional25.setStartConfiguration(doubleArray36);
        multiDirectional5.setStartConfiguration(doubleArray36);
        multiDirectional2.setStartConfiguration(doubleArray36);
        int int41 = multiDirectional2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getIterations();
        int int8 = multiDirectional0.getMaxIterations();
        int int9 = multiDirectional0.getMaxEvaluations();
        int int10 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxIterations(1);
        int int15 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getIterations();
        int int8 = multiDirectional0.getMaxIterations();
        int int9 = multiDirectional0.getMaxIterations();
        int int10 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker2 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker2);
        multiDirectional0.setMaxEvaluations((int) ' ');
        int int6 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getMaxEvaluations();
        int int9 = multiDirectional7.getIterations();
        int int10 = multiDirectional7.getMaxEvaluations();
        int int11 = multiDirectional7.getMaxEvaluations();
        multiDirectional7.setMaxIterations((-1));
        int int14 = multiDirectional7.getIterations();
        int int15 = multiDirectional7.getMaxIterations();
        multiDirectional7.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional7.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getMaxEvaluations();
        int int21 = multiDirectional19.getIterations();
        int int22 = multiDirectional19.getMaxEvaluations();
        int int23 = multiDirectional19.getMaxEvaluations();
        multiDirectional19.setMaxIterations((-1));
        int int26 = multiDirectional19.getIterations();
        int int27 = multiDirectional19.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional19.getConvergenceChecker();
        int int29 = multiDirectional19.getEvaluations();
        multiDirectional19.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker34 = null;
        multiDirectional32.setConvergenceChecker(realConvergenceChecker34);
        multiDirectional32.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, 1.0d);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int42 = multiDirectional41.getMaxEvaluations();
        multiDirectional41.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker45 = null;
        multiDirectional41.setConvergenceChecker(realConvergenceChecker45);
        double[] doubleArray49 = new double[] { 1.0d, 2147483647 };
        multiDirectional41.setStartConfiguration(doubleArray49);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker51 = multiDirectional41.getConvergenceChecker();
        multiDirectional41.setMaxEvaluations((int) (byte) 100);
        multiDirectional41.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int57 = multiDirectional56.getMaxEvaluations();
        multiDirectional56.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker60 = null;
        multiDirectional56.setConvergenceChecker(realConvergenceChecker60);
        double[] doubleArray64 = new double[] { 1.0d, 2147483647 };
        multiDirectional56.setStartConfiguration(doubleArray64);
        int int66 = multiDirectional56.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional67 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int68 = multiDirectional67.getMaxIterations();
        double[] doubleArray69 = new double[] {};
        multiDirectional67.setStartConfiguration(doubleArray69);
        multiDirectional56.setStartConfiguration(doubleArray69);
        multiDirectional41.setStartConfiguration(doubleArray69);
        multiDirectional40.setStartConfiguration(doubleArray69);
        multiDirectional32.setStartConfiguration(doubleArray69);
        multiDirectional19.setStartConfiguration(doubleArray69);
        multiDirectional7.setStartConfiguration(doubleArray69);
        multiDirectional0.setStartConfiguration(doubleArray69);
        int int78 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2147483647 + "'", int66 == 2147483647);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 32 + "'", int78 == 32);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker2 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker2);
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        int int7 = multiDirectional0.getMaxIterations();
        int int8 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        int int11 = multiDirectional9.getIterations();
        int int12 = multiDirectional9.getMaxEvaluations();
        int int13 = multiDirectional9.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int15 = multiDirectional14.getMaxIterations();
        double[] doubleArray16 = new double[] {};
        multiDirectional14.setStartConfiguration(doubleArray16);
        multiDirectional9.setStartConfiguration(doubleArray16);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getMaxIterations();
        double[] doubleArray21 = new double[] {};
        multiDirectional19.setStartConfiguration(doubleArray21);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int26 = multiDirectional25.getMaxEvaluations();
        int int27 = multiDirectional25.getIterations();
        int int28 = multiDirectional25.getMaxEvaluations();
        int int29 = multiDirectional25.getMaxEvaluations();
        multiDirectional25.setMaxIterations((-1));
        int int32 = multiDirectional25.getMaxIterations();
        multiDirectional25.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = multiDirectional37.getConvergenceChecker();
        multiDirectional25.setConvergenceChecker(realConvergenceChecker38);
        multiDirectional23.setConvergenceChecker(realConvergenceChecker38);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker41 = multiDirectional23.getConvergenceChecker();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = multiDirectional23.getConvergenceChecker();
        multiDirectional19.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional9.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker42);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int47 = multiDirectional46.getMaxEvaluations();
        multiDirectional46.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker50 = null;
        multiDirectional46.setConvergenceChecker(realConvergenceChecker50);
        double[] doubleArray54 = new double[] { 1.0d, 2147483647 };
        multiDirectional46.setStartConfiguration(doubleArray54);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker56 = multiDirectional46.getConvergenceChecker();
        multiDirectional46.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional61 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional61.getConvergenceChecker();
        multiDirectional46.setConvergenceChecker(realConvergenceChecker62);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker62);
        int int65 = multiDirectional0.getIterations();
        multiDirectional0.setMaxEvaluations(35);
        int int68 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker38);
        org.junit.Assert.assertNotNull(realConvergenceChecker41);
        org.junit.Assert.assertNotNull(realConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker56);
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) -1, (double) 1L);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = null;
        multiDirectional2.setConvergenceChecker(realConvergenceChecker3);
        int int5 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, (double) 0.0f);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1L, (double) (byte) 1);
        int int3 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getMaxEvaluations();
        multiDirectional4.setMaxIterations((int) (byte) 0);
        int int8 = multiDirectional4.getEvaluations();
        int int9 = multiDirectional4.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional4.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional((-1.0d), (double) 'a');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = multiDirectional13.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getMaxEvaluations();
        int int17 = multiDirectional15.getIterations();
        int int18 = multiDirectional15.getMaxEvaluations();
        int int19 = multiDirectional15.getMaxEvaluations();
        multiDirectional15.setMaxIterations((-1));
        int int22 = multiDirectional15.getMaxIterations();
        int int23 = multiDirectional15.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = null;
        multiDirectional24.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional24.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional32.getConvergenceChecker();
        multiDirectional24.setConvergenceChecker(realConvergenceChecker33);
        multiDirectional15.setConvergenceChecker(realConvergenceChecker33);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getMaxIterations();
        double[] doubleArray41 = new double[] {};
        multiDirectional39.setStartConfiguration(doubleArray41);
        int int43 = multiDirectional39.getMaxEvaluations();
        int int44 = multiDirectional39.getIterations();
        int int45 = multiDirectional39.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker46 = multiDirectional39.getConvergenceChecker();
        multiDirectional38.setConvergenceChecker(realConvergenceChecker46);
        double[] doubleArray48 = new double[] {};
        double[][] doubleArray49 = new double[][] { doubleArray48 };
        multiDirectional38.setStartConfiguration(doubleArray49);
        multiDirectional15.setStartConfiguration(doubleArray49);
        multiDirectional13.setStartConfiguration(doubleArray49);
        multiDirectional4.setStartConfiguration(doubleArray49);
        multiDirectional2.setStartConfiguration(doubleArray49);
        int int55 = multiDirectional2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker10);
        org.junit.Assert.assertNotNull(realConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker46);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxEvaluations();
        int int3 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int3 = multiDirectional2.getMaxEvaluations();
        int int4 = multiDirectional2.getIterations();
        int int5 = multiDirectional2.getMaxEvaluations();
        int int6 = multiDirectional2.getMaxEvaluations();
        multiDirectional2.setMaxIterations((-1));
        int int9 = multiDirectional2.getMaxIterations();
        multiDirectional2.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional14.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker15);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker15);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional0.getConvergenceChecker();
        int int19 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations(10);
        multiDirectional0.setMaxEvaluations(100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.setStartConfiguration(doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional12.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker13);
        int int15 = multiDirectional0.getMaxIterations();
        int int16 = multiDirectional0.getEvaluations();
        int int17 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) 0);
        int int22 = multiDirectional21.getEvaluations();
        int int23 = multiDirectional21.getMaxEvaluations();
        multiDirectional21.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional21.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker26);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional0.getConvergenceChecker();
        int int29 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 0, (double) 97);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 35, (double) '#');
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction3 = null;
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        int int7 = multiDirectional5.getIterations();
        int int8 = multiDirectional5.getMaxEvaluations();
        int int9 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxIterations((-1));
        int int12 = multiDirectional5.getIterations();
        int int13 = multiDirectional5.getMaxIterations();
        multiDirectional5.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional5.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int18 = multiDirectional17.getMaxEvaluations();
        multiDirectional17.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = null;
        multiDirectional17.setConvergenceChecker(realConvergenceChecker21);
        double[] doubleArray25 = new double[] { 1.0d, 2147483647 };
        multiDirectional17.setStartConfiguration(doubleArray25);
        multiDirectional17.setMaxIterations((int) (byte) 100);
        int int29 = multiDirectional17.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) 0);
        int int33 = multiDirectional32.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker34 = null;
        multiDirectional32.setConvergenceChecker(realConvergenceChecker34);
        int int36 = multiDirectional32.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int38 = multiDirectional37.getMaxEvaluations();
        multiDirectional37.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) -1, (double) (-1L));
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional44 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int45 = multiDirectional44.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int47 = multiDirectional46.getMaxEvaluations();
        int int48 = multiDirectional46.getIterations();
        int int49 = multiDirectional46.getMaxEvaluations();
        int int50 = multiDirectional46.getMaxEvaluations();
        multiDirectional46.setMaxIterations((-1));
        int int53 = multiDirectional46.getMaxIterations();
        multiDirectional46.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional58 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker59 = multiDirectional58.getConvergenceChecker();
        multiDirectional46.setConvergenceChecker(realConvergenceChecker59);
        multiDirectional44.setConvergenceChecker(realConvergenceChecker59);
        multiDirectional43.setConvergenceChecker(realConvergenceChecker59);
        multiDirectional37.setConvergenceChecker(realConvergenceChecker59);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional((-1.0d), (double) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional69 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 32, (double) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional70 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int71 = multiDirectional70.getMaxEvaluations();
        multiDirectional70.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker74 = null;
        multiDirectional70.setConvergenceChecker(realConvergenceChecker74);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional76 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int77 = multiDirectional76.getMaxEvaluations();
        multiDirectional76.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker80 = null;
        multiDirectional76.setConvergenceChecker(realConvergenceChecker80);
        double[] doubleArray84 = new double[] { 1.0d, 2147483647 };
        multiDirectional76.setStartConfiguration(doubleArray84);
        multiDirectional70.setStartConfiguration(doubleArray84);
        multiDirectional69.setStartConfiguration(doubleArray84);
        multiDirectional66.setStartConfiguration(doubleArray84);
        multiDirectional37.setStartConfiguration(doubleArray84);
        multiDirectional32.setStartConfiguration(doubleArray84);
        multiDirectional17.setStartConfiguration(doubleArray84);
        multiDirectional5.setStartConfiguration(doubleArray84);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair93 = multiDirectional2.optimize(multivariateRealFunction3, goalType4, doubleArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker59);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2147483647 + "'", int77 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[1.0, 2.147483647E9]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100L, (double) 1);
        int int3 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int7 = multiDirectional6.getMaxEvaluations();
        int int8 = multiDirectional6.getIterations();
        int int9 = multiDirectional6.getMaxEvaluations();
        int int10 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxIterations((-1));
        int int13 = multiDirectional6.getIterations();
        multiDirectional6.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = null;
        multiDirectional6.setConvergenceChecker(realConvergenceChecker16);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getMaxEvaluations();
        multiDirectional18.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = null;
        multiDirectional18.setConvergenceChecker(realConvergenceChecker22);
        double[] doubleArray26 = new double[] { 1.0d, 2147483647 };
        multiDirectional18.setStartConfiguration(doubleArray26);
        multiDirectional6.setStartConfiguration(doubleArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair29 = multiDirectional2.optimize(multivariateRealFunction4, goalType5, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 2.147483647E9]");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 10, (double) 10.0f);
        int int3 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker4);
        double[] doubleArray8 = new double[] { 1.0d, 2147483647 };
        multiDirectional0.setStartConfiguration(doubleArray8);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations((int) (byte) 100);
        multiDirectional0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional0.getConvergenceChecker();
        int int16 = multiDirectional0.getEvaluations();
        int int17 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getMaxEvaluations();
        int int20 = multiDirectional18.getIterations();
        int int21 = multiDirectional18.getMaxEvaluations();
        int int22 = multiDirectional18.getMaxEvaluations();
        multiDirectional18.setMaxIterations((-1));
        int int25 = multiDirectional18.getIterations();
        int int26 = multiDirectional18.getEvaluations();
        int int27 = multiDirectional18.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxEvaluations();
        multiDirectional28.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = null;
        multiDirectional28.setConvergenceChecker(realConvergenceChecker32);
        double[] doubleArray36 = new double[] { 1.0d, 2147483647 };
        multiDirectional28.setStartConfiguration(doubleArray36);
        int int38 = multiDirectional28.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getMaxIterations();
        double[] doubleArray41 = new double[] {};
        multiDirectional39.setStartConfiguration(doubleArray41);
        multiDirectional28.setStartConfiguration(doubleArray41);
        multiDirectional18.setStartConfiguration(doubleArray41);
        multiDirectional0.setStartConfiguration(doubleArray41);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker46 = multiDirectional0.getConvergenceChecker();
        int int47 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker10);
        org.junit.Assert.assertNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNull(realConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 10, (double) 100.0f);
        multiDirectional2.setMaxEvaluations(35);
        int int5 = multiDirectional2.getEvaluations();
        multiDirectional2.setMaxIterations(35);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker8 = multiDirectional2.getConvergenceChecker();
        int int9 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 1.0f);
        int int3 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getMaxEvaluations();
        int int6 = multiDirectional4.getIterations();
        int int7 = multiDirectional4.getMaxEvaluations();
        int int8 = multiDirectional4.getMaxEvaluations();
        multiDirectional4.setMaxIterations((-1));
        int int11 = multiDirectional4.getMaxIterations();
        multiDirectional4.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional16.getConvergenceChecker();
        multiDirectional4.setConvergenceChecker(realConvergenceChecker17);
        int int19 = multiDirectional4.getMaxIterations();
        int int20 = multiDirectional4.getEvaluations();
        int int21 = multiDirectional4.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int23 = multiDirectional22.getMaxIterations();
        double[] doubleArray24 = new double[] {};
        multiDirectional22.setStartConfiguration(doubleArray24);
        multiDirectional4.setStartConfiguration(doubleArray24);
        int int27 = multiDirectional4.getEvaluations();
        int int28 = multiDirectional4.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getMaxEvaluations();
        multiDirectional29.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = null;
        multiDirectional29.setConvergenceChecker(realConvergenceChecker33);
        double[] doubleArray36 = new double[] { 100.0d };
        multiDirectional29.setStartConfiguration(doubleArray36);
        int int38 = multiDirectional29.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int42 = multiDirectional41.getMaxEvaluations();
        int int43 = multiDirectional41.getIterations();
        int int44 = multiDirectional41.getMaxEvaluations();
        int int45 = multiDirectional41.getMaxEvaluations();
        multiDirectional41.setMaxIterations((-1));
        int int48 = multiDirectional41.getMaxIterations();
        multiDirectional41.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker54 = multiDirectional53.getConvergenceChecker();
        multiDirectional41.setConvergenceChecker(realConvergenceChecker54);
        multiDirectional39.setConvergenceChecker(realConvergenceChecker54);
        multiDirectional29.setConvergenceChecker(realConvergenceChecker54);
        multiDirectional29.setMaxIterations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional60 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int61 = multiDirectional60.getMaxEvaluations();
        int int62 = multiDirectional60.getIterations();
        int int63 = multiDirectional60.getMaxEvaluations();
        int int64 = multiDirectional60.getMaxEvaluations();
        multiDirectional60.setMaxIterations((-1));
        int int67 = multiDirectional60.getMaxIterations();
        int int68 = multiDirectional60.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional69 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int70 = multiDirectional69.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker71 = null;
        multiDirectional69.setConvergenceChecker(realConvergenceChecker71);
        multiDirectional69.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional77 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker78 = multiDirectional77.getConvergenceChecker();
        multiDirectional69.setConvergenceChecker(realConvergenceChecker78);
        multiDirectional60.setConvergenceChecker(realConvergenceChecker78);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional83 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional84 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int85 = multiDirectional84.getMaxIterations();
        double[] doubleArray86 = new double[] {};
        multiDirectional84.setStartConfiguration(doubleArray86);
        int int88 = multiDirectional84.getMaxEvaluations();
        int int89 = multiDirectional84.getIterations();
        int int90 = multiDirectional84.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker91 = multiDirectional84.getConvergenceChecker();
        multiDirectional83.setConvergenceChecker(realConvergenceChecker91);
        double[] doubleArray93 = new double[] {};
        double[][] doubleArray94 = new double[][] { doubleArray93 };
        multiDirectional83.setStartConfiguration(doubleArray94);
        multiDirectional60.setStartConfiguration(doubleArray94);
        multiDirectional29.setStartConfiguration(doubleArray94);
        multiDirectional4.setStartConfiguration(doubleArray94);
        multiDirectional2.setStartConfiguration(doubleArray94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker54);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2147483647 + "'", int70 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker78);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2147483647 + "'", int85 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[]");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2147483647 + "'", int88 == 2147483647);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2147483647 + "'", int90 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker91);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[]");
        org.junit.Assert.assertNotNull(doubleArray94);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int7 = multiDirectional6.getMaxIterations();
        double[] doubleArray8 = new double[] {};
        multiDirectional6.setStartConfiguration(doubleArray8);
        int int10 = multiDirectional6.getMaxEvaluations();
        int int11 = multiDirectional6.getMaxIterations();
        int int12 = multiDirectional6.getMaxIterations();
        multiDirectional6.setMaxIterations(32);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional6.getConvergenceChecker();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional6.getConvergenceChecker();
        int int17 = multiDirectional6.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getMaxEvaluations();
        int int20 = multiDirectional18.getIterations();
        int int21 = multiDirectional18.getMaxEvaluations();
        int int22 = multiDirectional18.getMaxEvaluations();
        multiDirectional18.setMaxIterations((-1));
        int int25 = multiDirectional18.getMaxIterations();
        multiDirectional18.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker31 = multiDirectional30.getConvergenceChecker();
        multiDirectional18.setConvergenceChecker(realConvergenceChecker31);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker35 = null;
        multiDirectional33.setConvergenceChecker(realConvergenceChecker35);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int38 = multiDirectional37.getMaxEvaluations();
        multiDirectional37.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker41 = null;
        multiDirectional37.setConvergenceChecker(realConvergenceChecker41);
        double[] doubleArray45 = new double[] { 1.0d, 2147483647 };
        multiDirectional37.setStartConfiguration(doubleArray45);
        int int47 = multiDirectional37.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int49 = multiDirectional48.getMaxIterations();
        double[] doubleArray50 = new double[] {};
        multiDirectional48.setStartConfiguration(doubleArray50);
        multiDirectional37.setStartConfiguration(doubleArray50);
        multiDirectional33.setStartConfiguration(doubleArray50);
        multiDirectional18.setStartConfiguration(doubleArray50);
        multiDirectional6.setStartConfiguration(doubleArray50);
        multiDirectional0.setStartConfiguration(doubleArray50);
        int int57 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        int int4 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = null;
        multiDirectional5.setConvergenceChecker(realConvergenceChecker9);
        double[] doubleArray13 = new double[] { 1.0d, 2147483647 };
        multiDirectional5.setStartConfiguration(doubleArray13);
        int int15 = multiDirectional5.getMaxIterations();
        int int16 = multiDirectional5.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = null;
        multiDirectional5.setConvergenceChecker(realConvergenceChecker17);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional5.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) -1, (double) 10.0f);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        multiDirectional23.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = null;
        multiDirectional23.setConvergenceChecker(realConvergenceChecker27);
        double[] doubleArray30 = new double[] { 100.0d };
        multiDirectional23.setStartConfiguration(doubleArray30);
        int int32 = multiDirectional23.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int36 = multiDirectional35.getMaxEvaluations();
        int int37 = multiDirectional35.getIterations();
        int int38 = multiDirectional35.getMaxEvaluations();
        int int39 = multiDirectional35.getMaxEvaluations();
        multiDirectional35.setMaxIterations((-1));
        int int42 = multiDirectional35.getMaxIterations();
        multiDirectional35.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker48 = multiDirectional47.getConvergenceChecker();
        multiDirectional35.setConvergenceChecker(realConvergenceChecker48);
        multiDirectional33.setConvergenceChecker(realConvergenceChecker48);
        multiDirectional23.setConvergenceChecker(realConvergenceChecker48);
        multiDirectional23.setMaxIterations(100);
        multiDirectional23.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional58 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1.0f, (double) '4');
        multiDirectional58.setMaxIterations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional63 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional67 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int68 = multiDirectional67.getMaxIterations();
        double[] doubleArray69 = new double[] {};
        multiDirectional67.setStartConfiguration(doubleArray69);
        int int71 = multiDirectional67.getMaxEvaluations();
        int int72 = multiDirectional67.getIterations();
        int int73 = multiDirectional67.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker74 = multiDirectional67.getConvergenceChecker();
        multiDirectional66.setConvergenceChecker(realConvergenceChecker74);
        double[] doubleArray76 = new double[] {};
        double[][] doubleArray77 = new double[][] { doubleArray76 };
        multiDirectional66.setStartConfiguration(doubleArray77);
        multiDirectional63.setStartConfiguration(doubleArray77);
        multiDirectional58.setStartConfiguration(doubleArray77);
        multiDirectional23.setStartConfiguration(doubleArray77);
        multiDirectional22.setStartConfiguration(doubleArray77);
        multiDirectional5.setStartConfiguration(doubleArray77);
        multiDirectional0.setStartConfiguration(doubleArray77);
        int int85 = multiDirectional0.getMaxIterations();
        int int86 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker48);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2147483647 + "'", int73 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker74);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        double[] doubleArray2 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray2);
        int int4 = multiDirectional0.getMaxEvaluations();
        int int5 = multiDirectional0.getMaxIterations();
        int int6 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations(32);
        multiDirectional0.setMaxEvaluations((-1));
        multiDirectional0.setMaxEvaluations(0);
        multiDirectional0.setMaxIterations((int) (byte) 100);
        multiDirectional0.setMaxIterations((int) (byte) 0);
        multiDirectional0.setMaxIterations((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int3 = multiDirectional2.getMaxEvaluations();
        int int4 = multiDirectional2.getIterations();
        int int5 = multiDirectional2.getMaxEvaluations();
        int int6 = multiDirectional2.getMaxEvaluations();
        multiDirectional2.setMaxIterations((-1));
        int int9 = multiDirectional2.getMaxIterations();
        multiDirectional2.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional14.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker15);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker15);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional0.getConvergenceChecker();
        int int19 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations(10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int23 = multiDirectional22.getMaxIterations();
        double[] doubleArray24 = new double[] {};
        multiDirectional22.setStartConfiguration(doubleArray24);
        int int26 = multiDirectional22.getMaxEvaluations();
        int int27 = multiDirectional22.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional22.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getMaxEvaluations();
        multiDirectional29.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = null;
        multiDirectional29.setConvergenceChecker(realConvergenceChecker33);
        double[] doubleArray37 = new double[] { 1.0d, 2147483647 };
        multiDirectional29.setStartConfiguration(doubleArray37);
        multiDirectional29.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) 0);
        int int44 = multiDirectional43.getEvaluations();
        int int45 = multiDirectional43.getMaxEvaluations();
        multiDirectional43.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int49 = multiDirectional48.getMaxEvaluations();
        int int50 = multiDirectional48.getIterations();
        int int51 = multiDirectional48.getMaxEvaluations();
        int int52 = multiDirectional48.getMaxEvaluations();
        multiDirectional48.setMaxIterations((-1));
        int int55 = multiDirectional48.getMaxIterations();
        int int56 = multiDirectional48.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int58 = multiDirectional57.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker59 = null;
        multiDirectional57.setConvergenceChecker(realConvergenceChecker59);
        multiDirectional57.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional65 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker66 = multiDirectional65.getConvergenceChecker();
        multiDirectional57.setConvergenceChecker(realConvergenceChecker66);
        multiDirectional48.setConvergenceChecker(realConvergenceChecker66);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional71 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional72 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int73 = multiDirectional72.getMaxIterations();
        double[] doubleArray74 = new double[] {};
        multiDirectional72.setStartConfiguration(doubleArray74);
        int int76 = multiDirectional72.getMaxEvaluations();
        int int77 = multiDirectional72.getIterations();
        int int78 = multiDirectional72.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker79 = multiDirectional72.getConvergenceChecker();
        multiDirectional71.setConvergenceChecker(realConvergenceChecker79);
        double[] doubleArray81 = new double[] {};
        double[][] doubleArray82 = new double[][] { doubleArray81 };
        multiDirectional71.setStartConfiguration(doubleArray82);
        multiDirectional48.setStartConfiguration(doubleArray82);
        multiDirectional43.setStartConfiguration(doubleArray82);
        multiDirectional29.setStartConfiguration(doubleArray82);
        multiDirectional22.setStartConfiguration(doubleArray82);
        multiDirectional0.setStartConfiguration(doubleArray82);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker66);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2147483647 + "'", int73 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2147483647 + "'", int76 == 2147483647);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2147483647 + "'", int78 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker79);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertNotNull(doubleArray82);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations((int) '#');
        int int10 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = null;
        multiDirectional13.setConvergenceChecker(realConvergenceChecker15);
        multiDirectional13.setMaxEvaluations((int) ' ');
        int int19 = multiDirectional13.getEvaluations();
        int int20 = multiDirectional13.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) -1, 0.0d);
        multiDirectional23.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int27 = multiDirectional26.getMaxEvaluations();
        multiDirectional26.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = null;
        multiDirectional26.setConvergenceChecker(realConvergenceChecker30);
        double[] doubleArray34 = new double[] { 1.0d, 2147483647 };
        multiDirectional26.setStartConfiguration(doubleArray34);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker36 = multiDirectional26.getConvergenceChecker();
        multiDirectional26.setMaxEvaluations((int) (byte) 100);
        multiDirectional26.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker41 = multiDirectional26.getConvergenceChecker();
        int int42 = multiDirectional26.getEvaluations();
        int int43 = multiDirectional26.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional44 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int45 = multiDirectional44.getMaxEvaluations();
        int int46 = multiDirectional44.getIterations();
        int int47 = multiDirectional44.getMaxEvaluations();
        int int48 = multiDirectional44.getMaxEvaluations();
        multiDirectional44.setMaxIterations((-1));
        int int51 = multiDirectional44.getIterations();
        int int52 = multiDirectional44.getEvaluations();
        int int53 = multiDirectional44.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional54 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int55 = multiDirectional54.getMaxEvaluations();
        multiDirectional54.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker58 = null;
        multiDirectional54.setConvergenceChecker(realConvergenceChecker58);
        double[] doubleArray62 = new double[] { 1.0d, 2147483647 };
        multiDirectional54.setStartConfiguration(doubleArray62);
        int int64 = multiDirectional54.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional65 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int66 = multiDirectional65.getMaxIterations();
        double[] doubleArray67 = new double[] {};
        multiDirectional65.setStartConfiguration(doubleArray67);
        multiDirectional54.setStartConfiguration(doubleArray67);
        multiDirectional44.setStartConfiguration(doubleArray67);
        multiDirectional26.setStartConfiguration(doubleArray67);
        multiDirectional23.setStartConfiguration(doubleArray67);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional75 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) '#', (-1.0d));
        multiDirectional75.setMaxEvaluations((int) (byte) 0);
        double[] doubleArray80 = new double[] { (-1.0f), ' ' };
        multiDirectional75.setStartConfiguration(doubleArray80);
        multiDirectional23.setStartConfiguration(doubleArray80);
        multiDirectional13.setStartConfiguration(doubleArray80);
        multiDirectional0.setStartConfiguration(doubleArray80);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker36);
        org.junit.Assert.assertNull(realConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2147483647 + "'", int66 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, 32.0]");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional12.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker13);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = null;
        multiDirectional15.setConvergenceChecker(realConvergenceChecker17);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getMaxEvaluations();
        multiDirectional19.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = null;
        multiDirectional19.setConvergenceChecker(realConvergenceChecker23);
        double[] doubleArray27 = new double[] { 1.0d, 2147483647 };
        multiDirectional19.setStartConfiguration(doubleArray27);
        int int29 = multiDirectional19.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int31 = multiDirectional30.getMaxIterations();
        double[] doubleArray32 = new double[] {};
        multiDirectional30.setStartConfiguration(doubleArray32);
        multiDirectional19.setStartConfiguration(doubleArray32);
        multiDirectional15.setStartConfiguration(doubleArray32);
        multiDirectional0.setStartConfiguration(doubleArray32);
        int int37 = multiDirectional0.getEvaluations();
        int int38 = multiDirectional0.getMaxEvaluations();
        double[] doubleArray39 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.setStartConfiguration(doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getIterations();
        int int8 = multiDirectional0.getEvaluations();
        int int9 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        multiDirectional10.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = null;
        multiDirectional10.setConvergenceChecker(realConvergenceChecker14);
        double[] doubleArray18 = new double[] { 1.0d, 2147483647 };
        multiDirectional10.setStartConfiguration(doubleArray18);
        int int20 = multiDirectional10.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int22 = multiDirectional21.getMaxIterations();
        double[] doubleArray23 = new double[] {};
        multiDirectional21.setStartConfiguration(doubleArray23);
        multiDirectional10.setStartConfiguration(doubleArray23);
        multiDirectional0.setStartConfiguration(doubleArray23);
        int int27 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional0.getConvergenceChecker();
        int int29 = multiDirectional0.getMaxIterations();
        int int30 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional12.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker13);
        int int15 = multiDirectional0.getMaxIterations();
        int int16 = multiDirectional0.getEvaluations();
        int int17 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getMaxIterations();
        double[] doubleArray20 = new double[] {};
        multiDirectional18.setStartConfiguration(doubleArray20);
        multiDirectional0.setStartConfiguration(doubleArray20);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        int int25 = multiDirectional23.getIterations();
        int int26 = multiDirectional23.getMaxEvaluations();
        int int27 = multiDirectional23.getMaxEvaluations();
        multiDirectional23.setMaxIterations((-1));
        int int30 = multiDirectional23.getIterations();
        int int31 = multiDirectional23.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = multiDirectional23.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxEvaluations();
        int int35 = multiDirectional33.getIterations();
        int int36 = multiDirectional33.getMaxEvaluations();
        int int37 = multiDirectional33.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int39 = multiDirectional38.getMaxIterations();
        double[] doubleArray40 = new double[] {};
        multiDirectional38.setStartConfiguration(doubleArray40);
        multiDirectional33.setStartConfiguration(doubleArray40);
        multiDirectional23.setStartConfiguration(doubleArray40);
        multiDirectional0.setStartConfiguration(doubleArray40);
        int int45 = multiDirectional0.getMaxEvaluations();
        int int46 = multiDirectional0.getIterations();
        int int47 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((-1.0d), (double) (byte) 1);
        int int3 = multiDirectional2.getEvaluations();
        int int4 = multiDirectional2.getMaxEvaluations();
        int int5 = multiDirectional2.getMaxIterations();
        int int6 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        multiDirectional0.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxIterations();
        double[] doubleArray11 = new double[] {};
        multiDirectional9.setStartConfiguration(doubleArray11);
        int int13 = multiDirectional9.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int15 = multiDirectional14.getMaxEvaluations();
        int int16 = multiDirectional14.getIterations();
        int int17 = multiDirectional14.getMaxEvaluations();
        int int18 = multiDirectional14.getMaxEvaluations();
        multiDirectional14.setMaxIterations((-1));
        int int21 = multiDirectional14.getIterations();
        int int22 = multiDirectional14.getEvaluations();
        int int23 = multiDirectional14.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = null;
        multiDirectional24.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional24.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional32.getConvergenceChecker();
        multiDirectional24.setConvergenceChecker(realConvergenceChecker33);
        multiDirectional14.setConvergenceChecker(realConvergenceChecker33);
        int int36 = multiDirectional14.getMaxIterations();
        int int37 = multiDirectional14.getEvaluations();
        int int38 = multiDirectional14.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 'a', (double) 2147483647);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int43 = multiDirectional42.getMaxEvaluations();
        multiDirectional42.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker46 = null;
        multiDirectional42.setConvergenceChecker(realConvergenceChecker46);
        double[] doubleArray50 = new double[] { 1.0d, 2147483647 };
        multiDirectional42.setStartConfiguration(doubleArray50);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker52 = multiDirectional42.getConvergenceChecker();
        multiDirectional42.setMaxEvaluations((int) (byte) 100);
        multiDirectional42.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker57 = multiDirectional42.getConvergenceChecker();
        int int58 = multiDirectional42.getEvaluations();
        int int59 = multiDirectional42.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional60 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int61 = multiDirectional60.getMaxEvaluations();
        int int62 = multiDirectional60.getIterations();
        int int63 = multiDirectional60.getMaxEvaluations();
        int int64 = multiDirectional60.getMaxEvaluations();
        multiDirectional60.setMaxIterations((-1));
        int int67 = multiDirectional60.getIterations();
        int int68 = multiDirectional60.getEvaluations();
        int int69 = multiDirectional60.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional70 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int71 = multiDirectional70.getMaxEvaluations();
        multiDirectional70.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker74 = null;
        multiDirectional70.setConvergenceChecker(realConvergenceChecker74);
        double[] doubleArray78 = new double[] { 1.0d, 2147483647 };
        multiDirectional70.setStartConfiguration(doubleArray78);
        int int80 = multiDirectional70.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional81 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int82 = multiDirectional81.getMaxIterations();
        double[] doubleArray83 = new double[] {};
        multiDirectional81.setStartConfiguration(doubleArray83);
        multiDirectional70.setStartConfiguration(doubleArray83);
        multiDirectional60.setStartConfiguration(doubleArray83);
        multiDirectional42.setStartConfiguration(doubleArray83);
        multiDirectional41.setStartConfiguration(doubleArray83);
        multiDirectional14.setStartConfiguration(doubleArray83);
        multiDirectional9.setStartConfiguration(doubleArray83);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair91 = multiDirectional0.optimize(multivariateRealFunction7, goalType8, doubleArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker52);
        org.junit.Assert.assertNull(realConvergenceChecker57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2147483647 + "'", int80 == 2147483647);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2147483647 + "'", int82 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        double[] doubleArray2 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray2);
        int int4 = multiDirectional0.getMaxEvaluations();
        int int5 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((-1.0d), (double) 1);
        int int3 = multiDirectional2.getMaxEvaluations();
        multiDirectional2.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10, (double) 0);
        multiDirectional2.setMaxIterations((int) (byte) 10);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, 0.0d);
        multiDirectional2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        multiDirectional10.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = null;
        multiDirectional10.setConvergenceChecker(realConvergenceChecker14);
        double[] doubleArray18 = new double[] { 1.0d, 2147483647 };
        multiDirectional10.setStartConfiguration(doubleArray18);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker20 = multiDirectional10.getConvergenceChecker();
        multiDirectional10.setMaxEvaluations((int) (byte) 100);
        multiDirectional10.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int26 = multiDirectional25.getMaxEvaluations();
        multiDirectional25.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker29 = null;
        multiDirectional25.setConvergenceChecker(realConvergenceChecker29);
        double[] doubleArray33 = new double[] { 1.0d, 2147483647 };
        multiDirectional25.setStartConfiguration(doubleArray33);
        int int35 = multiDirectional25.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int37 = multiDirectional36.getMaxIterations();
        double[] doubleArray38 = new double[] {};
        multiDirectional36.setStartConfiguration(doubleArray38);
        multiDirectional25.setStartConfiguration(doubleArray38);
        multiDirectional10.setStartConfiguration(doubleArray38);
        multiDirectional9.setStartConfiguration(doubleArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair43 = multiDirectional2.optimize(multivariateRealFunction5, goalType6, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100, (double) 0L);
        multiDirectional2.setMaxIterations((int) (short) 0);
        int int5 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional2.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = realConvergenceChecker6.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) '#', (double) 10.0f);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional2.getConvergenceChecker();
        multiDirectional2.setMaxIterations((int) 'a');
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int3 = multiDirectional2.getMaxEvaluations();
        int int4 = multiDirectional2.getIterations();
        int int5 = multiDirectional2.getMaxEvaluations();
        int int6 = multiDirectional2.getMaxEvaluations();
        multiDirectional2.setMaxIterations((-1));
        int int9 = multiDirectional2.getMaxIterations();
        multiDirectional2.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional14.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker15);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker15);
        multiDirectional0.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int21 = multiDirectional20.getMaxEvaluations();
        int int22 = multiDirectional20.getIterations();
        int int23 = multiDirectional20.getMaxEvaluations();
        int int24 = multiDirectional20.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker25 = multiDirectional20.getConvergenceChecker();
        int int26 = multiDirectional20.getIterations();
        int int27 = multiDirectional20.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = null;
        multiDirectional28.setConvergenceChecker(realConvergenceChecker30);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        multiDirectional32.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker36 = null;
        multiDirectional32.setConvergenceChecker(realConvergenceChecker36);
        double[] doubleArray40 = new double[] { 1.0d, 2147483647 };
        multiDirectional32.setStartConfiguration(doubleArray40);
        int int42 = multiDirectional32.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int44 = multiDirectional43.getMaxIterations();
        double[] doubleArray45 = new double[] {};
        multiDirectional43.setStartConfiguration(doubleArray45);
        multiDirectional32.setStartConfiguration(doubleArray45);
        multiDirectional28.setStartConfiguration(doubleArray45);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int50 = multiDirectional49.getMaxEvaluations();
        int int51 = multiDirectional49.getIterations();
        int int52 = multiDirectional49.getMaxEvaluations();
        int int53 = multiDirectional49.getMaxEvaluations();
        multiDirectional49.setMaxIterations((-1));
        int int56 = multiDirectional49.getMaxIterations();
        multiDirectional49.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional61 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional61.getConvergenceChecker();
        multiDirectional49.setConvergenceChecker(realConvergenceChecker62);
        multiDirectional28.setConvergenceChecker(realConvergenceChecker62);
        multiDirectional20.setConvergenceChecker(realConvergenceChecker62);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker62);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker4);
        double[] doubleArray8 = new double[] { 1.0d, 2147483647 };
        multiDirectional0.setStartConfiguration(doubleArray8);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations((int) (byte) 100);
        multiDirectional0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional0.getConvergenceChecker();
        int int16 = multiDirectional0.getEvaluations();
        int int17 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getMaxEvaluations();
        int int20 = multiDirectional18.getIterations();
        int int21 = multiDirectional18.getMaxEvaluations();
        int int22 = multiDirectional18.getMaxEvaluations();
        multiDirectional18.setMaxIterations((-1));
        int int25 = multiDirectional18.getIterations();
        int int26 = multiDirectional18.getEvaluations();
        int int27 = multiDirectional18.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxEvaluations();
        multiDirectional28.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = null;
        multiDirectional28.setConvergenceChecker(realConvergenceChecker32);
        double[] doubleArray36 = new double[] { 1.0d, 2147483647 };
        multiDirectional28.setStartConfiguration(doubleArray36);
        int int38 = multiDirectional28.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getMaxIterations();
        double[] doubleArray41 = new double[] {};
        multiDirectional39.setStartConfiguration(doubleArray41);
        multiDirectional28.setStartConfiguration(doubleArray41);
        multiDirectional18.setStartConfiguration(doubleArray41);
        multiDirectional0.setStartConfiguration(doubleArray41);
        int int46 = multiDirectional0.getIterations();
        int int47 = multiDirectional0.getMaxEvaluations();
        int int48 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations((int) (byte) -1);
        int int51 = multiDirectional0.getIterations();
        int int52 = multiDirectional0.getIterations();
        int int53 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker10);
        org.junit.Assert.assertNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        double[] doubleArray2 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray2);
        multiDirectional0.setMaxIterations(0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int7 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = null;
        multiDirectional6.setConvergenceChecker(realConvergenceChecker10);
        double[] doubleArray14 = new double[] { 1.0d, 2147483647 };
        multiDirectional6.setStartConfiguration(doubleArray14);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional6.getConvergenceChecker();
        multiDirectional6.setMaxEvaluations((int) (byte) 100);
        multiDirectional6.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = multiDirectional6.getConvergenceChecker();
        int int22 = multiDirectional6.getEvaluations();
        int int23 = multiDirectional6.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxEvaluations();
        int int26 = multiDirectional24.getIterations();
        int int27 = multiDirectional24.getMaxEvaluations();
        int int28 = multiDirectional24.getMaxEvaluations();
        multiDirectional24.setMaxIterations((-1));
        int int31 = multiDirectional24.getIterations();
        int int32 = multiDirectional24.getEvaluations();
        int int33 = multiDirectional24.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int35 = multiDirectional34.getMaxEvaluations();
        multiDirectional34.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = null;
        multiDirectional34.setConvergenceChecker(realConvergenceChecker38);
        double[] doubleArray42 = new double[] { 1.0d, 2147483647 };
        multiDirectional34.setStartConfiguration(doubleArray42);
        int int44 = multiDirectional34.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int46 = multiDirectional45.getMaxIterations();
        double[] doubleArray47 = new double[] {};
        multiDirectional45.setStartConfiguration(doubleArray47);
        multiDirectional34.setStartConfiguration(doubleArray47);
        multiDirectional24.setStartConfiguration(doubleArray47);
        multiDirectional6.setStartConfiguration(doubleArray47);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional52 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int53 = multiDirectional52.getMaxEvaluations();
        int int54 = multiDirectional52.getIterations();
        int int55 = multiDirectional52.getMaxEvaluations();
        int int56 = multiDirectional52.getMaxEvaluations();
        multiDirectional52.setMaxIterations((-1));
        int int59 = multiDirectional52.getMaxIterations();
        multiDirectional52.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional64 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker65 = multiDirectional64.getConvergenceChecker();
        multiDirectional52.setConvergenceChecker(realConvergenceChecker65);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional67 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int68 = multiDirectional67.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker69 = null;
        multiDirectional67.setConvergenceChecker(realConvergenceChecker69);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional71 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int72 = multiDirectional71.getMaxEvaluations();
        multiDirectional71.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker75 = null;
        multiDirectional71.setConvergenceChecker(realConvergenceChecker75);
        double[] doubleArray79 = new double[] { 1.0d, 2147483647 };
        multiDirectional71.setStartConfiguration(doubleArray79);
        int int81 = multiDirectional71.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional82 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int83 = multiDirectional82.getMaxIterations();
        double[] doubleArray84 = new double[] {};
        multiDirectional82.setStartConfiguration(doubleArray84);
        multiDirectional71.setStartConfiguration(doubleArray84);
        multiDirectional67.setStartConfiguration(doubleArray84);
        multiDirectional52.setStartConfiguration(doubleArray84);
        multiDirectional6.setStartConfiguration(doubleArray84);
        multiDirectional0.setStartConfiguration(doubleArray84);
        int int91 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker16);
        org.junit.Assert.assertNull(realConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2147483647 + "'", int72 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2147483647 + "'", int81 == 2147483647);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2147483647 + "'", int83 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 0, (double) (-1L));
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        int int5 = multiDirectional3.getIterations();
        int int6 = multiDirectional3.getMaxEvaluations();
        int int7 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxIterations((-1));
        int int10 = multiDirectional3.getMaxIterations();
        multiDirectional3.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional15.getConvergenceChecker();
        multiDirectional3.setConvergenceChecker(realConvergenceChecker16);
        int int18 = multiDirectional3.getMaxIterations();
        int int19 = multiDirectional3.getEvaluations();
        int int20 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxIterations();
        double[] doubleArray25 = new double[] {};
        multiDirectional23.setStartConfiguration(doubleArray25);
        int int27 = multiDirectional23.getMaxEvaluations();
        int int28 = multiDirectional23.getMaxIterations();
        int int29 = multiDirectional23.getMaxIterations();
        multiDirectional23.setMaxIterations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        int int34 = multiDirectional32.getIterations();
        int int35 = multiDirectional32.getMaxEvaluations();
        int int36 = multiDirectional32.getMaxEvaluations();
        multiDirectional32.setMaxIterations((-1));
        int int39 = multiDirectional32.getMaxIterations();
        int int40 = multiDirectional32.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int42 = multiDirectional41.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker43 = null;
        multiDirectional41.setConvergenceChecker(realConvergenceChecker43);
        multiDirectional41.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker50 = multiDirectional49.getConvergenceChecker();
        multiDirectional41.setConvergenceChecker(realConvergenceChecker50);
        multiDirectional32.setConvergenceChecker(realConvergenceChecker50);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int57 = multiDirectional56.getMaxIterations();
        double[] doubleArray58 = new double[] {};
        multiDirectional56.setStartConfiguration(doubleArray58);
        int int60 = multiDirectional56.getMaxEvaluations();
        int int61 = multiDirectional56.getIterations();
        int int62 = multiDirectional56.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker63 = multiDirectional56.getConvergenceChecker();
        multiDirectional55.setConvergenceChecker(realConvergenceChecker63);
        double[] doubleArray65 = new double[] {};
        double[][] doubleArray66 = new double[][] { doubleArray65 };
        multiDirectional55.setStartConfiguration(doubleArray66);
        multiDirectional32.setStartConfiguration(doubleArray66);
        multiDirectional23.setStartConfiguration(doubleArray66);
        multiDirectional3.setStartConfiguration(doubleArray66);
        multiDirectional2.setStartConfiguration(doubleArray66);
        int int72 = multiDirectional2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2147483647 + "'", int62 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker63);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        int int4 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations((int) '#');
        int int7 = multiDirectional0.getMaxEvaluations();
        int int8 = multiDirectional0.getIterations();
        multiDirectional0.setMaxEvaluations((int) (byte) 1);
        multiDirectional0.setMaxIterations(100);
        int int13 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int15 = multiDirectional14.getMaxIterations();
        double[] doubleArray16 = new double[] {};
        multiDirectional14.setStartConfiguration(doubleArray16);
        int int18 = multiDirectional14.getMaxEvaluations();
        int int19 = multiDirectional14.getIterations();
        int int20 = multiDirectional14.getMaxEvaluations();
        int int21 = multiDirectional14.getMaxEvaluations();
        multiDirectional14.setMaxEvaluations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxEvaluations();
        multiDirectional24.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = null;
        multiDirectional24.setConvergenceChecker(realConvergenceChecker28);
        double[] doubleArray31 = new double[] { 100.0d };
        multiDirectional24.setStartConfiguration(doubleArray31);
        multiDirectional14.setStartConfiguration(doubleArray31);
        multiDirectional0.setStartConfiguration(doubleArray31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) 0);
        int int3 = multiDirectional2.getEvaluations();
        int int4 = multiDirectional2.getMaxEvaluations();
        multiDirectional2.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getMaxEvaluations();
        int int9 = multiDirectional7.getIterations();
        int int10 = multiDirectional7.getMaxEvaluations();
        int int11 = multiDirectional7.getMaxEvaluations();
        multiDirectional7.setMaxIterations((-1));
        int int14 = multiDirectional7.getMaxIterations();
        int int15 = multiDirectional7.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int17 = multiDirectional16.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = null;
        multiDirectional16.setConvergenceChecker(realConvergenceChecker18);
        multiDirectional16.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker25 = multiDirectional24.getConvergenceChecker();
        multiDirectional16.setConvergenceChecker(realConvergenceChecker25);
        multiDirectional7.setConvergenceChecker(realConvergenceChecker25);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int32 = multiDirectional31.getMaxIterations();
        double[] doubleArray33 = new double[] {};
        multiDirectional31.setStartConfiguration(doubleArray33);
        int int35 = multiDirectional31.getMaxEvaluations();
        int int36 = multiDirectional31.getIterations();
        int int37 = multiDirectional31.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = multiDirectional31.getConvergenceChecker();
        multiDirectional30.setConvergenceChecker(realConvergenceChecker38);
        double[] doubleArray40 = new double[] {};
        double[][] doubleArray41 = new double[][] { doubleArray40 };
        multiDirectional30.setStartConfiguration(doubleArray41);
        multiDirectional7.setStartConfiguration(doubleArray41);
        multiDirectional2.setStartConfiguration(doubleArray41);
        int int45 = multiDirectional2.getMaxIterations();
        multiDirectional2.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = null;
        multiDirectional3.setConvergenceChecker(realConvergenceChecker7);
        double[] doubleArray11 = new double[] { 1.0d, 2147483647 };
        multiDirectional3.setStartConfiguration(doubleArray11);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional3.getConvergenceChecker();
        multiDirectional3.setMaxEvaluations((int) (byte) 100);
        multiDirectional3.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getMaxEvaluations();
        multiDirectional18.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = null;
        multiDirectional18.setConvergenceChecker(realConvergenceChecker22);
        double[] doubleArray26 = new double[] { 1.0d, 2147483647 };
        multiDirectional18.setStartConfiguration(doubleArray26);
        int int28 = multiDirectional18.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getMaxIterations();
        double[] doubleArray31 = new double[] {};
        multiDirectional29.setStartConfiguration(doubleArray31);
        multiDirectional18.setStartConfiguration(doubleArray31);
        multiDirectional3.setStartConfiguration(doubleArray31);
        multiDirectional2.setStartConfiguration(doubleArray31);
        int int36 = multiDirectional2.getIterations();
        multiDirectional2.setMaxIterations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getMaxEvaluations();
        multiDirectional39.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker43 = null;
        multiDirectional39.setConvergenceChecker(realConvergenceChecker43);
        double[] doubleArray47 = new double[] { 1.0d, 2147483647 };
        multiDirectional39.setStartConfiguration(doubleArray47);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker49 = multiDirectional39.getConvergenceChecker();
        multiDirectional39.setMaxEvaluations((int) (byte) 100);
        multiDirectional39.setMaxIterations(35);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker54 = multiDirectional39.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional((-1.0d), (double) 'a');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker58 = multiDirectional57.getConvergenceChecker();
        multiDirectional39.setConvergenceChecker(realConvergenceChecker58);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker58);
        multiDirectional2.setMaxIterations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker49);
        org.junit.Assert.assertNull(realConvergenceChecker54);
        org.junit.Assert.assertNotNull(realConvergenceChecker58);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker4);
        double[] doubleArray8 = new double[] { 1.0d, 2147483647 };
        multiDirectional0.setStartConfiguration(doubleArray8);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations((int) (byte) 100);
        multiDirectional0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional0.getConvergenceChecker();
        int int16 = multiDirectional0.getEvaluations();
        int int17 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getMaxEvaluations();
        int int20 = multiDirectional18.getIterations();
        int int21 = multiDirectional18.getMaxEvaluations();
        int int22 = multiDirectional18.getMaxEvaluations();
        multiDirectional18.setMaxIterations((-1));
        int int25 = multiDirectional18.getIterations();
        int int26 = multiDirectional18.getEvaluations();
        int int27 = multiDirectional18.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxEvaluations();
        multiDirectional28.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = null;
        multiDirectional28.setConvergenceChecker(realConvergenceChecker32);
        double[] doubleArray36 = new double[] { 1.0d, 2147483647 };
        multiDirectional28.setStartConfiguration(doubleArray36);
        int int38 = multiDirectional28.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getMaxIterations();
        double[] doubleArray41 = new double[] {};
        multiDirectional39.setStartConfiguration(doubleArray41);
        multiDirectional28.setStartConfiguration(doubleArray41);
        multiDirectional18.setStartConfiguration(doubleArray41);
        multiDirectional0.setStartConfiguration(doubleArray41);
        int int46 = multiDirectional0.getIterations();
        int int47 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker10);
        org.junit.Assert.assertNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        double[] doubleArray2 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray2);
        int int4 = multiDirectional0.getMaxEvaluations();
        int int5 = multiDirectional0.getIterations();
        double[] doubleArray11 = new double[] { (byte) -1, 1.0f, 100.0d, 100.0f, (short) -1 };
        multiDirectional0.setStartConfiguration(doubleArray11);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        int int15 = multiDirectional13.getIterations();
        int int16 = multiDirectional13.getMaxEvaluations();
        int int17 = multiDirectional13.getMaxEvaluations();
        multiDirectional13.setMaxIterations((-1));
        int int20 = multiDirectional13.getIterations();
        int int21 = multiDirectional13.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional13.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        int int25 = multiDirectional23.getIterations();
        int int26 = multiDirectional23.getMaxEvaluations();
        int int27 = multiDirectional23.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxIterations();
        double[] doubleArray30 = new double[] {};
        multiDirectional28.setStartConfiguration(doubleArray30);
        multiDirectional23.setStartConfiguration(doubleArray30);
        multiDirectional13.setStartConfiguration(doubleArray30);
        multiDirectional0.setStartConfiguration(doubleArray30);
        multiDirectional0.setMaxEvaluations((int) '#');
        int int37 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int39 = multiDirectional38.getMaxEvaluations();
        int int40 = multiDirectional38.getIterations();
        int int41 = multiDirectional38.getMaxEvaluations();
        int int42 = multiDirectional38.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int44 = multiDirectional43.getMaxIterations();
        double[] doubleArray45 = new double[] {};
        multiDirectional43.setStartConfiguration(doubleArray45);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int48 = multiDirectional47.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int50 = multiDirectional49.getMaxEvaluations();
        int int51 = multiDirectional49.getIterations();
        int int52 = multiDirectional49.getMaxEvaluations();
        int int53 = multiDirectional49.getMaxEvaluations();
        multiDirectional49.setMaxIterations((-1));
        int int56 = multiDirectional49.getMaxIterations();
        multiDirectional49.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional61 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional61.getConvergenceChecker();
        multiDirectional49.setConvergenceChecker(realConvergenceChecker62);
        multiDirectional47.setConvergenceChecker(realConvergenceChecker62);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker65 = multiDirectional47.getConvergenceChecker();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker66 = multiDirectional47.getConvergenceChecker();
        multiDirectional43.setConvergenceChecker(realConvergenceChecker66);
        multiDirectional38.setConvergenceChecker(realConvergenceChecker66);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker66);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
        org.junit.Assert.assertNotNull(realConvergenceChecker65);
        org.junit.Assert.assertNotNull(realConvergenceChecker66);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker4);
        double[] doubleArray8 = new double[] { 1.0d, 2147483647 };
        multiDirectional0.setStartConfiguration(doubleArray8);
        int int10 = multiDirectional0.getMaxIterations();
        int int11 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker12);
        multiDirectional0.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(realConvergenceChecker16);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker4);
        double[] doubleArray8 = new double[] { 1.0d, 2147483647 };
        multiDirectional0.setStartConfiguration(doubleArray8);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations((int) (byte) 100);
        multiDirectional0.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional0.getConvergenceChecker();
        int int16 = multiDirectional0.getEvaluations();
        int int17 = multiDirectional0.getIterations();
        int int18 = multiDirectional0.getIterations();
        int int19 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker10);
        org.junit.Assert.assertNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker4);
        double[] doubleArray8 = new double[] { 1.0d, 2147483647 };
        multiDirectional0.setStartConfiguration(doubleArray8);
        multiDirectional0.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) 0);
        int int15 = multiDirectional14.getEvaluations();
        int int16 = multiDirectional14.getMaxEvaluations();
        multiDirectional14.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getMaxEvaluations();
        int int21 = multiDirectional19.getIterations();
        int int22 = multiDirectional19.getMaxEvaluations();
        int int23 = multiDirectional19.getMaxEvaluations();
        multiDirectional19.setMaxIterations((-1));
        int int26 = multiDirectional19.getMaxIterations();
        int int27 = multiDirectional19.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = null;
        multiDirectional28.setConvergenceChecker(realConvergenceChecker30);
        multiDirectional28.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional36.getConvergenceChecker();
        multiDirectional28.setConvergenceChecker(realConvergenceChecker37);
        multiDirectional19.setConvergenceChecker(realConvergenceChecker37);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int44 = multiDirectional43.getMaxIterations();
        double[] doubleArray45 = new double[] {};
        multiDirectional43.setStartConfiguration(doubleArray45);
        int int47 = multiDirectional43.getMaxEvaluations();
        int int48 = multiDirectional43.getIterations();
        int int49 = multiDirectional43.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker50 = multiDirectional43.getConvergenceChecker();
        multiDirectional42.setConvergenceChecker(realConvergenceChecker50);
        double[] doubleArray52 = new double[] {};
        double[][] doubleArray53 = new double[][] { doubleArray52 };
        multiDirectional42.setStartConfiguration(doubleArray53);
        multiDirectional19.setStartConfiguration(doubleArray53);
        multiDirectional14.setStartConfiguration(doubleArray53);
        multiDirectional0.setStartConfiguration(doubleArray53);
        multiDirectional0.setMaxIterations(0);
        int int60 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional61 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int62 = multiDirectional61.getMaxEvaluations();
        int int63 = multiDirectional61.getIterations();
        int int64 = multiDirectional61.getMaxEvaluations();
        int int65 = multiDirectional61.getMaxEvaluations();
        multiDirectional61.setMaxIterations((-1));
        int int68 = multiDirectional61.getIterations();
        multiDirectional61.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker71 = null;
        multiDirectional61.setConvergenceChecker(realConvergenceChecker71);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional73 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int74 = multiDirectional73.getMaxEvaluations();
        multiDirectional73.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker77 = null;
        multiDirectional73.setConvergenceChecker(realConvergenceChecker77);
        double[] doubleArray81 = new double[] { 1.0d, 2147483647 };
        multiDirectional73.setStartConfiguration(doubleArray81);
        multiDirectional61.setStartConfiguration(doubleArray81);
        multiDirectional61.setMaxIterations((int) (short) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional88 = new org.apache.commons.math.optimization.direct.MultiDirectional((-1.0d), (double) 'a');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker89 = multiDirectional88.getConvergenceChecker();
        multiDirectional61.setConvergenceChecker(realConvergenceChecker89);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker89);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker50);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2147483647 + "'", int62 == 2147483647);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2147483647 + "'", int65 == 2147483647);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2147483647 + "'", int74 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNotNull(realConvergenceChecker89);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        double[] doubleArray2 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray2);
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional((-1.0d), (double) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 32, (double) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getMaxEvaluations();
        multiDirectional11.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = null;
        multiDirectional11.setConvergenceChecker(realConvergenceChecker15);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int18 = multiDirectional17.getMaxEvaluations();
        multiDirectional17.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = null;
        multiDirectional17.setConvergenceChecker(realConvergenceChecker21);
        double[] doubleArray25 = new double[] { 1.0d, 2147483647 };
        multiDirectional17.setStartConfiguration(doubleArray25);
        multiDirectional11.setStartConfiguration(doubleArray25);
        multiDirectional10.setStartConfiguration(doubleArray25);
        multiDirectional7.setStartConfiguration(doubleArray25);
        multiDirectional0.setStartConfiguration(doubleArray25);
        multiDirectional0.setMaxEvaluations(1);
        int int33 = multiDirectional0.getMaxIterations();
        int int34 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations((int) '#');
        multiDirectional0.setMaxEvaluations(0);
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional16.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker17);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker17);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        int int4 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations((int) '#');
        int int7 = multiDirectional0.getMaxEvaluations();
        int int8 = multiDirectional0.getIterations();
        multiDirectional0.setMaxEvaluations((int) (byte) 1);
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxIterations(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker2 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker2);
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        int int7 = multiDirectional0.getMaxEvaluations();
        int int8 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        int int12 = multiDirectional10.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        multiDirectional13.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = null;
        multiDirectional13.setConvergenceChecker(realConvergenceChecker17);
        double[] doubleArray21 = new double[] { 1.0d, 2147483647 };
        multiDirectional13.setStartConfiguration(doubleArray21);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional13.getConvergenceChecker();
        multiDirectional13.setMaxEvaluations((int) (byte) 100);
        multiDirectional13.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional13.getConvergenceChecker();
        int int29 = multiDirectional13.getEvaluations();
        int int30 = multiDirectional13.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int32 = multiDirectional31.getMaxEvaluations();
        int int33 = multiDirectional31.getIterations();
        int int34 = multiDirectional31.getMaxEvaluations();
        int int35 = multiDirectional31.getMaxEvaluations();
        multiDirectional31.setMaxIterations((-1));
        int int38 = multiDirectional31.getMaxIterations();
        int int39 = multiDirectional31.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int41 = multiDirectional40.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = null;
        multiDirectional40.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional40.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker49 = multiDirectional48.getConvergenceChecker();
        multiDirectional40.setConvergenceChecker(realConvergenceChecker49);
        multiDirectional31.setConvergenceChecker(realConvergenceChecker49);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional54 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int56 = multiDirectional55.getMaxIterations();
        double[] doubleArray57 = new double[] {};
        multiDirectional55.setStartConfiguration(doubleArray57);
        int int59 = multiDirectional55.getMaxEvaluations();
        int int60 = multiDirectional55.getIterations();
        int int61 = multiDirectional55.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional55.getConvergenceChecker();
        multiDirectional54.setConvergenceChecker(realConvergenceChecker62);
        double[] doubleArray64 = new double[] {};
        double[][] doubleArray65 = new double[][] { doubleArray64 };
        multiDirectional54.setStartConfiguration(doubleArray65);
        multiDirectional31.setStartConfiguration(doubleArray65);
        multiDirectional13.setStartConfiguration(doubleArray65);
        multiDirectional10.setStartConfiguration(doubleArray65);
        multiDirectional0.setStartConfiguration(doubleArray65);
        multiDirectional0.setMaxIterations(35);
        int int73 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNull(realConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker23);
        org.junit.Assert.assertNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker2 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker2);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getMaxEvaluations();
        multiDirectional4.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker8 = null;
        multiDirectional4.setConvergenceChecker(realConvergenceChecker8);
        double[] doubleArray12 = new double[] { 1.0d, 2147483647 };
        multiDirectional4.setStartConfiguration(doubleArray12);
        int int14 = multiDirectional4.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getMaxIterations();
        double[] doubleArray17 = new double[] {};
        multiDirectional15.setStartConfiguration(doubleArray17);
        multiDirectional4.setStartConfiguration(doubleArray17);
        multiDirectional0.setStartConfiguration(doubleArray17);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int22 = multiDirectional21.getMaxEvaluations();
        int int23 = multiDirectional21.getIterations();
        int int24 = multiDirectional21.getMaxEvaluations();
        int int25 = multiDirectional21.getMaxEvaluations();
        multiDirectional21.setMaxIterations((-1));
        int int28 = multiDirectional21.getMaxIterations();
        multiDirectional21.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker34 = multiDirectional33.getConvergenceChecker();
        multiDirectional21.setConvergenceChecker(realConvergenceChecker34);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker34);
        int int37 = multiDirectional0.getEvaluations();
        int int38 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
    }
}

