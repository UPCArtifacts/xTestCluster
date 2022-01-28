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
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setRelativeAccuracy((double) (byte) 1);
        brentSolver0.setMaximalIterationCount(1);
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.resetFunctionValueAccuracy();
        double double16 = brentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-15d + "'", double16 == 1.0E-15d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.solve(univariateRealFunction5, (double) 100L, (double) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double10 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) ' ');
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        brentSolver0.setMaximalIterationCount(0);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        double double13 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-14d);
        brentSolver0.resetMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass9 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetAbsoluteAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 10);
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        int int8 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentSolver0.solve((double) 35, (double) 'a', (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int12 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetMaximalIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        double double13 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        double double8 = brentSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve(univariateRealFunction9, (double) (-1), (double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 1);
        brentSolver0.setRelativeAccuracy(0.0d);
        double double13 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getMaximalIterationCount();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        double double11 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        brentSolver0.resetMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setRelativeAccuracy(0.0d);
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(32.0d);
        java.lang.Class<?> wildcardClass16 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 10);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 100);
        brentSolver0.setMaximalIterationCount((int) 'a');
        brentSolver0.resetAbsoluteAccuracy();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        double double13 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 0L);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.solve(univariateRealFunction5, (double) 10, (double) 10.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(35.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve(univariateRealFunction8, 1.0E-15d, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        int int10 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(univariateRealFunction12, (double) (short) 0, (double) (short) 0, (double) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        double double12 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(100.0d);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass13 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        int int7 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        int int4 = brentSolver0.getIterationCount();
        java.lang.Class<?> wildcardClass5 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        int int2 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        double double6 = brentSolver0.getRelativeAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.setRelativeAccuracy(1.0d);
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) -1);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(univariateRealFunction9, 1.0d, (double) 100, (double) 1L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        brentSolver0.setAbsoluteAccuracy(97.0d);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        brentSolver0.setMaximalIterationCount(10);
        int int13 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(100.0d);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) ' ');
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setRelativeAccuracy(0.0d);
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(32.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction12, (double) 1L, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentSolver0.solve(univariateRealFunction4, (double) (short) 100, (double) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) ' ');
        int int10 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve((double) (byte) 10, (double) 0.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentSolver0.solve(0.0d, (double) (short) 0, (double) 100L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        brentSolver0.setMaximalIterationCount(0);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 1L);
        double double12 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double3 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int5 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getRelativeAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 10);
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) 1);
        brentSolver0.setMaximalIterationCount(0);
        double double12 = brentSolver0.getRelativeAccuracy();
        double double13 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(35.0d);
        brentSolver0.setFunctionValueAccuracy((double) 100L);
        brentSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        double double12 = brentSolver0.getRelativeAccuracy();
        double double13 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (-1.0f));
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetAbsoluteAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 10);
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((-1.0d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction12, (double) 35, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(97.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve(univariateRealFunction7, 1.0d, (double) (byte) 1, (double) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 10);
        double double12 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        java.lang.Class<?> wildcardClass8 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetFunctionValueAccuracy();
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy(1.0E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getRelativeAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        brentSolver0.resetFunctionValueAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(0.0d, (double) 0L, (double) 10L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int9 = brentSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction10, (double) (short) 0, (double) (byte) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.solve((double) ' ', (double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double3 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 100);
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.setAbsoluteAccuracy((double) 1L);
        int int15 = brentSolver0.getMaximalIterationCount();
        double double16 = brentSolver0.getRelativeAccuracy();
        double double17 = brentSolver0.getFunctionValueAccuracy();
        double double18 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-14d + "'", double17 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-14d + "'", double18 == 1.0E-14d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentSolver0.solve(univariateRealFunction5, (double) 1.0f, (double) (short) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        brentSolver0.setAbsoluteAccuracy((double) 1L);
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve((double) 35, (double) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 0);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double12 = brentSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve(univariateRealFunction15, (double) (short) -1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        double double9 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        brentSolver0.setAbsoluteAccuracy((double) 1L);
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass10 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 1);
        brentSolver0.setRelativeAccuracy((double) (short) 1);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '4');
        brentSolver0.setAbsoluteAccuracy((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getIterationCount();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        int int9 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 1);
        double double12 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(100.0d);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double13 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        int int4 = brentSolver0.getIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetFunctionValueAccuracy();
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve(univariateRealFunction14, (double) (byte) 10, (double) (short) 100, 1.0E-6d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction10, (double) '4', 1.0d, 1.0E-14d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getRelativeAccuracy();
        int int12 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int6 = brentSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.solve(univariateRealFunction7, (double) 'a', 10.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 35);
        brentSolver0.resetFunctionValueAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int11 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy(1.0E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int3 = brentSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) 1);
        double double11 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(100.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass8 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (-1));
        brentSolver0.setFunctionValueAccuracy((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        java.lang.Class<?> wildcardClass10 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) 1);
        brentSolver0.setMaximalIterationCount(0);
        double double12 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double14 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 1);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetAbsoluteAccuracy();
        int int2 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 35);
        brentSolver0.resetFunctionValueAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 1L);
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.resetAbsoluteAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        int int15 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double10 = brentSolver0.getFunctionValueAccuracy();
        double double11 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) 1);
        int int7 = brentSolver0.getIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve((double) (short) 0, 0.0d, 97.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setRelativeAccuracy((double) 100);
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int8 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) '4');
        int int8 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve((double) (short) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(100.0d, (double) 35, (double) 100.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        brentSolver0.setRelativeAccuracy((double) 10L);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetFunctionValueAccuracy();
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        double double8 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve(univariateRealFunction8, 32.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(1.0d);
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.setAbsoluteAccuracy((double) 'a');
        brentSolver0.setRelativeAccuracy((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        int int7 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        double double10 = brentSolver0.getRelativeAccuracy();
        int int11 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) 1);
        brentSolver0.setMaximalIterationCount(0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(1.0d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 10);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 100);
        brentSolver0.setMaximalIterationCount((int) 'a');
        int int11 = brentSolver0.getIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 100L);
        int int10 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentSolver0.solve((-1.0d), 10.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction10, (double) 1.0f, (double) 10.0f, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-6d);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0.0f);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 100.0f);
        double double16 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setRelativeAccuracy((double) 100);
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        int int9 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve((double) 100, (double) 1.0f, (double) '#');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        int int7 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int11 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) 0);
        double double9 = brentSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction10, (double) ' ', (double) '#', (double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 10.0f);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((-1.0d));
        brentSolver0.setAbsoluteAccuracy((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(100.0d);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.resetRelativeAccuracy();
        int int11 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 0.0f);
        double double14 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(100.0d, 10.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        brentSolver0.setAbsoluteAccuracy(97.0d);
        brentSolver0.resetMaximalIterationCount();
        int int15 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.setFunctionValueAccuracy((double) '4');
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve(univariateRealFunction9, (double) (byte) 100, (double) 1L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) '#');
        double double11 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        double double4 = brentSolver0.getRelativeAccuracy();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int11 = brentSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction12, (double) 52, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        int int7 = brentSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.setMaximalIterationCount((int) ' ');
        java.lang.Class<?> wildcardClass11 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetFunctionValueAccuracy();
        int int2 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getMaximalIterationCount();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.solve(0.0d, (double) 1L, (double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(univariateRealFunction13, (double) (-1.0f), (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        double double3 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) '#');
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getRelativeAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve((double) (byte) -1, 100.0d, (double) 100L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double12 = brentSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(univariateRealFunction13, (double) (-1.0f), (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '4');
        brentSolver0.setRelativeAccuracy((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.resetFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        double double13 = brentSolver0.getAbsoluteAccuracy();
        int int14 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve(100.0d, 1.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 0L);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0.0f);
        brentSolver0.setFunctionValueAccuracy((double) '4');
        double double12 = brentSolver0.getAbsoluteAccuracy();
        double double13 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        int int7 = brentSolver0.getIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) '#');
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0);
        double double14 = brentSolver0.getAbsoluteAccuracy();
        double double15 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '4');
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        int int12 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        int int11 = brentSolver0.getMaximalIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(35.0d);
        brentSolver0.resetFunctionValueAccuracy();
        int int16 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        double double6 = brentSolver0.getRelativeAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 100L);
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        java.lang.Class<?> wildcardClass15 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        int int10 = brentSolver0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass11 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double12 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.resetRelativeAccuracy();
        double double16 = brentSolver0.getFunctionValueAccuracy();
        double double17 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-15d + "'", double16 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-15d + "'", double17 == 1.0E-15d);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((-1.0d));
        brentSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(0.0d, (double) (byte) 0, 1.0E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int7 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass9 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetFunctionValueAccuracy();
        int int2 = brentSolver0.getIterationCount();
        int int3 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int5 = brentSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.solve(univariateRealFunction6, (double) 0L, (double) 10.0f, (double) 52);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((-1.0d));
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        int int2 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = brentSolver0.getRelativeAccuracy();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 100);
        brentSolver0.setFunctionValueAccuracy((double) 1);
        int int10 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.setRelativeAccuracy((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        double double12 = brentSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(univariateRealFunction13, (double) (short) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(32.0d);
        brentSolver0.setMaximalIterationCount((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setRelativeAccuracy((double) (byte) 1);
        brentSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve((double) '4', (double) ' ', (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 'a');
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.solve((double) 10, (double) (byte) 0, (double) 35);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setRelativeAccuracy((double) (byte) 1);
        int int11 = brentSolver0.getIterationCount();
        int int12 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve(52.0d, (double) (byte) 10, (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve(univariateRealFunction9, (double) (short) 10, 10.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setRelativeAccuracy((double) 100);
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy(10.0d);
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        double double4 = brentSolver0.getFunctionValueAccuracy();
        double double5 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) ' ');
        double double10 = brentSolver0.getFunctionValueAccuracy();
        double double11 = brentSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass12 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (-1));
        brentSolver0.setAbsoluteAccuracy(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve(univariateRealFunction13, 1.0E-15d, (double) (short) -1, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass11 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setRelativeAccuracy((double) (byte) 1);
        brentSolver0.resetAbsoluteAccuracy();
        double double12 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) -1);
        double double13 = brentSolver0.getFunctionValueAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve(univariateRealFunction15, (-1.0d), (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.resetFunctionValueAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.solve(univariateRealFunction7, (double) '4', (double) 52);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-6d);
        brentSolver0.setRelativeAccuracy((double) 1.0f);
        brentSolver0.resetRelativeAccuracy();
        double double12 = brentSolver0.getRelativeAccuracy();
        int int13 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(univariateRealFunction10, (double) (-1.0f), (double) (-1L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        int int2 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve((double) 52, (double) 100.0f, (double) 10L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        int int9 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        brentSolver0.setAbsoluteAccuracy((double) 1L);
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        int int11 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy(97.0d);
        brentSolver0.setRelativeAccuracy((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        int int9 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 0.0f);
        brentSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve((double) 0, 100.0d, (double) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        brentSolver0.setRelativeAccuracy((double) 10L);
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double11 = brentSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve((double) 10L, 1.0E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 10.0f);
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) 10);
        brentSolver0.resetAbsoluteAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass9 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 100);
        brentSolver0.setFunctionValueAccuracy((double) 35);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentSolver0.solve(0.0d, (double) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        brentSolver0.resetRelativeAccuracy();
        double double15 = brentSolver0.getRelativeAccuracy();
        double double16 = brentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = brentSolver0.solve(univariateRealFunction17, (double) 0L, 0.0d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        int int6 = brentSolver0.getMaximalIterationCount();
        double double7 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getMaximalIterationCount();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100.0f);
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        brentSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction10, (double) 35, (double) 0, (double) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setRelativeAccuracy((double) (byte) 1);
        brentSolver0.setRelativeAccuracy((double) (short) 10);
        brentSolver0.setRelativeAccuracy(0.0d);
        double double15 = brentSolver0.getFunctionValueAccuracy();
        int int16 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy(32.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve(univariateRealFunction7, 32.0d, 52.0d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 35);
        double double6 = brentSolver0.getRelativeAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) 100L);
        int int11 = brentSolver0.getIterationCount();
        int int12 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (-1.0f));
        double double6 = brentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        double double9 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 1);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(1.0d);
        int int15 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve((double) 10L, (double) 1, (double) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        double double15 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) 0);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        double double10 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(0.0d);
        double double13 = brentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve((double) 10.0f, (double) 0.0f, (double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setMaximalIterationCount(35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 0L);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.resetAbsoluteAccuracy();
        double double13 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(1);
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.resetFunctionValueAccuracy();
        double double11 = brentSolver0.getAbsoluteAccuracy();
        double double12 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double5 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        double double13 = brentSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        brentSolver0.setRelativeAccuracy((double) (-1));
        int int10 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getRelativeAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve(univariateRealFunction9, 10.0d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int11 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentSolver0.solve(univariateRealFunction15, 52.0d, (double) 100L, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        double double6 = brentSolver0.getRelativeAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        int int3 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 1L);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.solve(univariateRealFunction6, (double) 35, 52.0d, 10.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        double double4 = brentSolver0.getRelativeAccuracy();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy(0.0d);
        double double10 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int10 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) '#');
        brentSolver0.setRelativeAccuracy((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 1);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentSolver0.solve(univariateRealFunction15, (double) (byte) 10, (double) '4', (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 10L);
        int int11 = brentSolver0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass12 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass4 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction12, 52.0d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        brentSolver0.setMaximalIterationCount(0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction10, 10.0d, (double) 10.0f, 1.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 10);
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getRelativeAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        brentSolver0.setAbsoluteAccuracy(1.0E-14d);
        brentSolver0.setRelativeAccuracy(1.0E-15d);
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        brentSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        double double3 = brentSolver0.getAbsoluteAccuracy();
        double double4 = brentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.solve(univariateRealFunction5, (double) (short) 1, 52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 100L);
        double double7 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 1);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) '4');
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetMaximalIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        int int13 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int9 = brentSolver0.getIterationCount();
        int int10 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetMaximalIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        int int13 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double11 = brentSolver0.getAbsoluteAccuracy();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        int int11 = brentSolver0.getMaximalIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve(univariateRealFunction13, 0.0d, (double) 1.0f, (double) 52);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        double double7 = brentSolver0.getAbsoluteAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.solve(univariateRealFunction6, (double) (short) 10, (double) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getFunctionValueAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetFunctionValueAccuracy();
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getAbsoluteAccuracy();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(univariateRealFunction9, (double) 'a', (double) 1L, (double) 1L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve((double) (short) 1, 0.0d, 52.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        brentSolver0.setRelativeAccuracy((double) 10L);
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double11 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int10 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        int int8 = brentSolver0.getIterationCount();
        int int9 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve(univariateRealFunction8, (double) (-1L), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (-1));
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentSolver0.solve(univariateRealFunction6, 0.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        double double10 = brentSolver0.getRelativeAccuracy();
        int int11 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        double double7 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 1);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(1.0d);
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(univariateRealFunction13, (double) '4', 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 35);
        brentSolver0.resetFunctionValueAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        double double11 = brentSolver0.getRelativeAccuracy();
        int int12 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 100);
        brentSolver0.setFunctionValueAccuracy((double) 35);
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setRelativeAccuracy((double) (byte) 1);
        brentSolver0.setMaximalIterationCount(1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(univariateRealFunction13, (double) (byte) 1, (double) (byte) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        double double10 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(100.0d);
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy(100.0d);
        brentSolver0.setFunctionValueAccuracy((double) (byte) 1);
        int int10 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction11, (double) 0.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy(32.0d);
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 100);
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double13 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        int int3 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        brentSolver0.resetMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.solve(univariateRealFunction7, 52.0d, (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) '4');
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        brentSolver0.setFunctionValueAccuracy((double) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        brentSolver0.setAbsoluteAccuracy(10.0d);
        double double12 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 35);
        brentSolver0.resetFunctionValueAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 1L);
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.resetAbsoluteAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double16 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 1);
        double double5 = brentSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass6 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        int int6 = brentSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve(univariateRealFunction7, (double) 1L, (double) 0, (double) 35);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(univariateRealFunction9, 52.0d, 0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass5 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setMaximalIterationCount(100);
        int int11 = brentSolver0.getMaximalIterationCount();
        int int12 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy(10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(100.0d);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        double double9 = brentSolver0.getAbsoluteAccuracy();
        int int10 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy(0.0d);
        int int13 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double15 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass6 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.solve((double) '#', 1.0E-6d, (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        brentSolver0.setMaximalIterationCount(10);
        double double13 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 10);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 100);
        brentSolver0.setMaximalIterationCount((int) 'a');
        int int11 = brentSolver0.getIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.setRelativeAccuracy((double) 100.0f);
        brentSolver0.setAbsoluteAccuracy((double) 100);
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        int int7 = brentSolver0.getIterationCount();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass9 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-6d);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0.0f);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 100.0f);
        double double16 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve(univariateRealFunction9, (double) (short) 10, (double) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(1.0E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.setAbsoluteAccuracy(32.0d);
        double double14 = brentSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass15 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setAbsoluteAccuracy((double) 1);
        brentSolver0.setRelativeAccuracy((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setAbsoluteAccuracy((double) 1);
        brentSolver0.resetMaximalIterationCount();
        int int12 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetMaximalIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass13 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(0.0d);
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(univariateRealFunction13, 0.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = brentSolver0.getIterationCount();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(univariateRealFunction10, (double) (byte) 1, 1.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        double double12 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve(univariateRealFunction7, (double) (byte) 0, (double) '4', (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        double double11 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        double double14 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) 1);
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '4');
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction11, (double) 1.0f, (double) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        int int7 = brentSolver0.getIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) '#');
        brentSolver0.setMaximalIterationCount(10);
        double double13 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.setRelativeAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        int int9 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        brentSolver0.resetMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        java.lang.Class<?> wildcardClass15 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setRelativeAccuracy(0.0d);
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        brentSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve(univariateRealFunction8, (double) (byte) 0, (double) '4', (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-14d);
        brentSolver0.resetMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int9 = brentSolver0.getIterationCount();
        double double10 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 0);
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 1);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(1.0d);
        double double15 = brentSolver0.getRelativeAccuracy();
        double double16 = brentSolver0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = brentSolver0.solve(univariateRealFunction17, (double) (short) 100, (double) 10.0f, 10.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve(univariateRealFunction15, (double) (short) 100, (double) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.setFunctionValueAccuracy((double) (short) -1);
        double double11 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        double double3 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) '#');
        java.lang.Class<?> wildcardClass6 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy(32.0d);
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 100);
        double double11 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy(32.0d);
        double double8 = brentSolver0.getAbsoluteAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        int int12 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy(1.0E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-6d);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 1.0f);
        java.lang.Class<?> wildcardClass12 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) -1);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve(univariateRealFunction9, 0.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        int int7 = brentSolver0.getIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.solve(univariateRealFunction6, (double) (-1), (double) 35, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        brentSolver0.setRelativeAccuracy((double) 10L);
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        int int11 = brentSolver0.getIterationCount();
        int int12 = brentSolver0.getMaximalIterationCount();
        double double13 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) '4');
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double12 = brentSolver0.getAbsoluteAccuracy();
        int int13 = brentSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve(univariateRealFunction14, (double) 0L, 0.0d, 1.0E-14d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        int int10 = brentSolver0.getMaximalIterationCount();
        int int11 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = brentSolver0.getRelativeAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int10 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = brentSolver0.getMaximalIterationCount();
        int int9 = brentSolver0.getIterationCount();
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) '4');
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 0);
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.setRelativeAccuracy(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setMaximalIterationCount((-1));
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction11, (double) 'a', (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        double double12 = brentSolver0.getRelativeAccuracy();
        int int13 = brentSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve(univariateRealFunction14, (double) (byte) 1, (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) ' ');
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = brentSolver0.getRelativeAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction10, 1.0d, 0.0d, 52.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        brentSolver0.setAbsoluteAccuracy((double) 1L);
        brentSolver0.setAbsoluteAccuracy(0.0d);
        double double8 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        int int6 = brentSolver0.getIterationCount();
        java.lang.Class<?> wildcardClass7 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        double double4 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100.0f);
        brentSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        int int2 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getIterationCount();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setRelativeAccuracy((double) 100);
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        double double5 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int12 = brentSolver0.getIterationCount();
        double double13 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        double double12 = brentSolver0.getRelativeAccuracy();
        double double13 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 1L);
        int int7 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction10, (double) 0L, (double) (-1L), (double) (short) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.resetFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve((double) '#', (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy(0.0d);
        double double12 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve(1.0E-15d, (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setRelativeAccuracy((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        double double15 = brentSolver0.getRelativeAccuracy();
        int int16 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 100);
        int int10 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) -1);
        double double13 = brentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve(univariateRealFunction14, (double) 1, 97.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetMaximalIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        int int13 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(1.0d);
        double double6 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(10.0d);
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        double double14 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = brentSolver0.solve(1.0E-15d, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass9 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        brentSolver0.setRelativeAccuracy((double) 10L);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction12, 0.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        int int10 = brentSolver0.getIterationCount();
        int int11 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 1L);
        double double12 = brentSolver0.getFunctionValueAccuracy();
        int int13 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(1.0d, 1.0E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass11 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        int int7 = brentSolver0.getIterationCount();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(1.0E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(35.0d);
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        brentSolver0.setMaximalIterationCount(0);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        double double12 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(35.0d);
        brentSolver0.setFunctionValueAccuracy((double) 100L);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy(97.0d);
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(univariateRealFunction12, (double) 52, (double) 35, (double) 1L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.resetRelativeAccuracy();
        int int10 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 100);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((-1.0d));
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setRelativeAccuracy((double) (byte) 1);
        int int11 = brentSolver0.getIterationCount();
        int int12 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 1L);
        double double12 = brentSolver0.getFunctionValueAccuracy();
        int int13 = brentSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve(univariateRealFunction14, 97.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setMaximalIterationCount(100);
        int int11 = brentSolver0.getMaximalIterationCount();
        int int12 = brentSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve(univariateRealFunction13, 0.0d, 10.0d, (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        double double13 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        double double6 = brentSolver0.getRelativeAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int10 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        int int9 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve((double) (byte) 10, (double) 100L, 1.0E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.setRelativeAccuracy(1.0d);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy(97.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) -1);
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double11 = brentSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 100);
        java.lang.Class<?> wildcardClass7 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        int int7 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy(1.0E-15d);
        double double10 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(35.0d, 1.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.setRelativeAccuracy((double) 100.0f);
        int int8 = brentSolver0.getIterationCount();
        int int9 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) '4');
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction12, (double) 'a', (double) (-1.0f));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) -1);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double9 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(10.0d);
        brentSolver0.setMaximalIterationCount((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        int int10 = brentSolver0.getMaximalIterationCount();
        int int11 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(10);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve((double) '#', (double) '4', (double) 1.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.resetFunctionValueAccuracy();
        int int10 = brentSolver0.getIterationCount();
        double double11 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = brentSolver0.solve((double) (byte) 1, (double) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        brentSolver0.setFunctionValueAccuracy((-1.0d));
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(1.0E-14d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((-1));
        double double11 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        int int2 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) -1);
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 'a');
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setRelativeAccuracy((double) (short) 100);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 'a');
        brentSolver0.setRelativeAccuracy((double) 10L);
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        double double11 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.setRelativeAccuracy((double) 100);
        brentSolver0.setRelativeAccuracy((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy(100.0d);
        double double8 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetRelativeAccuracy();
        int int11 = brentSolver0.getIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        int int13 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.setAbsoluteAccuracy(32.0d);
        double double8 = brentSolver0.getAbsoluteAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(univariateRealFunction12, (double) (short) 100, (double) 10, 35.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.resetAbsoluteAccuracy();
        double double13 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getAbsoluteAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetRelativeAccuracy();
        double double11 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        brentSolver0.setRelativeAccuracy(1.0d);
        int int11 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) '4');
        brentSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentSolver0.solve(univariateRealFunction15, (double) '#', (double) 0L, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setRelativeAccuracy((double) 100);
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        double double4 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 10);
        brentSolver0.setMaximalIterationCount(10);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getAbsoluteAccuracy();
        double double5 = brentSolver0.getRelativeAccuracy();
        int int6 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        brentSolver0.setAbsoluteAccuracy((double) 1L);
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        double double8 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 35);
        brentSolver0.resetFunctionValueAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 10.0f);
        java.lang.Class<?> wildcardClass14 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentSolver0.solve((double) (byte) 0, (double) (byte) 1, (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = brentSolver0.getRelativeAccuracy();
        int int5 = brentSolver0.getMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((-1.0d));
        brentSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 0L);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int10 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(1);
        int int6 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass10 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 0);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy(10.0d);
        brentSolver0.resetFunctionValueAccuracy();
        double double13 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 'a');
        brentSolver0.setFunctionValueAccuracy((double) (short) 100);
        int int6 = brentSolver0.getIterationCount();
        java.lang.Class<?> wildcardClass7 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) '#');
        double double11 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) 10);
        brentSolver0.resetMaximalIterationCount();
        int int10 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        java.lang.Class<?> wildcardClass13 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setRelativeAccuracy((double) 100);
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = brentSolver0.getFunctionValueAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int9 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.setAbsoluteAccuracy(32.0d);
        double double14 = brentSolver0.getAbsoluteAccuracy();
        double double15 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 1);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int13 = brentSolver0.getMaximalIterationCount();
        double double14 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy(10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setAbsoluteAccuracy((double) 1);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        int int2 = brentSolver0.getMaximalIterationCount();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) -1);
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double11 = brentSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass12 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy(0.0d);
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int11 = brentSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction12, 0.0d, 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }
}

