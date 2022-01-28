import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(56.5d, 27.2890625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.89453125d + "'", double2 == 41.89453125d);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 22.775390625d, 23.15625d, 31.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 25.1396484375d, 5.78155517578125d, 65.8515625d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(30.75d, 31.388671875d, 18.955078125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 1, 7.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.0d, 6.875d, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(24.59375d, 16.015625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.3046875d + "'", double2 == 20.3046875d);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2.4375d, 3.0390625d, 66.0d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.6875d, 51.33642578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(7.25d, 13.3131103515625d, 6.65625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [13.313, 6.656]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(57.84375d, 10.85546875d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((-0.75d), 15.375d);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 24.5d, 33.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 10.1328125d, 9.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 36.17578125d, 9.19140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 74.5d, 39.69140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 14.1256103515625d, 31.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 21.408203125d, 17.203125d, 17.84814453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 22.5703125d, 31.5390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 24.57666015625d, 30.125d, 31.0625d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 2.75d, 21.828125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.265625d, 17.4921875d, 23.6328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(33.53125d, 20.0283203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [33.531, 20.028]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(33.42041015625d, 29.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.585205078125d + "'", double2 == 31.585205078125d);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.625d), 6.0d, 76.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(28.375d, 58.53125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43.453125d + "'", double2 == 43.453125d);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 57.84375d, 10.94140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 16.78125d, 12.625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 33.072265625d, 53.0d, 15.89453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 10.9375d, 28.84765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.609375d, 3.71875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.609, 3.719]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.7890625d, 39.056640625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) 'a', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.64892578125d, 10.65625d, 15.571365356445312d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.970855712890625d, 33.42041015625d);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.5625d, 39.53955078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.051025390625d + "'", double2 == 26.051025390625d);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 24.9736328125d, 24.9736328125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(19.75d, 31.5390625d);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 25.22265625d, 36.6875d, 21.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 46.2890625d, 4.0078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [46.289, 4.008]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(12.515625d, 31.4375d, 12.306640625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 65.8515625d, 53.953125d, 17.4921875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.0d, 23.15625d, 36.351806640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 26.8232421875d, 44.578125d, 32.625d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.6875d, 11.0006103515625d, 16.42413330078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(17.8916015625d, 28.306640625d, 16.42413330078125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 11.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(10.0d, 36.351806640625d, 18.955078125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 23.32666015625d, 21.265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [23.327, 21.266]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(18.0625d, 13.336463928222656d, 5.767730712890625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.90625d, 8.658203125d, 54.990234375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-1.0d), 16.81640625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.908203125d + "'", double2 == 7.908203125d);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 57.0625d, 17.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(44.578125d, 22.76953125d, 28.697265625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 16.92578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.9375d, 16.295318603515625d, 5.672027587890625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 28.7109375d, 48.92578125d, 62.21875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 27.375d, 10.875d, 31.585205078125d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(25.22265625d, 13.336463928222656d, 39.056640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [25.223, 13.336]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 18.5885009765625d, 8.9765625d, 28.87890625d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 26.5625d, 79.5390625d, 0.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.25d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [0.25, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(13.298828125d, 15.375d, 12.53546142578125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.75d), 45.03125d, 11.84375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(11.6875d, (-0.25d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [11.688, -0.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 10.4375d, 8.658203125d, (-0.3125d), 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(45.03125d, 42.0d, 28.87890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [45.031, 42]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.306640625d, 59.03125d, 8.0078125d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(10.9375d, 9.3834228515625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.16046142578125d + "'", double2 == 10.16046142578125d);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.84375d, 15.10546875d, 10.72265625d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 10.861328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 13.2578125d, 12.306640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 30.0d, 10.875d, 28.7109375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(39.03125d, 29.75d, 22.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) 0.0f, 8.9765625d, 16.78125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(34.09375d, 6.718902587890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [34.094, 6.719]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 14.283203125d, 30.125d, 17.84375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 6.15625d, 33.42041015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(18.146484375d, 10.23828125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.1923828125d + "'", double2 == 14.1923828125d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 26.5d, 44.2578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(37.5625d, 12.306640625d, (-0.625d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(2.53125d, 9.75d, 7.785682678222656d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [9.75, 7.786]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (short) 100, 23.625d, 10.84375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.88916015625d, 17.125d, 11.078125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 37.92041015625d, 44.578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(7.015625d, 17.84814453125d, 4.94140625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 3.953125d, 4.0d, 40.6533203125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 41.89453125d, 1.578125d, 59.078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 26.5625d, 7.0625d, 18.955078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(5.78155517578125d, 36.6875d, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(17.4921875d, 51.875d, 32.2783203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [51.875, 32.278]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 36.17578125d, 11.2890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [36.176, 11.289]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(47.726715087890625d, 11.916015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [47.727, 11.916]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(22.5625d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [22.562, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 32.6015625d, 12.0d, 11.605712890625d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(14.875d, 5.4453125d, 12.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(22.76953125d, 56.5d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [56.5, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 48.4501953125d, 19.0283203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 4.0078125d, 29.7890625d, 6.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 14.1256103515625d, 10.675491333007812d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [14.126, 10.675]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 28.5d, 21.408203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(8.0d, 17.00390625d, 24.125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(19.921875d, 31.48046875d);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(39.03125d, 37.04718017578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.031, 37.047]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 35.11328125d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.2578125d, 18.146484375d, 49.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.0d, 9.03125d, 22.640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 6.7138671875d, 54.990234375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.953125d, 61.25d, 0.25d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 68.78125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 4.0d, 49.5d, 0.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 23.6328125d, 28.697265625d, 28.84765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.2509765625d, 24.3828125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.31689453125d + "'", double2 == 18.31689453125d);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (byte) 1, 15.3125d, 8.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 25.5d, 54.990234375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.171142578125d, (-0.5d), 17.265625d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.134765625d, 12.53546142578125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 10.4541015625d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [10.454, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 48.4501953125d, 20.3046875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [48.45, 20.305]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 11.3203125d, 29.0625d, 22.5703125d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 17.00390625d, 30.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 10L, (double) 0.0f, 19.55078125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 26.9765625d, 0.6875d, 10.675491333007812d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 15.5d, 41.89453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.3359375d, 22.76953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 39.03125d, 18.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 0.0f, 20.8828125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.44140625d + "'", double2 == 10.44140625d);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(20.0283203125d, 5.78155517578125d, 10.9375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(26.938720703125d, 41.89453125d, 24.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [41.895, 24.977]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(19.0283203125d, 15.15625d, 13.76953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.028, 15.156]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((-0.75d), 1.0625d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(36.6875d, 10.861328125d, 48.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [36.688, 10.861]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 32.125d, 13.36749267578125d, 28.375d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(27.390625d, 47.726715087890625d, 22.4453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [47.727, 22.445]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.51416015625d, 0.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 26.0d, 21.408203125d, 10.94140625d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.652053833007812d, 11.75d, (-0.25d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.515625d, 28.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.822265625d, 0.0d, 6.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 20.32666015625d, 10.1328125d, 0.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((-0.3125d), 7.953125d, 12.515625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(8.0078125d, 12.51416015625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.260986328125d + "'", double2 == 10.260986328125d);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.15625d, 7.0625d, 28.46875d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 57.0d, 8.15625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 32.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 46.3125d, 9.6767578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [46.312, 9.677]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(29.5390625d, 9.875d, 5.9375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(12.51416015625d, 16.81640625d, 10.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [16.816, 10.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) '4', 61.23828125d, 36.25d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(10.4765625d, 11.31640625d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(11.916015625d, 13.8515625d, 25.22265625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) 1L, 7.25d);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(79.5390625d, 21.50390625d, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 31.0625d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.062, 5.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 33.234375d, 5.875d, 10.44140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(23.26953125d, 14.9765625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.123046875d + "'", double2 == 19.123046875d);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 39.056640625d, 36.6875d, 39.03125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 15.23046875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.615234375d + "'", double2 == 7.615234375d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.672027587890625d, 14.15655517578125d, 4.478515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(20.3046875d, 8.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [20.305, 8.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 54.990234375d, 5.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 10.84375d, 31.48046875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.515625d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(15.3125d, 18.220703125d, 24.125d);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 17.5791015625d, 6.640625d, 8.78125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(16.8125d, 14.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [16.812, 14.977]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 35.9566650390625d, 15.251953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 19.75d, 11.30078125d, (double) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(7.056640625d, (double) '#', 10.260986328125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.375d, 16.203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(20.53125d, 7.134765625d, 8.3125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.5d, 10.791168212890625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.645584106445312d + "'", double2 == 11.645584106445312d);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 8.921875d, 7.785682678222656d, 28.1328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.6875d, 21.845703125d, 18.146484375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 39.056640625d, 6.718902587890625d, 31.48046875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(18.1533203125d, 28.1328125d, 7.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.133, 7.016]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(18.9580078125d, 7.0d, 1.375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(41.90625d, 12.625d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [41.906, 12.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(13.0625d, 6.25d, 12.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.125d, 27.375d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(10.15625d, 29.515625d, 4.0078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.516, 4.008]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(16.015625d, 26.078277587890625d);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(9.03125d, 8.78125d, 5.125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.125d, 24.9736328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(7.203277587890625d, (-0.625d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2891387939453125d + "'", double2 == 3.2891387939453125d);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(18.31689453125d, 10.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.317, 10.156]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 52.75d, 13.652053833007812d, 18.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(44.2578125d, 15.688720703125d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [44.258, 15.689]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(8.15625d, 0.0d, 22.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [8.156, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) 1, 4.478515625d);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.375d), 0.0d, 11.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 32.5d, 6.859375d, 19.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 13.8515625d, 24.773590087890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(36.6875d, 23.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [36.688, 23.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 8.8828125d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 28.306640625d, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 36.25d, 29.5d, 6.859375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 43.453125d, 20.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(21.265625d, 41.5d);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(14.11328125d, 12.609375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [14.113, 12.609]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(27.390625d, 11.476638793945312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.433631896972656d + "'", double2 == 19.433631896972656d);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(28.36328125d, 14.1256103515625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.24444580078125d + "'", double2 == 21.24444580078125d);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(22.5703125d, 13.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [22.57, 13.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.53125d, 7.615234375d, 43.0390625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 10.44140625d, 6.718902587890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(5.78125d, 29.0d, 18.955078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29, 18.955]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, 15.571365356445312d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 10L, 15.17333984375d, 28.375d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(11.410346984863281d, 28.46875d, 6.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(30.125d, 0.0d, 20.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [30.125, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(11.22265625d, 12.15625d, 21.828125d);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 11.2890625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [11.289, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 41.1015625d, 19.433631896972656d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 41.90625d, 1.375d, 1.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(20.1875d, (double) '#', 28.306640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [35, 28.307]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 44.2578125d, 19.123046875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.515625d, 11.30078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.516, 11.301]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.75d, 33.2109375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.5d, 8.875d, 8.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 11.3203125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [11.32, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 0.0f, 11.645584106445312d, 3.2891387939453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.16046142578125d, 15.688720703125d, 47.726715087890625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(8.15625d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.078125d + "'", double2 == 4.078125d);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(10.23828125d, 21.08203125d);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(22.4453125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [22.445, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.10546875d, 4.94140625d, 21.845703125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 26.9765625d, 10.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26.977, 10.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(8.78125d, 19.453125d);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(62.21875d, 22.5d, 22.640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [62.219, 22.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 6.875d, 29.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(22.4453125d, 41.5d, 13.2578125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 26.078277587890625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(52.75d, 55.203125d, 11.84375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [55.203, 11.844]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 29.7890625d, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 18.382232666015625d, 20.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.15625d), 27.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 13.40625d, 14.283203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(19.921875d, 19.75d, 7.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 32.6015625d, 11.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 28.46875d, 21.408203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 56.5d, 14.61328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 48.92578125d, 15.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(20.0283203125d, 7.056640625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.54248046875d + "'", double2 == 13.54248046875d);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(7.953125d, (double) (byte) -1, 20.68359375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.84375d, 19.75d, 21.625d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.25d, 62.21875d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2.96875d, 8.1953125d, 6.65625d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 18.0625d, 34.25d, 48.92578125d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.5791015625d, 12.625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.579, 12.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(20.1875d, (-0.625d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [20.188, -0.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.672027587890625d, 15.5d, 17.8916015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.43780517578125d, 59.03125d, 18.31689453125d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(7.0d, (double) 10L, 43.02734375d);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 10.94140625d, 19.453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.298828125d, 30.75d, 17.265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.0d, 68.78125d, 7.953125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 38.89453125d, 35.9566650390625d, 33.42041015625d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.766845703125d, 12.359375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.767, 12.359]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(5.78125d, 32.5d);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((-0.625d), 14.875d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.10546875d, 61.25d, 58.40625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.571365356445312d, 10.675491333007812d, 6.15625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 28.84765625d, 12.359375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 6.718902587890625d, 66.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(8.3125d, 66.0d, (-0.625d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [66, -0.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 23.32666015625d, 29.875d, 16.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 10.9375d, 6.90625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 43.4375d, 31.9765625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.40625d, 13.298828125d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.5d, 22.5625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 40.05859375d, 29.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 18.0625d, 0.0d, 18.15625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 73.0d, 21.50390625d, 11.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(48.0d, 39.056640625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43.5283203125d + "'", double2 == 43.5283203125d);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(6.5703125d, (double) (-1), 9.3834228515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [6.57, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(44.2578125d, 100.0d, 31.388671875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(8.1953125d, 10.7890625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.4921875d + "'", double2 == 9.4921875d);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 37.5625d, 29.515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 0.0f, 13.3131103515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, 5.875d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.921875d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 4.078125d);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 7.0625d, 5.75d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 34.4970703125d, 25.009765625d, 7.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.791168212890625d, 8.78125d, 16.42413330078125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.625d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.625, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 35.11328125d, 41.90625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.6875d, 19.25d, 16.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 76.0d, 16.81640625d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 27.0d, 12.15625d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(31.0625d, 18.34375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.703125d + "'", double2 == 24.703125d);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) ' ', 73.0d, 14.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 8.875d, 14.125d, 27.4140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.53546142578125d, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.535, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.8203125d, 11.30078125d, 12.775390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 26.938720703125d, 7.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26.939, 7.016]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 10L, 59.03125d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [59.031, 52]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-0.75d), 44.2578125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.75390625d + "'", double2 == 21.75390625d);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(7.615234375d, 24.0d, 54.990234375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 13.40625d, 18.9580078125d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 13.36749267578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.203125d, 45.03125d, 13.3131103515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(2.0d, 16.295318603515625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.147659301757812d + "'", double2 == 9.147659301757812d);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 100.0d, 13.3131103515625d, 32.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.658203125d, 11.30078125d, 43.4375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.587890625d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.78155517578125d, 14.283203125d, 34.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 49.0d, 5.25d, 8.78125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 5.0d, 32.6015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 10L, 10.60546875d, 1.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [10.605, 1.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 4.478515625d, (-0.15625d), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 37.64453125d, 56.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.25d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.25, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 33.2109375d, 20.75d, (double) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 1.75d, 6.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.23828125d, 40.4375d, 7.984375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(100.0d, 41.89453125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 70.947265625d + "'", double2 == 70.947265625d);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 31.4375d, 34.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 14.0d, 43.0390625d, 7.203277587890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.984375d, 9.0d, 19.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(29.0625d, 9.375d, 48.4501953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.062, 9.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(21.265625d, 19.1138916015625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.18975830078125d + "'", double2 == 20.18975830078125d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 14.1256103515625d, 18.220703125d, 20.32666015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 28.375d, 21.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.375, 21.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 24.9765625d, 10.260986328125d, 5.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.336463928222656d, 23.125d, 10.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(9.03125d, 11.052734375d, 57.84375d);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 14.1256103515625d, 9.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(39.53955078125d, 14.4375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.54, 14.438]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(24.703125d, 6.859375d, 16.42413330078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [24.703, 6.859]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 46.3125d, 11.078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [46.312, 11.078]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0625d, 22.4453125d, 28.36328125d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 25.9375d, 17.171142578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 15.89453125d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 29.0d, 2.0d, 23.6328125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 45.03125d, (-0.15625d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.975830078125d, 0.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 11.6875d, 3.92578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 12.53546142578125d, 34.09375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(31.0625d, 18.822265625d, 37.64453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.062, 18.822]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 17.07666015625d, 60.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(1.75d, (double) 1.0f, 12.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(25.009765625d, 20.3046875d, 8.658203125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 76.0d, 8.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(17.125d, 18.8759765625d, 9.453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.876, 9.453]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, 29.0625d, 10.64892578125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 4.71875d, 56.5d, 36.17578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.515625d, 9.19140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(5.4453125d, 0.0d, 5.1875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.53546142578125d, 9.55517578125d, 28.84765625d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 100L, 2.0d, 59.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) (byte) 100, 6.5703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) 'a', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.88916015625d, 1.0d, 0.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(13.76953125d, 17.84375d, 6.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.844, 6.156]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 43.453125d, 10.1328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 7.203277587890625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(9.453125d, 51.875d, (-0.15625d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [51.875, -0.156]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 45.3291015625d, 5.25d, 9.147659301757812d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 4.94140625d, 4.71875d, 5.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 74.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 27.4140625d, 9.6767578125d, 2.96875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(4.478515625d, 9.72265625d);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 28.7109375d, 6.7138671875d, 11.078125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) 0L, 11.3203125d, 44.2578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 73.0d, 28.87890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [73, 28.879]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(27.4140625d, 38.89453125d);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(10.64892578125d, 17.171142578125d, 5.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.171, 5.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 13.43780517578125d, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.32666015625d, 10.9375d, 10.84375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2.75d, 24.57666015625d, 18.65625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 10.60546875d, 58.40625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(10.7890625d, 17.658203125d);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 11.30078125d, 41.89453125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(7.785682678222656d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.892841339111328d + "'", double2 == 3.892841339111328d);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 8.1953125d, 33.2109375d, 24.773590087890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.5d, (double) 100L, 32.2783203125d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 10, 30.1533203125d, 8.9765625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 8.9765625d, 6.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [8.977, 6.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.203277587890625d, 43.5283203125d, 27.4140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 14.1923828125d, 15.10546875d, 18.8759765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 43.453125d, 26.750152587890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.921875d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(18.146484375d, (double) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 2.4375d);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 59.078125d, 3.71875d, 12.494140625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.75d, 4.0078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.87890625d + "'", double2 == 9.87890625d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.9375d, 11.84375d, 5.767730712890625d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 52.75d, 19.765625d, 17.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 9.4921875d, 17.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 0.0d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.298828125d, (-0.25d), 1.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 64.25d, 18.489334106445312d, 62.21875d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1.0d), 25.22265625d, 9.3834228515625d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 23.6328125d, 17.973785400390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 28.87890625d, 23.48828125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(26.078277587890625d, 17.171142578125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.624710083007812d + "'", double2 == 21.624710083007812d);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 41.5d, 14.375d, 16.16015625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.3131103515625d, 5.78125d, 33.42041015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 50.0d, 20.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 9.875d, 6.640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) ' ', 19.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.625d + "'", double2 == 25.625d);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(28.1328125d, 22.4453125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.133, 22.445]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(79.5390625d, 43.02734375d, 19.123046875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.609375d, 8.0078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.30859375d + "'", double2 == 10.30859375d);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(38.89453125d, 28.5d, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [38.895, 28.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 15.375d, 5.125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(46.3125d, 12.53546142578125d, 17.171142578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [46.312, 12.535]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 37.578125d, 56.75d, 3.78125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 9.55517578125d, 13.31640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 22.76953125d, 6.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [22.77, 6.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (short) -1, 47.726715087890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 23.01953125d, 37.64453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '4', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 25.009765625d, 12.51416015625d, 28.87890625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 15.89453125d, 9.0d, 25.1396484375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 4.71875d, 5.23828125d, 10.7890625d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.34375d, 34.09375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 14.125d, 5.375d, 16.78125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 7.0625d, 11.75d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 16.78125d, 7.056640625d, 0.25d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(7.056640625d, 7.90625d, 19.766845703125d);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(39.056640625d, 15.6875d, 25.625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(20.32666015625d, 9.55517578125d, 15.17333984375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [20.327, 9.555]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 9.0d, 14.15655517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(13.716796875d, (double) 10.0f, 31.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [13.717, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(10.861328125d, 21.08203125d);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 7.134765625d, 19.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(3.892841339111328d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [3.893, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 34.125d, 9.03125d, 12.515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 13.336463928222656d, 41.1015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 22.5703125d, 25.375d, 45.03125d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 20.0283203125d, 73.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 16.295318603515625d, 45.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.3203125d, 30.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.1412353515625d, 33.2109375d, 16.06640625d, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 41.89453125d, 23.15625d, 25.40625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) 0L, 7.615234375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, 62.21875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(16.203125d, 21.845703125d, 14.11328125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 33.258056640625d, 2.96875d, 11.30078125d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(13.875d, 5.875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.875d + "'", double2 == 9.875d);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.15625d, 27.375d, 3.2891387939453125d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(8.0078125d, 52.75d);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(26.8232421875d, 4.0078125d, 31.03125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(23.26953125d, 9.4921875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.380859375d + "'", double2 == 16.380859375d);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 26.5d, 17.84375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 23.48828125d, 5.5d, 29.875d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 37.04718017578125d, 10.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [37.047, 10.938]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.06640625d, 0.0d, 7.785682678222656d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(42.0d, 0.53125d, 26.051025390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [42, 0.531]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(55.203125d, 12.2509765625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.72705078125d + "'", double2 == 33.72705078125d);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(43.5283203125d, 1.375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.45166015625d + "'", double2 == 22.45166015625d);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 17.84814453125d, 28.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.75d, 55.203125d, 5.375d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(15.375d, 17.6875d);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 9.55517578125d, 14.427734375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(58.40625d, 33.234375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.8203125d + "'", double2 == 45.8203125d);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 37.578125d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 10.60546875d, 11.916015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(13.76953125d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.884765625d + "'", double2 == 6.884765625d);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.15625d, (double) (-1L), 19.515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 18.31689453125d, 53.0d, 9.6767578125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.51953125d, 0.0d, 24.9736328125d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(40.4375d, 41.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.96875d + "'", double2 == 40.96875d);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 24.3828125d, 2.0d, 22.45166015625d, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(14.1256103515625d, 10.260986328125d, 33.2109375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [14.126, 10.261]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 14.11328125d, 28.1328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 13.60546875d, 45.3291015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 50.0d, 5.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [50, 5.938]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 1.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 3.2891387939453125d, 18.65625d, 29.5390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(19.25d, 11.645584106445312d, 18.15625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 21.50390625d, 20.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 34.25d, 12.53546142578125d, 13.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 10.791168212890625d, 5.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [10.791, 5.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 2.4375d, 43.5283203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 7.0625d, 6.0d, 57.0625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.5d, 13.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.375d + "'", double2 == 14.375d);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(13.43780517578125d, 59.078125d, 35.9566650390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [59.078, 35.957]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(5.875d, 7.90625d, 13.298828125d);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 7.953125d, 27.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 15.688720703125d, 14.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 62.21875d, 33.42041015625d, 14.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 22.775390625d, 18.382232666015625d, 13.40625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(10.675491333007812d, 17.4921875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.083839416503906d + "'", double2 == 14.083839416503906d);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 19.123046875d, 22.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 13.89794921875d, 40.05859375d, 17.84375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(16.92578125d, 5.75d, 28.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 26.0d, 0.0d, 10.4541015625d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 13.336463928222656d, 25.1396484375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.125d, 22.4453125d, 6.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 49.5d, 22.0791015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 7.785682678222656d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [7.786, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 16.06640625d, (-0.5d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [16.066, -0.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.203125d, 8.0078125d, 41.90625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.875d, 3.78125d, 9.6767578125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 53.0d, 31.585205078125d, 6.884765625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 44.578125d, 6.640625d, 1.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 22.4453125d, 18.382232666015625d, 26.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((-0.375d), 52.75d, 29.515625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) ' ', 15.5d, 5.4453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(13.0d, 14.4375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.71875d + "'", double2 == 13.71875d);
    }
}

