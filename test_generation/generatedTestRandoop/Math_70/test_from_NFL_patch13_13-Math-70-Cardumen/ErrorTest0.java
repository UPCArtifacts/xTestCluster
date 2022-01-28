import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = bisectionSolver0.solve((double) 1.0f, (double) 10L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((double) (-1.0f), (double) '4');
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve(1.0E-15d, 1.0E-14d, (double) 10.0f);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = bisectionSolver0.solve((double) (-1.0f), (double) (byte) 10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) ' ', (double) 100.0f);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bisectionSolver0.solve((double) 0L, (double) 1.0f);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((double) (byte) 10, (double) 35, (double) (short) -1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) (-1.0f), (double) (short) 100, (double) 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = bisectionSolver0.solve((double) 0, 32.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) (-1.0f), (double) (byte) 100, (double) (byte) 100);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve(0.0d, (double) (byte) 10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (byte) 1, (double) ' ');
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bisectionSolver0.solve((double) 0, 32.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve(10.0d, (double) 100);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((-1.0d), 0.0d, (double) 'a');
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = bisectionSolver0.solve((double) (byte) 1, (double) '4');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.setMaximalIterationCount(10);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) (byte) 0, (double) (byte) 100, (double) (-1L));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = bisectionSolver0.solve(1.0E-14d, (double) ' ');
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int9 = bisectionSolver0.getMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) (byte) 0, (double) 10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) (-1), 100.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.setFunctionValueAccuracy((-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve(0.0d, (double) (short) 10, (double) 1.0f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) 1, (double) 100);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve(1.0E-15d, (double) 10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(32.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(10.0d, (double) 100.0f, (double) 10.0f);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (byte) 0, (double) 1L, (double) (byte) 10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve(10.0d, (double) 100);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve(0.0d, (double) (short) 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((double) (-1L), 1.0E-15d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) 35, (double) 100.0f, (double) 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bisectionSolver0.solve((double) 1, (double) '4');
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) 35, (double) (byte) 100, (double) (byte) -1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((double) 10.0f, (double) ' ');
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (byte) -1, (double) 100.0f, (double) (byte) 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        int int4 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) -1);
        int int7 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((double) (-1.0f), (double) 10L);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve(0.0d, 10.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve(1.0E-15d, (double) (short) 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (short) 0, (double) '#', (double) 10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) (byte) -1, (double) (byte) 1, (double) (short) 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) (short) 0, 1.0d, (double) ' ');
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.setMaximalIterationCount(10);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.setAbsoluteAccuracy(10.0d);
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) (byte) -1, (double) 10.0f, (double) 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((double) (-1.0f), (double) (byte) 100, (double) 100.0f);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) (short) 0, (double) (short) 1, (double) 10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) 'a', 100.0d, (double) (short) -1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) (byte) 1, (double) (short) 10, (-1.0d));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        bisectionSolver0.setRelativeAccuracy(1.0d);
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) (byte) -1, (double) 100);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1L);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve(1.0E-6d, (double) (short) 10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(1.0E-6d, 32.0d, 1.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((double) (-1L), (double) '4', (double) 100L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 0L, (double) (short) 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) (short) 0, 97.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) (short) -1, (double) 1, (double) 0L);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve(0.0d, (double) ' ', 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) 10, (double) 35, 1.0E-14d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) 0, (double) (short) 1, 97.0d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) (-1L), (double) (byte) 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        double double5 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve(0.0d, (double) 35, (-1.0d));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) 10, (double) 100L, (double) (short) 100);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) (byte) 1, 10.0d, (double) (byte) 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((double) 0L, 10.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((double) (-1), 35.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        int int2 = bisectionSolver0.getIterationCount();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = bisectionSolver0.solve((double) 0.0f, (double) (short) 100);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.setMaximalIterationCount(10);
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((double) (-1.0f), 0.0d, 97.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve(1.0d, 32.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) ' ', (double) 35);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int2 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bisectionSolver0.solve((double) 1.0f, (double) (short) 100);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bisectionSolver0.solve((double) 0, (double) '#', (double) '4');
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) (-1.0f), 97.0d, 1.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) (-1), 0.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = bisectionSolver0.solve((double) (short) -1, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(0.0d, (double) (short) 100, 32.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve(0.0d, (double) ' ', 1.0E-14d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve(1.0d, (double) 'a', (double) (byte) -1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = bisectionSolver0.solve((double) 0, 1.0E-14d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((double) 10, 35.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) '4', 97.0d, (double) 35);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) (byte) 0, (double) 10L, (double) (short) 10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((double) (short) 10, 35.0d, (double) (short) 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((double) (byte) 10, (double) 100.0f);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) (byte) -1, (double) 100);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) (short) -1, 0.0d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        int int7 = bisectionSolver0.getIterationCount();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve(0.0d, 1.0E-15d, (double) 100);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((-1.0d), (double) (short) 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) (-1), 0.0d, (double) 100L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 0, (double) (byte) 10, (double) 100.0f);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve(0.0d, 100.0d, (double) (byte) 10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) 0, (double) (short) 10, (double) 'a');
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) 0L, (double) (short) 1, 1.0E-15d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((double) (-1L), (double) 10L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) (short) 0, (double) (short) 1, (double) (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) (-1.0f), (double) (byte) 1, (double) 'a');
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) (byte) -1, (double) '4');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((double) 0L, 1.0E-15d, (double) ' ');
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) (-1.0f), 32.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) 0, (double) 10, (double) (short) 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) 0.0f, (double) 100.0f);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve(0.0d, 97.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        double double12 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((-1.0d), (double) '#', (double) (short) 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((double) '#', (double) 'a', (double) (-1L));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = bisectionSolver0.solve((double) (short) 1, (double) 100.0f, (double) (-1.0f));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((double) (byte) -1, (double) (short) 1, (double) 100.0f);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve(0.0d, (double) 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(1.0E-15d, (double) 100.0f);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        int int7 = bisectionSolver0.getIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '#');
        bisectionSolver0.setMaximalIterationCount(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) (short) -1, 100.0d, (double) 100L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = bisectionSolver0.solve(0.0d, (double) (short) 100);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((double) (short) 10, (double) ' ');
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) (-1), 10.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 0.0f, 97.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) 1.0f, (double) 100);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) 0.0f, (double) 1.0f, (double) 'a');
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve(1.0E-6d, (double) 1.0f);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        int int6 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve(1.0E-15d, (double) 1.0f, (double) 100L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int2 = bisectionSolver0.getIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (-1), 1.0E-14d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((-1));
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((double) (byte) -1, 1.0E-6d, (double) 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 0.0f);
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 0.0f, (double) (byte) 10, 1.0E-15d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.setRelativeAccuracy((double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = bisectionSolver0.solve((double) (-1), 1.0E-6d, (double) (byte) -1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (short) -1, 35.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (byte) -1, 1.0E-6d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) (-1), (double) 1.0f);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) (-1.0f), (double) 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) (short) 1, 32.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-14d);
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) (byte) 10, 32.0d, (-1.0d));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        int int8 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) 1L, (double) '4');
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((double) (short) -1, (double) (short) 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 1L, (double) 10, (double) 'a');
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int6 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (byte) 10, (double) '#');
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (-1), 1.0E-15d, (double) 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 10, 97.0d, (double) (short) 100);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve(1.0E-14d, (double) 1.0f);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        bisectionSolver0.resetMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve(0.0d, (double) (byte) 10, (double) 100L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) (-1), 32.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve(0.0d, (double) 1L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((double) 10L, (double) '#');
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) 1L, (double) 'a', 97.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 1L);
        double double9 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(1.0E-15d, (double) 35, (double) 35);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        int int13 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = bisectionSolver0.solve((-1.0d), (double) '4', (double) (byte) -1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((double) 0, (double) (byte) 10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) 1.0f);
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve(0.0d, (double) 35);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 10);
        bisectionSolver0.setRelativeAccuracy((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((-1.0d), 10.0d, 32.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) 1, 97.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        bisectionSolver0.setRelativeAccuracy((double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve(1.0E-6d, (double) 100.0f);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bisectionSolver0.solve((double) (byte) 0, 100.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve(1.0E-6d, (double) (byte) 10, (double) 10L);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve(0.0d, (double) 10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) ' ', (double) (byte) 100, 35.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (-1), (double) (short) 0, (double) '4');
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve(35.0d, (double) (byte) 100, (double) (byte) 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve(32.0d, (double) 100L, 1.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        bisectionSolver0.setRelativeAccuracy((double) 1.0f);
        int int11 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve(0.0d, 100.0d, 35.0d);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) 0L, (double) (short) 10, (double) (-1));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve(0.0d, (double) 1L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        double double4 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) (-1), (double) 100, (double) 1.0f);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve(10.0d, (double) ' ');
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getRelativeAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) 10L, 100.0d, (double) 100);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int4 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) 10L, (double) 'a');
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(0.0d, 100.0d, (double) 100.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) 1, 32.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (-1), (double) 10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve(1.0E-6d, (double) 10.0f, 0.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int2 = bisectionSolver0.getIterationCount();
        int int3 = bisectionSolver0.getIterationCount();
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve(1.0E-15d, (double) (byte) 1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) (-1L), (double) 'a', (double) (short) 10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = bisectionSolver0.solve((double) (-1L), (double) (short) 10, (double) (short) 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double3 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((-1.0d), (double) (short) 10, (double) (short) -1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) ' ', 35.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) 0L, (double) 10.0f);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        double double9 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(0.0d, (double) 100.0f, (-1.0d));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) (short) 0, (double) (byte) 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.setMaximalIterationCount(10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve(0.0d, 97.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(1.0E-6d, (double) 100);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 0, (double) 10.0f);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        int int7 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) ' ', (double) '#', (double) 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(1.0E-15d, (double) 100.0f);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve(0.0d, 1.0E-14d);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((-1.0d), (double) (short) 1, (double) (byte) -1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 10);
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 100);
        bisectionSolver0.setMaximalIterationCount((int) 'a');
        bisectionSolver0.resetAbsoluteAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) (byte) -1, 10.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        int int8 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) (byte) 1, (double) (byte) 100);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) -1);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        double double12 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) (byte) -1, (double) 100, (double) '#');
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 35);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((double) (byte) 0, (double) (byte) 1, (double) (byte) 10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) ' ', (double) 52, (-1.0d));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        bisectionSolver0.resetMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve(1.0E-6d, (double) (short) 100);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        int int9 = bisectionSolver0.getMaximalIterationCount();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = bisectionSolver0.solve(1.0E-15d, (double) 100.0f, (double) 52);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve(32.0d, 97.0d, (double) 35);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve(1.0E-14d, (double) (byte) 100, (double) (byte) 1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        double double3 = bisectionSolver0.getAbsoluteAccuracy();
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) '#', 97.0d, 35.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bisectionSolver0.solve(1.0E-6d, (double) (byte) 1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve(1.0E-14d, (double) (short) 1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 1L);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) 1, (double) '4', 1.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        int int6 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 0, 1.0d, (double) (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) 0.0f, (double) (short) 10, 100.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1.0f));
        int int6 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((-1.0d), (double) 0L, (double) 1L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 1L, (double) '#');
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = bisectionSolver0.solve((double) 0, (double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve((double) (short) -1, (double) 10.0f, (double) (-1L));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((double) (-1L), (double) (byte) 0, (double) 10.0f);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) 35, (double) 'a', (-1.0d));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        int int4 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) (byte) 10, (double) 'a');
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve((double) '#', (double) 52);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        int int9 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve(35.0d, (double) '4');
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 'a');
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 0, 100.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        double double6 = bisectionSolver0.getRelativeAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(1.0E-14d, (double) 10L, 1.0E-6d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((-1.0d), 10.0d, (double) (short) 10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bisectionSolver0.solve(0.0d, (double) 1L, (double) (-1.0f));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        double double4 = bisectionSolver0.getRelativeAccuracy();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        int int6 = bisectionSolver0.getMaximalIterationCount();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((double) (byte) -1, 100.0d, (double) 100L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) (-1), (double) 1.0f);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 'a', (double) 100.0f);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        int int2 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) 52, (double) 100.0f, (double) 10L);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 0.0f);
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 0, 100.0d, (double) 100);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(1);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = bisectionSolver0.solve((double) 0L, (double) 1.0f);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve(0.0d, (double) 100L);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        bisectionSolver0.setRelativeAccuracy(1.0d);
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = bisectionSolver0.solve(0.0d, (double) 100);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        double double4 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bisectionSolver0.solve((double) 0.0f, (double) (short) 100, (double) 35);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((double) (byte) 10, (double) 100L, 1.0E-15d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = bisectionSolver0.solve((double) '#', (double) '4', (double) 1.0f);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        double double11 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = bisectionSolver0.solve((double) (byte) 1, (double) 10, (double) (byte) -1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        double double4 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve(1.0d, (double) (short) 100);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bisectionSolver0.solve((double) (byte) 0, (double) (byte) 1, (double) 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        bisectionSolver0.setMaximalIterationCount((int) '4');
        bisectionSolver0.setRelativeAccuracy((double) 0.0f);
        bisectionSolver0.setRelativeAccuracy((double) 1);
        int int18 = bisectionSolver0.getMaximalIterationCount();
        int int19 = bisectionSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double22 = bisectionSolver0.solve((double) 1L, (double) 100);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (short) 1);
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.setFunctionValueAccuracy(32.0d);
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = bisectionSolver0.solve((double) (short) 10, 100.0d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = bisectionSolver0.solve((-1.0d), (double) 0L);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = bisectionSolver0.solve(0.0d, 1.0E-6d, 1.0E-14d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        int int2 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) (short) 0, (double) 10L, (double) ' ');
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1L));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((double) 10, (double) '#');
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve((double) (-1), (double) (byte) 10, 97.0d);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = bisectionSolver0.solve((-1.0d), (double) (short) 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bisectionSolver0.solve((double) '#', (double) '4', 0.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 100);
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) (byte) 0, (double) ' ', 10.0d);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bisectionSolver0.solve(0.0d, (double) '4');
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        double double13 = bisectionSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((-1.0d), (double) (short) 100);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        int int13 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-14d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = bisectionSolver0.solve((double) (short) -1, 97.0d, 100.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = bisectionSolver0.solve((double) 1, (double) '4', (double) (short) 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-6d);
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 10.0f);
        bisectionSolver0.setAbsoluteAccuracy(97.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = bisectionSolver0.solve(1.0E-14d, (double) 100.0f);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve(1.0d, (double) 52, (double) '4');
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        double double1 = bisectionSolver0.getFunctionValueAccuracy();
        int int2 = bisectionSolver0.getMaximalIterationCount();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bisectionSolver0.solve((double) 10, (double) 100L);
    }
}

