import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((double) 52, (int) '#');
        int int3 = simplexSolver2.getMaxIterations();
        simplexSolver2.setMaxIterations(0);
        simplexSolver2.setMaxIterations(1);
        int int8 = simplexSolver2.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = simplexSolver2.doOptimize();
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver2 = new org.apache.commons.math3.optimization.linear.SimplexSolver((-1.0d), (int) '#');
        simplexSolver2.setMaxIterations(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = simplexSolver2.doOptimize();
    }
}

