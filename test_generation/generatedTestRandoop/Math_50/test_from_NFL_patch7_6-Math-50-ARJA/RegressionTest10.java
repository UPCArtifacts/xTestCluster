import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.5d, 19.59375d, 40.6533203125d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, 51.875d, 15.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.9375d, (double) 0.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(37.5625d, 8.9765625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.26953125d + "'", double2 == 23.26953125d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(22.0d, 23.625d, 33.072265625d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 26.938720703125d, 19.515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 27.390625d, 28.375d, 3.0390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (short) 1, 3.0390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 27.0d, 22.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [27, 22.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 61.25d, 46.2890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [61.25, 46.289]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 32.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.25d + "'", double2 == 16.25d);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(23.625d, 17.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [23.625, 17.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 31.48046875d, 6.65625d, 8.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((double) '4', 0.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [52, 0.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 14.125d, (double) (short) -1, 27.390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 6.2470703125d, 7.8443603515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(18.72265625d, 10.1328125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.427734375d + "'", double2 == 14.427734375d);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(75.0d, 20.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [75, 20.531]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 28.1328125d, 28.87890625d, 17.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, (double) (byte) 10, 10.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 1.0f, 3.953125d, 22.775390625d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 42.69171142578125d, 25.1396484375d, 31.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.75d, 6.875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.3125d + "'", double2 == 11.3125d);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 73.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 9.19140625d, (double) 10.0f, 26.9765625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 8.1953125d, 15.251953125d, 45.3291015625d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(34.25d, 64.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.25d + "'", double2 == 49.25d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 12.0d, 23.44140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(29.7890625d, 53.0d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 12.775390625d, 12.75d, 12.8203125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 76.0d, 0.0d, 13.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 10.23828125d, 24.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 28.25d, 17.84375d, 13.40625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 33.2109375d, 17.125d, 27.4140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.78125d, 13.0625d, 15.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(27.0d, 12.625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [27, 12.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 28.84765625d, 5.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(11.34405517578125d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.672027587890625d + "'", double2 == 5.672027587890625d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 6.25d, 19.55078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(11.31640625d, 2.0d, 6.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [11.316, 2]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(26.0d, 8.78125d, 16.78125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(39.25d, 29.5390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.25, 29.539]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.89453125d, 41.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.697265625d + "'", double2 == 28.697265625d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 58.40625d, 21.50390625d, 21.375d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 9.0d, 36.351806640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(28.1328125d, 24.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.133, 24.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.5d, 22.875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.6875d + "'", double2 == 17.6875d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(15.5d, 28.375d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.265625d, 6.90625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.2470703125d, 22.0791015625d, 33.234375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 14.4375d, 8.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [14.438, 8.312]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(4.71875d, 0.6875d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [4.719, 0.688]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 42.69171142578125d, 21.375d, 26.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.5d, 25.1396484375d, 34.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '4', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 17.84375d, 19.59375d, 8.921875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 24.57666015625d, 19.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [24.577, 19.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 2.65625d, 37.5625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(3.71875d, (double) ' ');
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 18.61767578125d, 9.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.618, 9.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 3.0390625d, 28.306640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 28.84765625d, 9.453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.53125d, 42.69171142578125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.611480712890625d + "'", double2 == 21.611480712890625d);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 36.6875d, (-0.375d), (-0.3125d), allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.15625d), 62.21875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 14.375d, 38.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 65.8515625d, (-0.3125d), (-1.0d), allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.4375d, 3.92578125d, 73.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(18.34375d, 9.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.046875d + "'", double2 == 14.046875d);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(70.39453125d, 10.861328125d, 16.8125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.1875d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.59375d + "'", double2 == 0.59375d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 11.476638793945312d, 41.1015625d, (-0.15625d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 49.0d, 19.55078125d, 15.89453125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(31.0d, 15.3125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.15625d + "'", double2 == 23.15625d);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(14.11328125d, 45.03125d, 14.9765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [45.031, 14.977]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 25.22265625d, 45.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 9.03125d, 0.5d, 61.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.265625d, 44.578125d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 25.5d, 9.75d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(16.3359375d, 20.2421875d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(26.938720703125d, 0.0d, 39.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26.939, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 6.718902587890625d, 79.5390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 23.95166015625d, 23.44140625d, 64.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 14.875d, 46.2890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 7.0d, (-1.0d), 9.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(13.40625d, 17.51953125d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 12.306640625d, 31.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(19.765625d, 19.1138916015625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.43975830078125d + "'", double2 == 19.43975830078125d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(19.55078125d, 15.10546875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.551, 15.105]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 8.3125d, 49.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 59.078125d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [59.078, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 11.31640625d, 48.92578125d, 26.938720703125d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.970855712890625d, 14.15655517578125d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 18.0625d, 10.861328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(10.64892578125d, (double) 'a', 20.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [97, 20.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.8515625d, 56.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.17578125d + "'", double2 == 36.17578125d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 18.8759765625d, 54.30078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 21.611480712890625d, 6.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(11.476638793945312d, (-0.5d), 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) 100.0f, 11.476638793945312d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 11.477]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(9.3834228515625d, 13.0625d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 1.0d, 8.658203125d, 13.0625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 28.87890625d, 10.60546875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.970855712890625d, 14.15655517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) 0, 6.2470703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 27.4140625d, 55.203125d, 42.69171142578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 100.0d, 36.6875d, 4.71875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (byte) -1, 28.46875d, 48.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 24.4375d, 58.40625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 14.4375d, 10.60546875d, 20.8828125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) (byte) 10, 32.1328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.75d), 21.91015625d, 23.95166015625d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 15.3125d, 36.351806640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 24.57666015625d, 6.3125d, 49.5d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(21.578125d, 18.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [21.578, 18.375]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 11.2890625d, 33.2109375d, 5.672027587890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 12.5625d, 26.5d, 48.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(38.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.0d + "'", double2 == 24.0d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) (short) 10, 8.125d, 30.1533203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [10, 8.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.25d, 21.37744140625d, 6.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, (double) (-1L), 0.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(9.3834228515625d, 12.970855712890625d, 11.2890625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1.0d), 59.078125d, 9.453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.375d, 49.25d, 41.90625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.5625d, 12.8203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.64453125d, 16.875d, 32.375d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(52.75d, 28.306640625d, (-0.625d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 23.6328125d, 19.766845703125d, 59.078125d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.975830078125d, 79.5390625d, 28.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(34.09375d, 39.03125d, 5.4453125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 14.1256103515625d, 18.15625d, 7.25d, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(13.36749267578125d, 25.25d, 7.015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [25.25, 7.016]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.9140625d, 56.015625d, 29.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(29.515625d, 9.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.516, 9]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 58.40625d, 44.2578125d, 31.703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 65.8515625d, 9.03125d, 13.40625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) 100L, 49.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.5d + "'", double2 == 74.5d);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.672027587890625d, 8.6015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.3125d), 5.875d, 15.10546875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.78125d, 15.8515625d, 13.43780517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 32.2783203125d, (double) (byte) 0, 12.75d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(74.5d, 10.4541015625d, 20.8828125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(11.34405517578125d, 11.476638793945312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.410346984863281d + "'", double2 == 11.410346984863281d);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(12.5d, 37.04718017578125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.773590087890625d + "'", double2 == 24.773590087890625d);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(13.0625d, 43.4375d, 32.1328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [43.438, 32.133]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 0.59375d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, 39.69140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 8.8828125d, 8.78125d, 16.81640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 6.718902587890625d, 36.25d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 37.5625d, 37.5625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 11.30078125d, 22.0791015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(74.5d, 6.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [74.5, 6]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 39.53955078125d, 11.53125d, (double) 10.0f, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(10.60546875d, 2.4375d, 33.2109375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(24.5d, 12.75d, 8.125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.92041015625d, 6.718902587890625d, 6.875d, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(29.0625d, 42.0d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 12.8203125d, 32.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 24.57666015625d, 57.61328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.605712890625d, 25.375d, 57.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 5.23828125d, 17.658203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(8.9765625d, 10.4765625d, 26.1875d);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.265625d, 22.775390625d, 7.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 53.0d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(4.0078125d, 55.203125d, 21.37744140625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.5d, 8.0d, 2.4375d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 10.0f, (double) (-1.0f), 5.78155517578125d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(39.056640625d, 15.53125d, 18.65625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.057, 15.531]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 39.056640625d, 14.9765625d, 22.4453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 13.60546875d, 51.875d, 53.953125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 39.056640625d, (double) (-1L), 2.65625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 26.80908203125d, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 14.375d, 17.973785400390625d, 0.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 8.1953125d);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(30.1533203125d, 15.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [30.153, 15.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 37.5d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 25.22265625d, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [25.223, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 25.9375d, 23.32666015625d, 54.990234375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.5390625d, 21.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(26.5625d, 24.4375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [26.562, 24.438]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 9.72265625d, 33.072265625d, 17.84375d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 6.25d, 25.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.59375d, 57.84375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(14.427734375d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.7138671875d + "'", double2 == 6.7138671875d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(65.8515625d, 33.234375d, 78.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [65.852, 33.234]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 21.611480712890625d, 5.1875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(13.0625d, 6.5d, 37.04718017578125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 3.92578125d, 6.875d, 49.0d, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.775390625d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.775, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 24.59375d, 7.984375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(55.203125d, 10.60546875d, 39.056640625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 42.0d, 21.91015625d, 11.605712890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(3.78125d, 5.23828125d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 100.0d, 59.078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 59.078]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.7890625d, 57.0d, 21.845703125d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.25d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.25, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(6.90625d, 11.663330078125d, 16.3359375d);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, (-0.5d), 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, (-0.625d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3125d) + "'", double2 == (-0.3125d));
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(70.39453125d, 7.90625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [70.395, 7.906]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(24.773590087890625d, 7.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [24.774, 7.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, 6.0d, 31.9765625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(14.283203125d, 23.6328125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.9580078125d + "'", double2 == 18.9580078125d);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(3.92578125d, (-0.15625d), (-0.625d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [3.926, -0.156]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 23.26953125d, 11.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) '4', 23.44140625d, 19.1138916015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(18.25d, 11.3203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [18.25, 11.32]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(8.1953125d, (double) (short) 1, 2.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(28.7109375d, 1.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.23046875d + "'", double2 == 15.23046875d);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 64.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.125d + "'", double2 == 32.125d);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1L, 0.0d, 2.96875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(14.10186767578125d, 24.3828125d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 58.40625d, 48.4501953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(17.75d, 8.8828125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.31640625d + "'", double2 == 13.31640625d);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(27.0d, 13.0625d, 53.953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [27, 13.062]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 17.658203125d, 23.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.50030517578125d, 16.7890625d, 65.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(14.15655517578125d, 38.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.078277587890625d + "'", double2 == 26.078277587890625d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(7.0d, 21.37744140625d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 29.5390625d, 10.72265625d, 10.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 36.25d, 0.5d, 36.351806640625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(32.2783203125d, 6.859375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32.278, 6.859]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 25.9375d, 21.91015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.40625d, 8.1953125d, 5.78125d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 12.359375d, 5.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(15.89453125d, 22.775390625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.3349609375d + "'", double2 == 19.3349609375d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.5d, 29.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(16.78125d, (double) 10L, 7.203277587890625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 4.5d, 1.875d, 79.5390625d, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.25d, 0.0d, 6.3125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.4854278564453125d, 21.50390625d, 32.125d, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 5.875d, 31.03125d, 53.953125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(27.390625d, 16.015625d, 27.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [27.391, 16.016]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, 2.96875d, 58.2265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((double) (short) 0, 21.578125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.7890625d + "'", double2 == 10.7890625d);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.6875d, 6.9375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 8.78125d, 54.990234375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0d, 5.875d, 23.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 10.65625d, 38.0d, 9.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.25d, 9.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.25, 9]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(56.015625d, 2.65625d, 57.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [56.016, 2.656]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 26.0d, 18.382232666015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 16.875d, (-0.8125d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [16.875, -0.812]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.5791015625d, 56.75d, 25.25d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.625d, 5.1875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.625, 5.188]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) -1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 12.2509765625d, 9.453125d, 17.973785400390625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 18.375d, 16.8125d, (double) 10.0f, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 6.65625d, 5.78155517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 30.75d, 0.53125d, 7.984375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 19.921875d, 23.15625d, 22.640625d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(14.4375d, 18.822265625d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(12.53546142578125d, 22.640625d, 13.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [22.641, 13]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (double) 10.0f, 18.25d, 15.23046875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(9.875d, (-0.375d), 37.64453125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(9.375d, 31.0625d, 10.4541015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.062, 10.454]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.7890625d, 12.5d, 6.2470703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 0.0d, 28.84765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(39.056640625d, 29.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [39.057, 29.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 57.0d, 4.0078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(2.53125d, 6.25d, 46.2890625d);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 19.75d, 0.25d, 22.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(37.04718017578125d, 5.875d, 16.81640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [37.047, 5.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '4', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 9.19140625d, 24.125d, 49.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 12.359375d, 44.578125d, 15.375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (double) (short) -1, 11.2890625d, 49.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(70.39453125d, 18.382232666015625d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (short) 1, 23.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.453125d, 11.6875d, 36.17578125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(6.7138671875d, 56.75d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [56.75, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.0d, 5.0625d, 12.25d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 13.875d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [13.875, -1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 9.375d, 58.40625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 6.25d, 15.89453125d, 31.0625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 5.125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [5.125, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (byte) 0, 0.0d, 15.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) (short) 0, 20.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(8.6015625d, 17.265625d, 11.2890625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(51.875d, 48.0d, (-0.625d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 29.5d, 4.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, 28.7109375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 31.03125d, 32.2783203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.306640625d, 23.26953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 25.5d, 14.15655517578125d, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 29.0625d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 31.9765625d, (double) (short) 10, 61.23828125d, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.0283203125d, 33.42041015625d, 19.765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(1.875d, 78.5d, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((-0.75d), 12.5625d, 23.26953125d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.0283203125d, 51.875d, 31.0d, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 15.15625d, 17.203125d, 24.59375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 24.59375d, 31.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.3125d), 25.22265625d, 5.23828125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 0.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 32.375d, 0.0d, 13.3131103515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(13.31640625d, 28.84765625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.08203125d + "'", double2 == 21.08203125d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(8.0078125d, 24.125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.06640625d + "'", double2 == 16.06640625d);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 10.7890625d, 13.875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(38.0d, 9.3834228515625d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [38, 9.383]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(31.5390625d, 60.25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.89453125d + "'", double2 == 45.89453125d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 43.02734375d, 9.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [43.027, 9.125]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 73.0d, 0.0d, 24.125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 21.37744140625d, 12.53546142578125d, 18.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 8.0d, 0.0d, 10.4541015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(14.046875d, 45.89453125d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 1.0d, 32.5d, 10.60546875d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(19.1138916015625d, 19.55078125d);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 11.587890625d, 6.718902587890625d, 49.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 39.056640625d, 37.92041015625d, 9.453125d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(6.59375d, (double) (-1L), 28.7109375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(24.57666015625d, (double) 1.0f, 2.4375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 34.25d, 14.47705078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 62.21875d, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 24.3828125d, 28.7109375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 20.1412353515625d, 6.65625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [20.141, 6.656]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 30.3125d, 8.921875d, 21.625d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 34.09375d, 43.4375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(9.375d, 6.718902587890625d, 16.25d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(10.4541015625d, 33.2109375d, 11.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 11.31640625d, 34.125d, 60.25d, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 15.6875d, (double) 1L, 14.046875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (-1.0f), 5.672027587890625d, 7.0d, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(7.0625d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.03125d + "'", double2 == 4.03125d);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 7.90625d, 33.42041015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 14.875d, 10.791168212890625d, 12.970855712890625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.8125d), (double) (byte) 1, 11.476638793945312d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(2.96875d, 24.57666015625d, 19.766845703125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1), univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 26.0d, 30.3125d, (double) ' ', allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 5.1875d, (double) (-1L), 25.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 11.6875d, 15.8515625d, 23.625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 3.71875d, 6.25d, 10.0d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(6.90625d, 5.50030517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [6.906, 5.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, (double) 100.0f, 8.658203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [100, 8.658]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(37.64453125d, 49.5d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [49.5, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 25.22265625d, 1.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [25.223, 1.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(36.6875d, 0.0d, 10.72265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [36.688, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 14.11328125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.056640625d + "'", double2 == 7.056640625d);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(16.3359375d, 28.46875d, 25.22265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [28.469, 25.223]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 20.0283203125d, 45.3291015625d, 30.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 17.125d, 11.34405517578125d, 44.578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(31.9765625d, 56.75d, (-0.8125d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [56.75, -0.812]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(19.216796875d, 19.25d, 23.32666015625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.767730712890625d, 15.23046875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 4.0078125d, 19.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval((-0.15625d), 24.9765625d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 15.88916015625d, 30.1533203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(12.494140625d, 6.875d, 3.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.494, 6.875]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.015625d, 22.0d, 31.703125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 4.71875d, 37.04718017578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.68359375d, 100.0d, 11.2890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 15.23046875d, (double) '4', 11.75d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 14.375d, 5.1875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [14.375, 5.188]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(24.4375d, 16.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [24.438, 16.25]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(29.5d, 10.791168212890625d, 15.89453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.5, 10.791]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) ' ', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, 4.478515625d, (double) (byte) 1, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 36.351806640625d, 11.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(9.875d, 31.0625d);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) 'a', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 2.0d, 13.36749267578125d, 21.8515625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 0L, 0.0d, 15.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(17.6875d, 4.03125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.688, 4.031]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(18.61767578125d, 32.375d, 15.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [32.375, 15.75]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 36.351806640625d, 20.0283203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [36.352, 20.028]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(41.90625d, 21.625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [41.906, 21.625]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 10.0f, (double) 10, 26.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [10, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 7.015625d, 13.3131103515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.59375d, 11.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.594, 11.531]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 7.8443603515625d, 22.76953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(45.03125d, 32.2783203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [45.031, 32.278]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(13.8515625d, 15.375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.61328125d + "'", double2 == 14.61328125d);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 16.81640625d, 47.726715087890625d, 66.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 39.69140625d, 57.84375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence((double) 10.0f, 11.410346984863281d, 20.1875d);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.53125d, 0.0d, 13.0625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 22.5d, 0.0d, 6.65625d, 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(29.515625d, (double) '#');
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.375d, 31.4375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.90625d + "'", double2 == 15.90625d);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(12.25d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [12.25, 1]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 11.30078125d, 0.0d, 9.19140625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 43.4375d, 25.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(18.8759765625d, 24.4375d, 74.5d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(4.71875d, 2.4375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [4.719, 2.438]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, (-0.75d), 5.767730712890625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(5.0d, 11.30078125d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 3.953125d, 18.5885009765625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(53.953125d, 20.1328125d, 38.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(4.71875d, 31.9765625d);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0d, (double) (-1), 41.1015625d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.04718017578125d, 31.5390625d, 15.88916015625d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 21.625d, 6.3125d, 10.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 38.89453125d, 20.0283203125d, 6.25d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.0283203125d, 0.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.028, 0.531]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, 12.625d, 6.4854278564453125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 10.23828125d, 44.578125d, 10.0d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(7.0625d, 10.64892578125d, 34.4970703125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(42.69171142578125d, 11.30078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [42.692, 11.301]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '#', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 37.04718017578125d, (double) 100, 26.5d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(61.23828125d, 28.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [61.238, 28.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) '4', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 0.0d, (double) 0.0f, 17.84375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 20.5d, 6.718902587890625d, 5.0d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 3.953125d, (-0.8125d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [3.953, -0.812]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(25.9375d, 11.0006103515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [25.938, 11.001]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 31.03125d, 12.970855712890625d, 30.1533203125d, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(2.65625d, 25.1396484375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.89794921875d + "'", double2 == 13.89794921875d);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(79.5390625d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [79.539, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 10.7890625d, 7.107421875d, 19.765625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 26.5625d, 9.75d, 36.351806640625d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(21.513671875d, 24.773590087890625d, 28.375d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(29.0625d, 26.1875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.062, 26.188]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 16.015625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0078125d + "'", double2 == 8.0078125d);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.5390625d, 11.5d, 28.25d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(20.1875d, 6.4854278564453125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.336463928222656d + "'", double2 == 13.336463928222656d);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 10.4375d, 18.382232666015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 29.75d, 21.50390625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [29.75, 21.504]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.2470703125d, 27.75d, 15.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 12.494140625d, 40.6533203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 20.68359375d, 37.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(0.0d, 7.90625d, (-0.5d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(16.875d, 5.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.3125d + "'", double2 == 11.3125d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 9.19140625d, 0.0d, 19.921875d, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(1.578125d, 20.1328125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.85546875d + "'", double2 == 10.85546875d);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(11.975830078125d, 19.0283203125d);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 100, 26.80908203125d, 15.251953125d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 70.39453125d, (-0.8125d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [70.395, -0.812]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(17.0625d, 0.6875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.875d + "'", double2 == 8.875d);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 15.90625d, 0.6875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 20.2421875d, 20.0283203125d, 13.25d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(49.0d, 22.0d, 21.578125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(20.1328125d, 1.75d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.94140625d + "'", double2 == 10.94140625d);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(15.375d, 34.125d, 36.6875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 48.0d, 5.25d, 54.990234375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(25.9375d, 5.125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.53125d + "'", double2 == 15.53125d);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(10, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 13.0625d, 0.0d, 57.61328125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 13.8515625d, 5.75d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(42.0d, 14.125d, 34.4970703125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 18.1533203125d, 9.3834228515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 58.40625d, 12.5d, 18.65625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(48.92578125d, 13.8515625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.388671875d + "'", double2 == 31.388671875d);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 29.75d, 8.0d, 13.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.92578125d, 5.46875d, 29.515625d, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(2.75d, 17.00390625d, 30.75d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(11.2890625d, 7.056640625d, 27.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [11.289, 7.057]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(10.4375d, 10.861328125d);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(16.3359375d, 13.43780517578125d, 23.95166015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [16.336, 13.438]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 30.75d, 30.3125d, 3.92578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(5.875d, 22.5d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 33.2109375d, 33.072265625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 11.31640625d, 21.91015625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 5.25d);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(10.15625d, 0.59375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.375d + "'", double2 == 5.375d);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(15.10546875d, 20.1875d);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 19.0283203125d, 9.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(9.875d, 22.4453125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.16015625d + "'", double2 == 16.16015625d);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 28.46875d, 18.382232666015625d, 4.0078125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(34.09375d, 14.61328125d, 33.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [34.094, 14.613]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 2.4375d, 14.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (short) 100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 23.95166015625d, 6.640625d, 22.76953125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 6.2470703125d, 31.388671875d, 12.306640625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 31.0d, 5.46875d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 41.90625d, 11.5d, 5.375d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(31.388671875d, 18.65625d, 23.26953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [31.389, 18.656]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 27.75d, 13.8515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 5.50030517578125d, 13.0625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 8.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 22.775390625d, 13.43780517578125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(16.875d, 33.072265625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.9736328125d + "'", double2 == 24.9736328125d);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(100, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, (-0.375d), 6.25d, 44.578125d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(6.640625d, 17.51953125d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [17.52, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 34.25d, 73.0d, 19.515625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 6.65625d, 5.4453125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.6875d, 11.34405517578125d, 4.5d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [11.344, 4.5]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(univariateRealFunction0, 19.1138916015625d, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [19.114, 10]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 49.5d, 20.75d, 17.658203125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) 'a', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 5.767730712890625d, 5.46875d, (double) 10, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) (byte) 0, univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 61.23828125d, 15.6875d, 16.3359375d, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 8.8828125d, 34.125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(10.72265625d, 24.9736328125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.84814453125d + "'", double2 == 17.84814453125d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 25.375d, 14.10186767578125d, 17.51953125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (short) 1, 17.51953125d, 2.4375d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(18.822265625d, 0.53125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.6767578125d + "'", double2 == 9.6767578125d);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction1 = null;
        org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver<org.apache.commons.math.analysis.UnivariateRealFunction> univariateRealFunctionBracketedUnivariateRealSolver2 = null;
        org.apache.commons.math.analysis.solvers.AllowedSolution allowedSolution6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((int) 'a', univariateRealFunction1, univariateRealFunctionBracketedUnivariateRealSolver2, 62.21875d, (-0.5d), (double) 0L, allowedSolution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 10.23828125d, 0.53125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.1875d, 7.953125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.5703125d + "'", double2 == 6.5703125d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(univariateRealFunction0, 15.8515625d, 0.0d, 0.0d, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(0.0d, 18.955078125d, 27.375d);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(6.4854278564453125d, 9.375d);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(0.0d, 26.9765625d);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(38.0d, 8.658203125d, 6.15625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [38, 8.658]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(12.2509765625d, 17.265625d, 11.476638793945312d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(univariateRealFunction0, 17.973785400390625d, 15.688720703125d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(65.8515625d, 14.283203125d, 50.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [65.852, 14.283]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(62.21875d, 8.0078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.11328125d + "'", double2 == 35.11328125d);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence((double) (short) -1, 4.03125d, 62.21875d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(1.75d, 34.09375d, 24.125d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(5.23828125d, 28.697265625d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(8.15625d, 74.5d, 35.11328125d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [74.5, 35.113]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(8.875d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [8.875, 0]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(14.61328125d, 12.8203125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.716796875d + "'", double2 == 13.716796875d);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(univariateRealFunction0, 13.43780517578125d, 12.9140625d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: function");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(6.9375d, 41.1015625d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        double double2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(17.125d, 25.40625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.265625d + "'", double2 == 21.265625d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(46.3125d, 17.203125d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: endpoints do not specify an interval: [46.312, 17.203]");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        boolean boolean3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(56.75d, 31.0d, 12.5625d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

