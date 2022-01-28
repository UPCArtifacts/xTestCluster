import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver0.doOptimize();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int8 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1));
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(0);
        int int6 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) '4');
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(35);
        int int9 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int9 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver0.doOptimize();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(32);
        simplexSolver1.setMaxIterations(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(0.0d);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int5 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1));
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver0.doOptimize();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        simplexSolver1.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver1.doOptimize();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        int int12 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.doOptimize();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations(35);
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((-1));
        int int9 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((-1));
        simplexSolver1.setMaxIterations((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.doOptimize();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver1.doOptimize();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) ' ');
        simplexSolver0.setMaxIterations((int) (byte) 1);
        int int15 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver0.doOptimize();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver0.doOptimize();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int11 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.doOptimize();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int14 = simplexSolver0.getMaxIterations();
        int int15 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver0.doOptimize();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int4 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((-1.0d));
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.doOptimize();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0d);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations(35);
        simplexSolver1.setMaxIterations(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver0.doOptimize();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int8 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.doOptimize();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations(10);
        simplexSolver0.setMaxIterations((int) (short) 1);
        simplexSolver0.setMaxIterations((int) ' ');
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int13 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver0.doOptimize();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations((-1));
        int int11 = simplexSolver0.getMaxIterations();
        int int12 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver0.doOptimize();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(0.0d);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (byte) 0);
        int int7 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver0.doOptimize();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair2 = simplexSolver1.doOptimize();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0d);
        int int2 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair3 = simplexSolver1.doOptimize();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getMaxIterations();
        int int12 = simplexSolver0.getMaxIterations();
        int int13 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver0.doOptimize();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        int int11 = simplexSolver0.getIterations();
        int int12 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver0.doOptimize();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations(1);
        int int9 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.doOptimize();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 10);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver1.doOptimize();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver0.doOptimize();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver0.doOptimize();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int9 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(0.0d);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int6 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 97);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(10);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int11 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.doOptimize();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 10);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        simplexSolver1.setMaxIterations((int) ' ');
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations((int) '#');
        simplexSolver0.setMaxIterations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver0.doOptimize();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(0.0d);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 10);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int10 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.doOptimize();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations(100);
        int int12 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.doOptimize();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations(35);
        simplexSolver1.setMaxIterations(35);
        simplexSolver1.setMaxIterations((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(1.0d);
        simplexSolver1.setMaxIterations(100);
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations(10);
        simplexSolver0.setMaxIterations((int) (short) 1);
        simplexSolver0.setMaxIterations((int) ' ');
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int13 = simplexSolver0.getIterations();
        int int14 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver0.doOptimize();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations(10);
        int int11 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.doOptimize();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.doOptimize();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        int int7 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        simplexSolver1.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        int int13 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        simplexSolver0.setMaxIterations((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver0.doOptimize();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(0);
        int int13 = simplexSolver0.getMaxIterations();
        int int14 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver0.doOptimize();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(32);
        int int11 = simplexSolver1.getIterations();
        int int12 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.doOptimize();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        simplexSolver0.setMaxIterations(97);
        int int14 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver0.doOptimize();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1.0f);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) '#');
        simplexSolver1.setMaxIterations(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1L));
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        simplexSolver1.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.doOptimize();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair2 = simplexSolver1.doOptimize();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        simplexSolver1.setMaxIterations((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver1.doOptimize();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver0.doOptimize();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.doOptimize();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(100.0d);
        int int2 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair3 = simplexSolver1.doOptimize();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.doOptimize();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver0.doOptimize();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        simplexSolver0.setMaxIterations((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver0.doOptimize();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int5 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 97);
        simplexSolver1.setMaxIterations((int) '#');
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((-1));
        simplexSolver1.setMaxIterations((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int9 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1));
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(0);
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.doOptimize();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) '#');
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int11 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.doOptimize();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations((-1));
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations(52);
        simplexSolver0.setMaxIterations(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver0.doOptimize();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(32);
        int int7 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 0);
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations((int) '4');
        simplexSolver1.setMaxIterations((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations(52);
        simplexSolver0.setMaxIterations(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver0.doOptimize();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations((int) '#');
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int9 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 10);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver1.doOptimize();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int4 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver0.doOptimize();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int13 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.doOptimize();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int14 = simplexSolver1.getIterations();
        int int15 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver1.doOptimize();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int4 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver0.doOptimize();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((-1.0d));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver1.doOptimize();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) '4');
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver0.doOptimize();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int12 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int15 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver1.doOptimize();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        simplexSolver1.setMaxIterations(52);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations((-1));
        int int11 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.doOptimize();
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 0);
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations((int) '4');
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(1);
        simplexSolver0.setMaxIterations((-1));
        int int13 = simplexSolver0.getMaxIterations();
        int int14 = simplexSolver0.getMaxIterations();
        int int15 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver0.doOptimize();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.doOptimize();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(1);
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 97);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 52);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 97);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 10);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int7 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(1);
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int9 = simplexSolver1.getMaxIterations();
        int int10 = simplexSolver1.getIterations();
        int int11 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.doOptimize();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        simplexSolver0.setMaxIterations(0);
        int int16 = simplexSolver0.getMaxIterations();
        int int17 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = simplexSolver0.doOptimize();
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) '#');
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int11 = simplexSolver0.getIterations();
        int int12 = simplexSolver0.getMaxIterations();
        int int13 = simplexSolver0.getIterations();
        int int14 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = simplexSolver0.doOptimize();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 1);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        int int13 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        simplexSolver0.setMaxIterations(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver0.doOptimize();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) (short) 0);
        simplexSolver1.setMaxIterations(32);
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((-1));
        int int9 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver0.doOptimize();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((int) (byte) 10);
        int int9 = simplexSolver0.getMaxIterations();
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        simplexSolver0.setMaxIterations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver0.doOptimize();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(1);
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver0.doOptimize();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 0);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 10);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver0.doOptimize();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.doOptimize();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 0);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations((-1));
        simplexSolver1.setMaxIterations((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.doOptimize();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(97);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        int int9 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver0.doOptimize();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getIterations();
        int int10 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.doOptimize();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(1);
        int int11 = simplexSolver0.getIterations();
        int int12 = simplexSolver0.getIterations();
        int int13 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver0.doOptimize();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int5 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) '#');
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver0.doOptimize();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.doOptimize();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(1);
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        int int10 = simplexSolver1.getMaxIterations();
        int int11 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver1.doOptimize();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        int int6 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) 'a');
        simplexSolver1.setMaxIterations((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 97);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(35);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) 'a');
        int int10 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.doOptimize();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver0.doOptimize();
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(35);
        simplexSolver1.setMaxIterations((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.doOptimize();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 0);
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.doOptimize();
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver0.doOptimize();
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1L));
        simplexSolver1.setMaxIterations((int) (byte) 10);
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver1.doOptimize();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations(10);
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(35);
        int int12 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver0.doOptimize();
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 0);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver0.doOptimize();
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 0);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 100);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        simplexSolver1.setMaxIterations((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int10 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 1);
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int15 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver0.doOptimize();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1.0f);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int8 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        simplexSolver0.setMaxIterations((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver0.doOptimize();
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(1);
        int int6 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int9 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) ' ');
        int int10 = simplexSolver0.getIterations();
        int int11 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.doOptimize();
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(97);
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(32);
        simplexSolver1.setMaxIterations(10);
        simplexSolver1.setMaxIterations((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.doOptimize();
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int12 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver1.doOptimize();
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((int) (byte) 10);
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations(100);
        int int13 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver0.doOptimize();
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.doOptimize();
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver0.doOptimize();
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 10);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        int int9 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver1.doOptimize();
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        int int9 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int14 = simplexSolver1.getIterations();
        int int15 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver1.doOptimize();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '#');
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getIterations();
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        int int2 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair3 = simplexSolver1.doOptimize();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.doOptimize();
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(100.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int11 = simplexSolver0.getIterations();
        int int12 = simplexSolver0.getMaxIterations();
        int int13 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver0.doOptimize();
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver0.doOptimize();
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(52);
        int int11 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.doOptimize();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        simplexSolver1.setMaxIterations((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int8 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver1.doOptimize();
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(100);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        simplexSolver0.setMaxIterations(1);
        simplexSolver0.setMaxIterations((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = simplexSolver0.doOptimize();
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        simplexSolver1.setMaxIterations((-1));
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) ' ');
        int int7 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations((int) (byte) -1);
        int int12 = simplexSolver1.getIterations();
        int int13 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = simplexSolver1.doOptimize();
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver0.doOptimize();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) 0);
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 100);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int7 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver0.doOptimize();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (short) 1);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver0.doOptimize();
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (short) 1);
        simplexSolver0.setMaxIterations((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver0.doOptimize();
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(1);
        int int11 = simplexSolver0.getIterations();
        int int12 = simplexSolver0.getIterations();
        int int13 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) ' ');
        int int16 = simplexSolver0.getIterations();
        int int17 = simplexSolver0.getMaxIterations();
        int int18 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = simplexSolver0.doOptimize();
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations((int) '4');
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int8 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1));
        simplexSolver1.setMaxIterations(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver1.doOptimize();
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1.0f));
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) '#');
        int int6 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver1.doOptimize();
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 100);
        simplexSolver1.setMaxIterations((int) (byte) 0);
        simplexSolver1.setMaxIterations((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver(10.0d);
        simplexSolver1.setMaxIterations((int) (byte) 100);
        int int4 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(97);
        int int11 = simplexSolver1.getMaxIterations();
        int int12 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = simplexSolver1.doOptimize();
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) 1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        int int7 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 0);
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(35);
        int int11 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.doOptimize();
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (byte) -1);
        int int2 = simplexSolver1.getIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver1.doOptimize();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations(10);
        int int5 = simplexSolver0.getMaxIterations();
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver0.doOptimize();
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair7 = simplexSolver0.doOptimize();
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getMaxIterations();
        int int2 = simplexSolver0.getMaxIterations();
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(0);
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = simplexSolver0.doOptimize();
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 100.0f);
        int int2 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair5 = simplexSolver1.doOptimize();
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) -1);
        simplexSolver1.setMaxIterations(0);
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair6 = simplexSolver1.doOptimize();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 35);
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(1);
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int9 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = simplexSolver1.doOptimize();
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (-1));
        simplexSolver1.setMaxIterations((int) (short) 100);
        int int4 = simplexSolver1.getIterations();
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getIterations();
        int int7 = simplexSolver1.getIterations();
        int int8 = simplexSolver1.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = simplexSolver1.doOptimize();
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0L);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair4 = simplexSolver1.doOptimize();
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        int int3 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(100);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = simplexSolver0.doOptimize();
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations(10);
        simplexSolver0.setMaxIterations((int) (short) 1);
        simplexSolver0.setMaxIterations((int) ' ');
        simplexSolver0.setMaxIterations((int) 'a');
        int int11 = simplexSolver0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = simplexSolver0.doOptimize();
    }
}

