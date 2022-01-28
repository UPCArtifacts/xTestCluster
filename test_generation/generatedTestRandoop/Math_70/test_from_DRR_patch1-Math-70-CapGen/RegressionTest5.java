import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int7 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 100);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.getFunctionValue();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        bisectionSolver0.setMaximalIterationCount(10);
        bisectionSolver0.setFunctionValueAccuracy((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.solve((double) (short) 100, 1.0E-15d);
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
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        int int11 = bisectionSolver0.getIterationCount();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.resetRelativeAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double9 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetMaximalIterationCount();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1L);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setAbsoluteAccuracy((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double11 = bisectionSolver0.getRelativeAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        int int4 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int2 = bisectionSolver0.getIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        bisectionSolver0.setRelativeAccuracy((double) 1L);
        int int9 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        bisectionSolver0.setAbsoluteAccuracy((double) (-1));
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.getFunctionValue();
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
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double3 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 100);
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetRelativeAccuracy();
        java.lang.Class<?> wildcardClass10 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int7 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass9 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 100);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(univariateRealFunction8, (double) '4', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 0);
        double double9 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int12 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        bisectionSolver0.setAbsoluteAccuracy((double) 1);
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double9 = bisectionSolver0.getRelativeAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve((double) (byte) 0, (double) 0, (double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve((double) 100.0f, (double) '4');
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
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10.0f);
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        bisectionSolver0.setFunctionValueAccuracy((double) 10L);
        java.lang.Class<?> wildcardClass14 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int9 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.resetMaximalIterationCount();
        int int14 = bisectionSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.solve(univariateRealFunction15, 0.0d, 97.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        int int4 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(1);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0.0f);
        bisectionSolver0.setAbsoluteAccuracy((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        int int13 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(35.0d);
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
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        double double13 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = bisectionSolver0.getRelativeAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve(univariateRealFunction13, (double) '#', (double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass12 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(32.0d);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(univariateRealFunction12, (double) (short) -1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(1.0d);
        double double15 = bisectionSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 10.0f);
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.getResult();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(10);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        int int11 = bisectionSolver0.getMaximalIterationCount();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) '4');
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(univariateRealFunction8, (double) 35, 1.0E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setRelativeAccuracy(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(univariateRealFunction7, (double) (short) -1, (double) 35, 32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(10);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.solve(univariateRealFunction9, 52.0d, (double) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.getResult();
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
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        int int16 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass8 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve(0.0d, 0.0d, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        double double8 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.solve(10.0d, (double) 0, 1.0E-6d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        double double17 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-6d + "'", double17 == 1.0E-6d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1L);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass11 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bisectionSolver0.getFunctionValue();
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(univariateRealFunction7, 100.0d, (double) 0, (double) 100);
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
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int4 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass8 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        double double14 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        double double11 = bisectionSolver0.getRelativeAccuracy();
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        int int4 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve((double) 10.0f, (double) 10L, (double) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(univariateRealFunction7, 10.0d, (double) 10, 35.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        int int9 = bisectionSolver0.getIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve(univariateRealFunction10, (double) (short) 100, (double) 35);
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve(univariateRealFunction15, 1.0E-15d, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-15d + "'", double14 == 1.0E-15d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass14 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.resetRelativeAccuracy();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.solve(univariateRealFunction7, (double) (-1.0f), (double) 1.0f, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) '#');
        java.lang.Class<?> wildcardClass10 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1L);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.solve((double) 100.0f, 1.0d);
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
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int7 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetRelativeAccuracy();
        double double12 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        bisectionSolver0.setRelativeAccuracy(1.0d);
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy(32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        int int10 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.solve(univariateRealFunction13, (double) 1, 97.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        int int2 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        int int5 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 100);
        bisectionSolver0.setFunctionValueAccuracy((double) 1);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass4 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass13 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve(univariateRealFunction13, (double) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 100);
        double double11 = bisectionSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass12 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = bisectionSolver0.getIterationCount();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass12 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double3 = bisectionSolver0.getAbsoluteAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.solve(univariateRealFunction6, (double) 100L, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve(97.0d, (double) (-1));
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
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve(univariateRealFunction11, 32.0d, (double) 1.0f);
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
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        int int11 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 0);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve(univariateRealFunction11, 10.0d, 1.0E-14d);
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
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double9 = bisectionSolver0.getRelativeAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.getFunctionValue();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve(univariateRealFunction10, 0.0d, 35.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        bisectionSolver0.setMaximalIterationCount(0);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
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
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 35);
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) (byte) 1);
        bisectionSolver0.setMaximalIterationCount(1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-6d + "'", double15 == 1.0E-6d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(97.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass4 = bisectionSolver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int2 = bisectionSolver0.getIterationCount();
        int int3 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) (byte) 1);
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        int int13 = bisectionSolver0.getMaximalIterationCount();
        int int14 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.getFunctionValue();
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
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 10.0f);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.getFunctionValue();
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
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        int int13 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.solve(univariateRealFunction15, (double) (short) 1, 1.0E-14d, (double) '4');
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) (byte) 1);
        bisectionSolver0.setMaximalIterationCount(1);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        java.lang.Class<?> wildcardClass15 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.getFunctionValue();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve((double) 1, (double) (byte) 100, 1.0E-6d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 1);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        int int16 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 10L);
        bisectionSolver0.resetRelativeAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.solve(univariateRealFunction7, 52.0d, 1.0E-14d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(univariateRealFunction11, (double) (short) -1, (double) (-1), 1.0E-15d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve(32.0d, 1.0d);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetAbsoluteAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = bisectionSolver0.solve(univariateRealFunction17, (double) '4', 1.0d, (double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0.0f);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 100);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int11 = bisectionSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve(univariateRealFunction12, (double) 100, (double) (short) 0, (double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0.0f);
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) 100.0f);
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getResult();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 1);
        int int11 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) (short) 1);
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve(0.0d, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((-1.0d));
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.getFunctionValue();
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
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0.0f);
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 100);
        int int12 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.setFunctionValueAccuracy((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        int int14 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.solve(univariateRealFunction8, 52.0d, 1.0E-14d, 97.0d);
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
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (-1L));
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 100L);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass3 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.setFunctionValueAccuracy((-1.0d));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(univariateRealFunction11, 1.0d, (double) (byte) -1, 100.0d);
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
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        int int7 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(1.0d);
        java.lang.Class<?> wildcardClass15 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bisectionSolver0.solve((double) 52, (double) (byte) -1, (double) (short) 100);
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
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double9 = bisectionSolver0.getRelativeAccuracy();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        double double12 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve((double) (byte) 1, (double) 1);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = bisectionSolver0.solve(univariateRealFunction3, (double) 100L, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve(univariateRealFunction13, (double) 100, (double) 0L);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 100);
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setRelativeAccuracy((double) (byte) 1);
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-15d + "'", double17 == 1.0E-15d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        int int11 = bisectionSolver0.getMaximalIterationCount();
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double11 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bisectionSolver0.getFunctionValue();
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
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.solve(univariateRealFunction7, (double) (short) 10, (double) 1L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        int int8 = bisectionSolver0.getIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 1L);
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve((double) 52, (double) 1, (double) (-1));
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        int int8 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.getFunctionValue();
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
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        int int14 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(32.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        int int14 = bisectionSolver0.getMaximalIterationCount();
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-6d + "'", double15 == 1.0E-6d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0L);
        java.lang.Class<?> wildcardClass7 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 1);
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve(univariateRealFunction15, (double) (short) 1, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.solve(univariateRealFunction9, (double) 52, 1.0E-6d);
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
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int2 = bisectionSolver0.getIterationCount();
        int int3 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass6 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        double double16 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-15d + "'", double16 == 1.0E-15d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) 0);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.getResult();
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
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        bisectionSolver0.resetAbsoluteAccuracy();
        double double12 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setAbsoluteAccuracy((double) 10L);
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(10);
        java.lang.Class<?> wildcardClass16 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        bisectionSolver0.setRelativeAccuracy((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetMaximalIterationCount();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) '4');
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.getResult();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        bisectionSolver0.setAbsoluteAccuracy((double) 1);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetMaximalIterationCount();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-6d + "'", double15 == 1.0E-6d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) 0L);
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.solve((double) ' ', (double) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        java.lang.Class<?> wildcardClass6 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        int int7 = bisectionSolver0.getIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '#');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(32.0d);
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 0);
        int int10 = bisectionSolver0.getMaximalIterationCount();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(10);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
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
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        int int4 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        double double12 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        double double16 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.getResult();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve(univariateRealFunction11, (double) ' ', 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(35);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.solve(univariateRealFunction16, (double) (byte) 1, (double) (short) 0);
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
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy(10.0d);
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        double double9 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-15d + "'", double1 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) ' ');
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(univariateRealFunction12, (double) 100.0f, 1.0E-15d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
    }
}

