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
        multiDirectional0.setMaxEvaluations((int) (byte) 1);
        int int25 = multiDirectional0.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 100);
        int int3 = multiDirectional2.getMaxEvaluations();
        int int4 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = multiDirectional2.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int7 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = null;
        multiDirectional6.setConvergenceChecker(realConvergenceChecker10);
        double[] doubleArray14 = new double[] { 1.0d, 2147483647 };
        multiDirectional6.setStartConfiguration(doubleArray14);
        int int16 = multiDirectional6.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional6.getConvergenceChecker();
        int int18 = multiDirectional6.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional6.getConvergenceChecker();
        int int20 = multiDirectional6.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) '4', (double) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = null;
        multiDirectional24.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional24.setMaxEvaluations((int) (short) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int31 = multiDirectional30.getMaxIterations();
        double[] doubleArray32 = new double[] {};
        multiDirectional30.setStartConfiguration(doubleArray32);
        int int34 = multiDirectional30.getMaxEvaluations();
        int int35 = multiDirectional30.getMaxIterations();
        int int36 = multiDirectional30.getMaxIterations();
        multiDirectional30.setMaxIterations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getMaxEvaluations();
        int int41 = multiDirectional39.getIterations();
        int int42 = multiDirectional39.getMaxEvaluations();
        int int43 = multiDirectional39.getMaxEvaluations();
        multiDirectional39.setMaxIterations((-1));
        int int46 = multiDirectional39.getMaxIterations();
        int int47 = multiDirectional39.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int49 = multiDirectional48.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker50 = null;
        multiDirectional48.setConvergenceChecker(realConvergenceChecker50);
        multiDirectional48.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker57 = multiDirectional56.getConvergenceChecker();
        multiDirectional48.setConvergenceChecker(realConvergenceChecker57);
        multiDirectional39.setConvergenceChecker(realConvergenceChecker57);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional62 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional63 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int64 = multiDirectional63.getMaxIterations();
        double[] doubleArray65 = new double[] {};
        multiDirectional63.setStartConfiguration(doubleArray65);
        int int67 = multiDirectional63.getMaxEvaluations();
        int int68 = multiDirectional63.getIterations();
        int int69 = multiDirectional63.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker70 = multiDirectional63.getConvergenceChecker();
        multiDirectional62.setConvergenceChecker(realConvergenceChecker70);
        double[] doubleArray72 = new double[] {};
        double[][] doubleArray73 = new double[][] { doubleArray72 };
        multiDirectional62.setStartConfiguration(doubleArray73);
        multiDirectional39.setStartConfiguration(doubleArray73);
        multiDirectional30.setStartConfiguration(doubleArray73);
        multiDirectional24.setStartConfiguration(doubleArray73);
        multiDirectional23.setStartConfiguration(doubleArray73);
        multiDirectional6.setStartConfiguration(doubleArray73);
        multiDirectional2.setStartConfiguration(doubleArray73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(realConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker57);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2147483647 + "'", int69 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker70);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) '#', (-1.0d));
        int int3 = multiDirectional2.getMaxEvaluations();
        int int4 = multiDirectional2.getMaxEvaluations();
        int int5 = multiDirectional2.getEvaluations();
        int int6 = multiDirectional2.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((-1));
        int int7 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations((int) '#');
        multiDirectional0.setMaxEvaluations((int) (byte) -1);
        int int12 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, 1.0d);
        int int3 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getMaxEvaluations();
        multiDirectional7.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = null;
        multiDirectional7.setConvergenceChecker(realConvergenceChecker11);
        double[] doubleArray15 = new double[] { 1.0d, 2147483647 };
        multiDirectional7.setStartConfiguration(doubleArray15);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional7.getConvergenceChecker();
        multiDirectional7.setMaxEvaluations((int) (byte) 100);
        int int20 = multiDirectional7.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int22 = multiDirectional21.getMaxEvaluations();
        multiDirectional21.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker25 = null;
        multiDirectional21.setConvergenceChecker(realConvergenceChecker25);
        double[] doubleArray29 = new double[] { 1.0d, 2147483647 };
        multiDirectional21.setStartConfiguration(doubleArray29);
        multiDirectional7.setStartConfiguration(doubleArray29);
        multiDirectional6.setStartConfiguration(doubleArray29);
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
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional54 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int55 = multiDirectional54.getMaxEvaluations();
        int int56 = multiDirectional54.getIterations();
        int int57 = multiDirectional54.getMaxEvaluations();
        int int58 = multiDirectional54.getMaxEvaluations();
        multiDirectional54.setMaxIterations((-1));
        int int61 = multiDirectional54.getMaxIterations();
        multiDirectional54.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker67 = multiDirectional66.getConvergenceChecker();
        multiDirectional54.setConvergenceChecker(realConvergenceChecker67);
        multiDirectional33.setConvergenceChecker(realConvergenceChecker67);
        multiDirectional6.setConvergenceChecker(realConvergenceChecker67);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker67);
        int int72 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertNull(realConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1.0f, (double) (-1));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 10, (double) 100.0f);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional2.getConvergenceChecker();
        int int4 = multiDirectional2.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) -1, 0.0d);
        multiDirectional7.setMaxEvaluations((int) (byte) 1);
        multiDirectional7.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int13 = multiDirectional12.getMaxEvaluations();
        multiDirectional12.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = null;
        multiDirectional12.setConvergenceChecker(realConvergenceChecker16);
        double[] doubleArray20 = new double[] { 1.0d, 2147483647 };
        multiDirectional12.setStartConfiguration(doubleArray20);
        multiDirectional12.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) 0);
        int int27 = multiDirectional26.getEvaluations();
        int int28 = multiDirectional26.getMaxEvaluations();
        multiDirectional26.setMaxEvaluations((int) (short) 100);
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
        multiDirectional26.setStartConfiguration(doubleArray65);
        multiDirectional12.setStartConfiguration(doubleArray65);
        multiDirectional7.setStartConfiguration(doubleArray65);
        multiDirectional2.setStartConfiguration(doubleArray65);
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker4);
        double[] doubleArray8 = new double[] { 1.0d, 2147483647 };
        multiDirectional0.setStartConfiguration(doubleArray8);
        multiDirectional0.setMaxIterations((int) (byte) 100);
        int int12 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        multiDirectional13.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = null;
        multiDirectional13.setConvergenceChecker(realConvergenceChecker17);
        double[] doubleArray21 = new double[] { 1.0d, 2147483647 };
        multiDirectional13.setStartConfiguration(doubleArray21);
        int int23 = multiDirectional13.getMaxIterations();
        int int24 = multiDirectional13.getMaxIterations();
        multiDirectional13.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional13.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxIterations();
        double[] doubleArray30 = new double[] {};
        multiDirectional28.setStartConfiguration(doubleArray30);
        int int32 = multiDirectional28.getMaxEvaluations();
        int int33 = multiDirectional28.getIterations();
        int int34 = multiDirectional28.getMaxEvaluations();
        int int35 = multiDirectional28.getMaxEvaluations();
        multiDirectional28.setMaxEvaluations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int39 = multiDirectional38.getMaxEvaluations();
        multiDirectional38.setMaxEvaluations(0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = null;
        multiDirectional38.setConvergenceChecker(realConvergenceChecker42);
        double[] doubleArray45 = new double[] { 100.0d };
        multiDirectional38.setStartConfiguration(doubleArray45);
        multiDirectional28.setStartConfiguration(doubleArray45);
        multiDirectional13.setStartConfiguration(doubleArray45);
        multiDirectional0.setStartConfiguration(doubleArray45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 2.147483647E9]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNull(realConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxIterations(10);
        multiDirectional0.setMaxIterations((int) (byte) 0);
        multiDirectional0.setMaxIterations((int) (byte) 10);
        int int12 = multiDirectional0.getEvaluations();
        java.lang.Class<?> wildcardClass13 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

